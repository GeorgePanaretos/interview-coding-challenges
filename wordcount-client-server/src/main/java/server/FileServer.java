package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import common.Port;

public class FileServer {

	private final Port port;
	private final String filePath;

	public FileServer(Port port, String filePath) {
		this.port = port;
		this.filePath = filePath;
	}

	public void start() {
		try (ServerSocket server = new ServerSocket(port.getValue())) {
			while (true) {
				Socket clientSocket = server.accept();
				handleClient(clientSocket);
			}

		} catch (IOException e) {
			System.err.println("Server error on port: " + port.getValue());
		}

	}

	public void handleClient(Socket clientSocket) {
		new Thread(new ClientHandler(clientSocket, filePath)).start();
		;
	}
}
