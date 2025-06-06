package server;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {

    private final Socket clientSocket;
    private final String resourceName;

    public ClientHandler(Socket clientSocket, String resourceName) {
        this.clientSocket = clientSocket;
        this.resourceName = resourceName;
    }

    @Override
    public void run() {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(resourceName)) {
            if (is == null) {
                System.err.println("Resource not found: " + resourceName);
                return;
            }
            try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is));
                 PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {

                String line;
                while ((line = fileReader.readLine()) != null) {
                    writer.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error handling client: " + clientSocket.getInetAddress() + ":" + clientSocket.getLocalPort());
            e.printStackTrace();
        } finally {
            try {
                System.out.println("Client socket closed for: " + clientSocket.getInetAddress() + ":" + clientSocket.getLocalPort());
                clientSocket.close();
            } catch (IOException e) {
                System.err.println("Error closing client socket.");
                e.printStackTrace();
            }
        }
    }
}
