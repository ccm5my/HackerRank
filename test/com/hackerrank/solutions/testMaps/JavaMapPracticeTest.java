package com.hackerrank.solutions.testMaps;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.List;

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
	@SuppressWarnings("unchecked")
	public void test_java_map_class_uncle_sam() {
		JavaMapPractice mapPractice = new JavaMapPractice();
	
		List<String> returnValue = mapPractice.sortMap(stdinValues);
		assertThat(returnValue.contains("uncle sam=99912222"), is(true));
		assertThat(returnValue.contains("Not Found"), is(true) );
		assertThat(returnValue.contains("harry=12299933"), is(true));
		assertThat(returnValue.contains("uncle tom=11122222"), is(false));
		
		
		
		
	}
}
