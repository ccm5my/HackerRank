package com.hackerrank.solutions.map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class JavaMapPractice {

	public HashMap<String,Integer> sortMap(String[] inputValues) {
		
		HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
		phoneBook.put(inputValues[1], Integer.valueOf(inputValues[2]));
		phoneBook.put(inputValues[3], Integer.valueOf(inputValues[4]));
		phoneBook.put(inputValues[5], Integer.valueOf(inputValues[6]));
		return phoneBook;

		
	}
}