package com.hackerrank.solutions.singletonpattern;

public class JavaSingletonPatternPractice {

	public String str;

	public static JavaSingletonPatternPractice practiceInstance;

	private JavaSingletonPatternPractice() {

	}

	public static JavaSingletonPatternPractice getSingleInstance(JavaSingletonPatternPractice practiceInstance) {
		if (practiceInstance == null) {
			practiceInstance = new JavaSingletonPatternPractice();

		}

		return practiceInstance;
	}

}