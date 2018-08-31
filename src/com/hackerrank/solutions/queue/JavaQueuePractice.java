package com.hackerrank.solutions.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaQueuePractice {
	
	List<Integer> results = new ArrayList<>();
	public List<Integer> countUniqueNumbers(Set<List<Integer>> inputValues) {

		int count = 0;
		int finalCount = 0;
		Map<Integer, Integer> countOccurences = new HashMap<>();
		Deque<Integer> deque = new ArrayDeque<Integer>();
		for (List<Integer> set : inputValues) {
			deque.addAll(set);
			for (int i : deque) {
				if (!countOccurences.containsValue(i)) {
					countOccurences.put(i, 1);
				} else {
					int value = countOccurences.get(i);
					value++;

				}
			}

			for (int numberOfUniques : countOccurences.values()) {
				if (numberOfUniques == 1) {
					finalCount++;
				}

			}
			results.add(finalCount);
		}
		
		return results;
		
	}
}
