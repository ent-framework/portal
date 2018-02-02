package com.liferay.portal.cluster;

import com.liferay.portal.kernel.util.*;
import com.liferay.portal.util.PropsValues;
import org.jgroups.JChannel;
import org.jgroups.PhysicalAddress;
import org.jgroups.protocols.*;
import org.jgroups.protocols.pbcast.GMS;
import org.jgroups.protocols.pbcast.NAKACK2;
import org.jgroups.protocols.pbcast.STABLE;
import org.jgroups.protocols.pbcast.STATE_TRANSFER;
import org.jgroups.stack.IpAddress;
import org.jgroups.stack.ProtocolStack;
import org.jgroups.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.context.annotation.Bean;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.liferay.portal.cluster.ClusterBase.CONTROL_CHANNEL_SUFFIX;

public class EurekaJgroupsConfiguration {


    private final Logger log = LoggerFactory.getLogger(EurekaJgroupsConfiguration.class);

    private DiscoveryClient discoveryClient;

    private Registration registration;

    @Autowired
    private ServerProperties serverProperties;

    @Autowired
    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    @Autowired
    public void setDiscoveryClient(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @Bean
    @Qualifier("liferay.transportChannel")
    public JGroupsTransport createTransportChannel() {
        initBindAddress();
        initSystemProperties();
        return createChannel(true);
    }

    @Bean
    @Qualifier("liferay.controlChannel")
    public JGroupsTransport createControlChannel() {
        initBindAddress();
        initSystemProperties();
        return createChannel(false);
    }

    private JGroupsTransport createChannel(boolean isTransport) {


        String clusterName = isTransport ? registration.getServiceId() : registration.getServiceId() + CONTROL_CHANNEL_SUFFIX;
        int tcpPort = serverProperties.getPort() + 1;

        JChannel channel = new JChannel(false);
        List<PhysicalAddress> initialHosts = new ArrayList<>();
        try {
            for (ServiceInstance instance : discoveryClient.getInstances(registration.getServiceId())) {
                int port = instance.getPort()+1;
                String clusterMember = instance.getHost() + ":" + port;
                log.debug("Adding Jgroups cluster member " + clusterMember);
                initialHosts.add(new IpAddress(clusterMember));
            }

            TCP tcp = createTCP(tcpPort);

            TCPPING tcpping = new TCPPING();
            initialHosts.add(new IpAddress(InetAddress.getLocalHost(), tcpPort));
            tcpping.setInitialHosts(initialHosts);

            NAKACK2 nakack = new NAKACK2();
            nakack.setUseMcastXmit(false);
            nakack.setDiscardDeliveredMsgs(false);

            MERGE3 merge = new MERGE3();
            merge.setMinInterval(10000);
            merge.setMaxInterval(30000);

            FD_ALL fd = new FD_ALL();
            fd.setTimeout(60000);
            fd.setInterval(15000);
            fd.setTimeoutCheckInterval(5000);

            ProtocolStack stack = new ProtocolStack();
            // Order shouldn't be changed
            stack
                    .addProtocol(tcp)
                    .addProtocol(tcpping)
                    .addProtocol(merge)
                    .addProtocol(new FD_SOCK())
                    .addProtocol(fd)
                    .addProtocol(new VERIFY_SUSPECT())
                    .addProtocol(nakack)
                    .addProtocol(new UNICAST3())
                    .addProtocol(new STABLE())
                    .addProtocol(new GMS())
                    .addProtocol(new MFC())
                    .addProtocol(new FRAG2())
                    .addProtocol(new STATE_TRANSFER());
            channel.setProtocolStack(stack);
            stack.init();
           // channel.setName(clusterName);
            setInitializedTCP(tcp);

            //channel.connect(clusterName);

        } catch (Exception e) {
            throw new BeanInitializationException("Cache (Infinispan protocol stack) configuration failed", e);
        }
        JGroupsTransport transport = new JGroupsTransport(clusterName, channel);
        transport.setBindServerPort(serverProperties.getPort());
        transport.setBindServerProtocol(serverProperties.getSsl()!=null && serverProperties.getSsl().getKeyStore()!=null ? "https": "http");
        return transport;
    }

    private TCP createTCP(int tcpPort) {

        if (initializedTCP!=null) {
            return initializedTCP;
        }

        try {
            TCP tcp = new TCP();
            tcp.setPortRange(0);
            tcp.setLoopback(false);
            tcp.setBindAddress(InetAddress.getLocalHost());
            tcp.setBindPort(tcpPort);

            ThreadFactory global_thread_factory = new DefaultThreadFactory("", false);
            ThreadFactory timer_thread_factory = new LazyThreadFactory("Timer", true, true);
            ;
            timer_thread_factory.setIncludeClusterName(false);

            TimeScheduler timer = new DefaultTimeScheduler(timer_thread_factory, 4);

            TimeService time_service = new TimeService(timer, 500).start();

            tcp.setThreadFactory(global_thread_factory);
            tcp.setTimer(timer);
            tcp.setTimerThreadFactory(timer_thread_factory);
            tcp.setTimeService(time_service);

            tcp.setTimerMinThreads(4);
            tcp.setTimerMaxThreads(10);
            tcp.setTimerKeepAliveTime(3000);

            tcp.setThreadPoolMinThreads(2);
            tcp.setThreadPoolMaxThreads(30);
            tcp.setThreadPoolQueueEnabled(false);
            tcp.setThreadPoolKeepAliveTime(5000);

            tcp.setOOBThreadPoolMinThreads(2);
            tcp.setOOBThreadPoolMaxThreads(200);
            tcp.setOOBThreadPoolKeepAliveTime(5000);
            tcp.setOOBThreadPoolQueueEnabled(false);
            tcp.setOOBRejectionPolicy("discard");

            Map<String, Object> tcpValues = new HashMap<>();
            tcpValues.put("singleton_name", "liferay");
            tcpValues.put("recv_buf_size", 5 * 1024 * 1024);
            tcpValues.put("timer_type", "new");
            tcpValues.put("timer.queue_max_size", 500);
            tcpValues.put("thread_pool.enabled", "true");
            tcpValues.put("thread_pool.rejection_policy", "discard");
            tcpValues.put("oob_thread_pool.enabled", "true");
            tcp.setValues(tcpValues);
            return tcp;
        } catch (Exception ex) {
            log.error("error creating shared tcp");
        }
        return  null;
    }

    private void initBindAddress() {

        if (bindInetAddress != null) {
            return;
        }

        try {
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

            if (log.isInfoEnabled()) {
                log.info(
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

            if (log.isInfoEnabled()) {
                log.info("Setting JGroups outgoing IP address to " +
                                bindInetAddress.getHostAddress() + " and interface to " +
                                networkInterface.getName());
            }
        } catch (Exception ex) {
            log.error("Can't init bindInetAddress");
        }

    }
    private void initSystemProperties() {
    }

    private void setInitializedTCP (TCP tcp) {
        if (initializedTCP!=null) return;
        if (tcp!=null) {
            initializedTCP = tcp;
        }
    }

    protected static InetAddress bindInetAddress;
    private static TCP initializedTCP = null;
}
