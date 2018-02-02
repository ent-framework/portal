package com.liferay.portal.cluster;

import org.jgroups.JChannel;

import java.net.InetAddress;

public class JGroupsTransport {
    private String clusterName;

    private int bindServerPort;
    private String bindServerProtocol;
    private JChannel channel;
    private InetAddress bindInetAddress;

    public JGroupsTransport(String clusterName, JChannel channel) {
        this.clusterName = clusterName;
        this.channel = channel;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public JChannel getChannel() {
        return channel;
    }

    public void setChannel(JChannel channel) {
        this.channel = channel;
    }

    public int getBindServerPort() {
        return bindServerPort;
    }

    public void setBindServerPort(int bindServerPort) {
        this.bindServerPort = bindServerPort;
    }

    public String getBindServerProtocol() {
        return bindServerProtocol;
    }

    public void setBindServerProtocol(String bindServerProtocol) {
        this.bindServerProtocol = bindServerProtocol;
    }

    public InetAddress getBindInetAddress() {
        return bindInetAddress;
    }

    public void setBindInetAddress(InetAddress bindInetAddress) {
        this.bindInetAddress = bindInetAddress;
    }
}
