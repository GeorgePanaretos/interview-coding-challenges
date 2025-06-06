package client;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import common.Port;

public class WordCountClient {
	public void execute() {
		List<ServerInfo> servers = Arrays.asList(new ServerInfo("localhost", Port.PORT_ONE), new ServerInfo("localhost", Port.PORT_TWO));

		WordCounter counter = new WordCounter();
		ExecutorService executor = Executors.newFixedThreadPool(servers.size());

		for (ServerInfo server : servers) {
			executor.submit(new ServerReader(server, counter));
		}

		executor.shutdown();
		try {
			if (!executor.awaitTermination(10, TimeUnit.MINUTES)) {
				System.err.println("Timeout waiting for client tasks to finish.");
			}
		} catch (InterruptedException e) {
			System.err.println("Interrupted while waiting for tasks to finish.");
			Thread.currentThread().interrupt();
		}

		counter.topWords(5);
	}

	public static void main(String[] args) {
		new WordCountClient().execute();
	}
}
