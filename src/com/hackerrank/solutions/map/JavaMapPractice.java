package com.hackerrank.solutions.map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class JavaMapPractice {

	public List sortMap(String[] inputValues) {

		HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
		phoneBook.put(inputValues[1], Integer.valueOf(inputValues[2]));
		phoneBook.put(inputValues[3], Integer.valueOf(inputValues[4]));
		phoneBook.put(inputValues[5], Integer.valueOf(inputValues[6]));

		List<String> responseList = createCorrectResponse(phoneBook, inputValues);

		return responseList;

	}

	private List createCorrectResponse(HashMap<String, Integer> phoneBook, String[] inputValues) {
		List<String> response = new ArrayList<>();
		
		List<String> list = new ArrayList();
		list.add(inputValues[7]);
		list.add(inputValues[8]);
		list.add(inputValues[9]);
		for(String name: list) {
		if (phoneBook.containsKey(name)) {
			response.add(name + "=" + phoneBook.get(name));
		} else {
			response.add("Not Found");
		}

		}


		return response;
	}
}