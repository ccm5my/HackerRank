package com.hackerrank.solutions.testQueue;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.hackerrank.solutions.queue.JavaQueuePractice;

public class JavaQueuePracticeTest {
	Set<List<Integer>> setOfIntegerLists = new HashSet<List<Integer>>();
	List<Integer> list1 = new ArrayList<>(Arrays.asList(6, 3, 7, 7, 8, 9, 2, 8));
	List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 3, 5, 2, 3, 3));

	@Before
	public void setup() {
		setOfIntegerLists.add(list1);
		setOfIntegerLists.add(list2);
	}

	@Test
	public void testQueueClass() {
		JavaQueuePractice practice = new JavaQueuePractice();
		List<Integer> finalResult = practice.countUniqueNumbers(setOfIntegerLists);
		assertThat(finalResult.get(0), is(6));
		assertThat(finalResult.get(1), is(3));
	}
}
