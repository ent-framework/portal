package com.liferay.portal.cluster.eureka;

import org.jgroups.Address;
import org.jgroups.conf.ClassConfigurator;
import org.jgroups.protocols.FILE_PING;
import org.jgroups.protocols.PingData;
import org.jgroups.protocols.TCP;
import org.jgroups.util.Responses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EUREKA_PING extends FILE_PING {

    private static Map<String, PingData> datas = new HashMap<>();

    private static final Logger _log = LoggerFactory.getLogger(EUREKA_PING.class);

    private final DiscoveryClient discoveryClient;

    private final TCP tcp;

    public EUREKA_PING(DiscoveryClient discoveryClient, TCP tcp) {
        this.discoveryClient = discoveryClient;
        this.tcp = tcp;
    }

    static {
        ClassConfigurator.addProtocol((short) 600, EUREKA_PING.class); // ID needs to be unique
    }

    @Override
    public boolean isDynamic() {
        return true;
    }

    @Override
    protected void readAll(List<Address> members, String clustername, Responses responses) {

        _log.info("Get local TCP port :" + this.tcp.getBindPort());

        List<ServiceInstance> instances = discoveryClient.getInstances(clustername);
        for (ServiceInstance instance : instances) {
            try {
                String physicalAddr = instance.getHost() + ":" + instance.getPort();

                String key = clustername + "_" + physicalAddr;

                PingData data = readData(key);

                if (data != null && (members == null || members.contains(data.getAddress())))
                    responses.addResponse(data, data.isCoord());
                if (data != null && local_addr != null && !local_addr.equals(data.getAddress()))
                    addDiscoveryResponseToCaches(data.getAddress(), data.getLogicalName(), data.getPhysicalAddr());

            } catch (Exception e) {
                _log.error(e.getMessage(), e);
            }
        }
    }

    @Override
    protected void write(List<PingData> list, String clustername) {
        if (discoveryClient.getInstances(clustername).size() > 0) {
            for (PingData data : list) {
                String physicalAddr = data.getPhysicalAddr().printIpAddress();
                String key = clustername + "_" + physicalAddr;
                _log.info("ping data key: " + key);
                datas.put(key, data);
            }
        }
    }

    @Override
    protected void remove(String clustername, Address addr) {

    }

    private PingData readData(String key) {
        return datas.get(key);
    }

    @Override
    public void destroy() {
        datas.clear();
        super.destroy();
    }
}
