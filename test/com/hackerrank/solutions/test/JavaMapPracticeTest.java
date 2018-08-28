package com.hackerrank.solutions.test;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;



import com.hackerrank.solutions.map.JavaMapPractice;

public class JavaMapPracticeTest {
	
	
	String[] stdinValues;
	
	@Before
	public void setup() {
		stdinValues = new String[10];
		stdinValues[0] = "3";
		stdinValues[1] = "uncle sam";
		stdinValues[2] = "99912222";
		stdinValues[3] = "tom";
		stdinValues[4] = "11122222";
		stdinValues[5] = "harry";
		stdinValues[6] = "12299933";
		stdinValues[7] = "uncle sam";
		stdinValues[8] = "uncle tom";
		stdinValues[9] = "harry";
	}
	
	@Test
	public void test_java_map_class() {
		JavaMapPractice mapPractice = new JavaMapPractice();
		HashMap<String, Integer> phoneBook = mapPractice.sortMap(stdinValues);
		
		assertThat(phoneBook.containsKey("uncle sam"), is(true));
		assertThat(phoneBook.containsKey("tom"), is(true));
		assertThat(phoneBook.containsKey("harry"), is(true));

		
		
	}
}
