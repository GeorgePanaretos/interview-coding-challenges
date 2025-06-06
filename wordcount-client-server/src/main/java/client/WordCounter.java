package client;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class WordCounter {

	private final Map<String, Integer> wordCount = new ConcurrentHashMap<>();

	public void countWords(String line) {

		String[] words = line.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");
		for (String word : words) {
			if (!word.isEmpty()) {
				wordCount.merge(word, 1, Integer::sum);
			}
		}
	}

	public void topWords(int topN) {
		System.out.println("Top " + topN + " most common words:");
		wordCount.entrySet().stream()
			.sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()))
			.limit(topN)
			.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	}
}
