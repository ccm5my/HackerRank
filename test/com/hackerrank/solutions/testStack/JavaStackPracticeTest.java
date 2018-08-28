package com.hackerrank.solutions.testStack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hackerrank.solutions.stack.JavaStackPractice;

public class JavaStackPracticeTest {
	List<String> input = new ArrayList<>();
	String string1 = "{}()";
	String string2 = "({()})";
	String string3 = "{}(";
	String string4 = "[]";
	
	
	@Before 
	public void setup() {
		input.add(string1);
		input.add(string2);
		input.add(string3);
		input.add(string4);
	}
	
	@Test
	public void test_stack_solution() {
		JavaStackPractice stacks = new JavaStackPractice();
		List<Boolean> resultList = stacks.decideIfStackIsSymmetrical(input);
		assertThat(resultList.get(0), is(true));
		assertThat(resultList.get(1), is(true));
		assertThat(resultList.get(2), is(false));
		assertThat(resultList.get(3), is(true));
	}
}
