package com.liferay.portal.cluster.eureka;

import org.jgroups.Address;
import org.jgroups.Event;
import org.jgroups.Message;
import org.jgroups.conf.ClassConfigurator;
import org.jgroups.protocols.*;
import org.jgroups.stack.IpAddress;
import org.jgroups.util.NameCache;
import org.jgroups.util.Responses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.*;

import static com.liferay.portal.cluster.eureka.EurekaClusterBase.CONTROL_CHANNEL_SUFFIX;

public class EUREKA_PING extends Discovery {

    private static Map<String, PingData> datas = new HashMap<>();

    private static final Logger _log = LoggerFactory.getLogger(EUREKA_PING.class);

    private final DiscoveryClient discoveryClient;

    public EUREKA_PING(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    static {
        ClassConfigurator.addProtocol((short) 600, EUREKA_PING.class); // ID needs to be unique
    }

    @Override
    public boolean isDynamic() {
        return true;
    }

    @Override
    protected void findMembers(final List<Address> members, boolean initial_discovery, final Responses responses) {
        final IpAddress physical_addr = (IpAddress) down(new Event(Event.GET_PHYSICAL_ADDRESS, local_addr));
        final PingData data = new PingData(local_addr, false, NameCache.get(local_addr), physical_addr);
        final PingHeader hdr = new PingHeader(PingHeader.GET_MBRS_REQ).clusterName(cluster_name);
        final List<IpAddress> clusterMembers = getPrivateIpAddresses();

        for (IpAddress address : clusterMembers) {
            boolean is = address.getIpAddress().equals(physical_addr.getIpAddress()) && address.getPort() == physical_addr.getPort();
            _log.debug("is self {}", is);
        }

        clusterMembers.stream()
                .filter(Objects::nonNull) //guard against nulls
                .filter(address -> !(address.getIpAddress().equals(physical_addr.getIpAddress()) && address.getPort() == physical_addr.getPort())) //filter out self
                .map(address -> new Message(address)
                        .setFlag(Message.Flag.INTERNAL, Message.Flag.DONT_BUNDLE, Message.Flag.OOB)
                        .putHeader(this.id, hdr).setBuffer(marshal(data)))
                .forEach(message -> {
                    if(async_discovery_use_separate_thread_per_request) {
                        log.trace("%s: sending async discovery request to %s", local_addr, message.getDest());
                        down_prot.down(message);
                    } else {
                        log.trace("%s: sending discovery request to %s", local_addr, message.getDest());
                        down_prot.down(message);
                    }
                });
    }

    private List<IpAddress> getPrivateIpAddresses() {

        List<IpAddress> addresses = new ArrayList<>();

        String clusterName = cluster_name;

        boolean isTransport = true;

        if (clusterName.endsWith(CONTROL_CHANNEL_SUFFIX)) {
            clusterName = clusterName.substring(0, clusterName.length() - CONTROL_CHANNEL_SUFFIX.length());
            isTransport = false;
        }


        if (_log.isDebugEnabled()) {
            _log.debug("Find Eureka instance from {}", clusterName);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances(clusterName);
        for(ServiceInstance instance : instances) {
            int port = instance.getPort();
            if (isTransport) {
                port = port+1;
            } else {
                port =  port+2;
            }
            try {
                IpAddress address = new IpAddress(instance.getHost(), port);
                addresses.add(address);
            } catch (Exception ex) {

            }
        }

        if (log.isDebugEnabled()) {
            log.debug("Instances found [%s]", addresses);
        }

        return addresses;

    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
