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
	// queue can be added or removed to either front or back
	// How to implement them:
	// LinkedList<>
	// ArrayDeque<>

	// Goal: find maximum number of unique integers among all the possible subarrays
	// of size M

	// inputs: 6 3 : 2 unique integers
	// inputs 535232 : 3 unique integers

	// idea: Create a queue that looks through each subarray and finds the unique
	// integers
	// combine the data from doing that into an answer
	// return an int
	// TO DO: Look up common methods with dequeue

	public List<Integer> countUniqueNumbers(Set<ArrayList<Integer>> inputValues) {
		int count = 0;
		Map<Integer, Integer> countOccurences = new HashMap<>();
		Deque<Integer> deque = new ArrayDeque<Integer>();
		for (List<Integer> set : inputValues) {
			deque.addAll(set);
			for (int i : deque) {
				
				if (!countOccurences.containsValue(i)) {
					countOccurences.put(i,1);
				} else {
					int value = countOccurences.get(i);
					value++;
					
				}

			}

		}

		return null;
	}
}
