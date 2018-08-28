package com.hackerrank.solutions.stack;

import java.util.List;
import java.util.*;

public class JavaStackPractice {

	public List<Boolean> decideIfStackIsSymmetrical(List<String> stringInputs) {
		List<Boolean> resultList = new ArrayList<>();
		Stack<String> stack = new Stack<String>();
		for(String input : stringInputs) {
			stack.add(input);	
		}
		for(String stackEntry: stack) {
			//probably going to need to do some stack.pop or stack.push()	
			if(stackEntry.substring(0,1).equals(stackEntry.substring(stackEntry.length()-1, stackEntry.length()))) {
				resultList.add(true);
			} else {
				resultList.add(false);
			}
		}
		
		return resultList;
	}
}
