package com.liferay.portal.cluster.eureka;

import com.liferay.portal.cluster.AddressImpl;
import com.liferay.portal.cluster.BaseReceiver;
import com.liferay.portal.kernel.cluster.Address;
import com.liferay.portal.kernel.io.Serializer;
import com.liferay.portal.kernel.util.*;
import com.liferay.portal.util.PropsValues;
import org.jgroups.JChannel;
import org.jgroups.Receiver;
import org.jgroups.View;
import org.jgroups.protocols.*;
import org.jgroups.protocols.pbcast.GMS;
import org.jgroups.protocols.pbcast.NAKACK2;
import org.jgroups.protocols.pbcast.STABLE;
import org.jgroups.protocols.pbcast.STATE_TRANSFER;
import org.jgroups.stack.Protocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class EurekaClusterBase {


    public static final String CONTROL_CHANNEL_SUFFIX = "_control";

    public void afterPropertiesSet() {
        if (!isEnabled()) {
            return;
        }

        if (!_initialized) {
            initSystemProperties();

            try {
                initBindAddress();
            } catch (Exception e) {
                if (_log.isWarnEnabled()) {
                    _log.warn("Failed to initialize outgoing IP address", e);
                }
            }

            _initialized = true;
        }

        try {
            initChannels();
        } catch (Exception e) {
            if (_log.isErrorEnabled()) {
                _log.error("Unable to initialize channels", e);
            }

            throw new IllegalStateException(e);
        }
    }

    public abstract void destroy();

    public boolean isEnabled() {
        return discoveryClient != null && registration != null && instanceId != null;
    }

    protected void sendJGroupsMessage(
            JChannel jChannel, org.jgroups.Address destAddress,
            Serializable serializable)
            throws Exception {

        Serializer serializer = new Serializer();

        serializer.writeObject(serializable);

        ByteBuffer byteBuffer = serializer.toByteBuffer();

        jChannel.send(
                destAddress, byteBuffer.array(), byteBuffer.position(),
                byteBuffer.remaining());

        if (_log.isDebugEnabled()) {
            _log.debug("Send message " + serializable);
        }
    }

    protected JChannel createJChannel(
            String properties, Receiver receiver, String clusterName)
            throws Exception {

        JChannel jChannel = new JChannel(properties);

        jChannel.setReceiver(receiver);

        jChannel.connect(clusterName);

        if (_log.isInfoEnabled()) {
            _log.info(
                    "Create a new channel with properties " +
                            jChannel.getProperties());
        }

        return jChannel;
    }

    protected JChannel createJChannel(Receiver receiver, boolean isTransport)
            throws Exception {

        String clusterName = isTransport ? registration.getServiceId() : registration.getServiceId() + CONTROL_CHANNEL_SUFFIX;

        int port = isTransport ? serverPort +1 : serverPort+2;

        List<Protocol> protocols = new ArrayList<>();
        TCP tcp = new TCP();
        tcp.setBindPort(port).setPortRange(50).setBindAddress(bindInetAddress);

        protocols.add(tcp);
        protocols.add(new EUREKA_PING(discoveryClient));
        protocols.add(new MERGE3().setMinInterval(3000).setMaxInterval(30000));
        protocols.add(new FD_SOCK());

        FD fd = new FD();
        fd.setTimeout(3000);
        fd.setMaxTries(3);
        protocols.add(fd);

        protocols.add(new VERIFY_SUSPECT());
        protocols.add(new BARRIER());


        NAKACK2 nakack2 = new NAKACK2();
        nakack2.setDiscardDeliveredMsgs(true);
        nakack2.setUseMcastXmit(false);
        protocols.add(nakack2);

        protocols.add(new UNICAST3());

        STABLE stable = new STABLE();
        stable.setMaxBytes(400000);
        protocols.add(stable);

        GMS gms = new GMS();
        gms.setPrintLocalAddr(true);
        gms.setJoinTimeout(3000);
        gms.setMaxJoinAttempts(3);
        gms.setViewBundling(true);
        protocols.add(gms);

        UFC ufc = new UFC();
        ufc.setMaxCredits(1024 * 1024 * 2);
        ufc.setMinThreshold(0.4f);
        protocols.add(ufc);

        MFC mfc = new MFC();
        mfc.setMaxCredits(1024 * 1024 * 2);
        mfc.setMinThreshold(0.4f);
        protocols.add(mfc);

        FRAG2 frag2 = new FRAG2();
        frag2.setFragSize(1024 * 60);
        protocols.add(frag2);

        protocols.add(new STATE_TRANSFER());

        JChannel jChannel = new JChannel(protocols);

        jChannel.setReceiver(receiver);

        jChannel.connect(clusterName);

        if (_log.isInfoEnabled()) {
            _log.info(
                    "Create a new channel with properties " +
                            jChannel.getProperties());
            _log.info(
                    "JChannel address " +
                            jChannel.getAddress().toString());
        }

        return jChannel;
    }

    protected List<Address> getAddresses(JChannel channel) {
        BaseReceiver baseReceiver = (BaseReceiver) channel.getReceiver();

        View view = baseReceiver.getView();

        List<org.jgroups.Address> jGroupsAddresses = view.getMembers();

        if (jGroupsAddresses == null) {
            return Collections.emptyList();
        }

        List<Address> addresses = new ArrayList<Address>(
                jGroupsAddresses.size());

        for (org.jgroups.Address jgroupsAddress : jGroupsAddresses) {
            addresses.add(new AddressImpl(jgroupsAddress));
        }

        return addresses;
    }

    protected void initBindAddress() throws Exception {
        String autodetectAddress = PropsValues.CLUSTER_LINK_AUTODETECT_ADDRESS;

        if (Validator.isNull(autodetectAddress)) {
            bindInetAddress = InetAddressUtil.getLocalInetAddress();

            return;
        }

        String host = autodetectAddress;
        int port = 80;

        int index = autodetectAddress.indexOf(CharPool.COLON);

        if (index != -1) {
            host = autodetectAddress.substring(0, index);
            port = GetterUtil.getInteger(
                    autodetectAddress.substring(index + 1), port);
        }

        if (_log.isInfoEnabled()) {
            _log.info(
                    "Autodetecting JGroups outgoing IP address and interface for " +
                            host + ":" + port);
        }

        SocketUtil.BindInfo bindInfo = SocketUtil.getBindInfo(host, port);

        bindInetAddress = bindInfo.getInetAddress();
        NetworkInterface networkInterface = bindInfo.getNetworkInterface();

        System.setProperty(
                "jgroups.bind_addr", bindInetAddress.getHostAddress());
        System.setProperty(
                "jgroups.bind_interface", networkInterface.getName());

        if (_log.isInfoEnabled()) {
            _log.info(
                    "Setting JGroups outgoing IP address to " +
                            bindInetAddress.getHostAddress() + " and interface to " +
                            networkInterface.getName());
        }
    }

    protected abstract void initChannels() throws Exception;

    protected void initSystemProperties() {
        for (String systemProperty : PropsValues.CLUSTER_LINK_CHANNEL_SYSTEM_PROPERTIES) {

            int index = systemProperty.indexOf(CharPool.COLON);

            if (index == -1) {
                continue;
            }

            String key = systemProperty.substring(0, index);
            String value = systemProperty.substring(index + 1);

            System.setProperty(key, value);

            if (_log.isDebugEnabled()) {
                _log.debug(
                        "Setting system property {key=" + key + ", value=" + value +
                                "}");
            }
        }
    }

    protected static InetAddress bindInetAddress;

    private static final Logger _log = LoggerFactory.getLogger(EurekaClusterBase.class);

    private static boolean _initialized;

    private Registration registration;

    private DiscoveryClient discoveryClient;

    @Value("${eureka.instance.instanceId}")
    private String instanceId;

    @Value("${server.port}")
    private int serverPort;

    @Autowired
    public void setDiscoveryClient(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @Autowired
    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public Registration getRegistration() {
        return registration;
    }
}
