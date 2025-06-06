package common;

import server.FileServer;
import client.WordCountClient;

public class Exec {

    public static void main(String[] args) {
        Thread serverThread1 = new Thread(() -> {
            FileServer server1 = new FileServer(Port.PORT_ONE, "dracula.txt");
            server1.start();
        });
        Thread serverThread2 = new Thread(() -> {
            FileServer server2 = new FileServer(Port.PORT_TWO, "frankenstein.txt");
            server2.start();
        });

        serverThread1.start();
        serverThread2.start();
        System.out.println("Servers started.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        WordCountClient.main(new String[]{});

        System.out.println("Client finished processing.");
        
    }
}
