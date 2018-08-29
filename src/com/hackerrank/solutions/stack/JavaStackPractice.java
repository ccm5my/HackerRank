package com.hackerrank.solutions.stack;

import java.util.List;
import java.util.*;

public class JavaStackPractice {

	public List<Boolean> decideIfStackIsSymmetrical(List<String> stringInputs) {
		List<Boolean> resultList = new ArrayList<>();
		
		for(String input: stringInputs) {
			Stack<Character> stack = new Stack<Character>();
			for(char character: input.toCharArray()) {
			
			
				if(character == '{' || character == '(' || character == '[') {
					stack.push(character);
					continue;
				}
				
				if(character == '}' && !stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
					continue;
				}
				
				if(character == ')' && !stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
					continue;
				}
				
				if(character == ']' && !stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
					continue;
				}
				
				if(character == '}' || character == ')' || character == ']') {
					stack.push(character);
					break;
				}
				
			
				
			}
			resultList.add(stack.isEmpty());
		}
		return resultList;
	}

}
