package client;

import java.io.*;
import java.net.Socket;

public class ServerReader implements Runnable {
	private final ServerInfo serverInfo;
	private final WordCounter wordCounter;

	public ServerReader(ServerInfo serverInfo, WordCounter wordCounter) {
		this.serverInfo = serverInfo;
		this.wordCounter = wordCounter;
	}

	@Override
	public void run() {
		System.out.println("Connecting to " + serverInfo.getHost() + ":" + serverInfo.getPort().getValue());
		try (Socket socket = new Socket(serverInfo.getHost(), serverInfo.getPort().getValue());
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

			String line;
			while ((line = reader.readLine()) != null) {
				wordCounter.countWords(line);
			}
		} catch (IOException e) {
			System.err.println("Failed to connect to server: " + serverInfo.getHost() + ":" + serverInfo.getPort());
			e.printStackTrace();
		}
	}
}