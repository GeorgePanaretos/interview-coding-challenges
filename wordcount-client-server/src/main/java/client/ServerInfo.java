package client;

import common.Port;

public class ServerInfo {

	private final String host;
	private final Port port;

	public ServerInfo(String host, Port port) {
		this.host = host;
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public Port getPort() {
		return port;
	}
}
