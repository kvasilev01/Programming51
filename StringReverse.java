package com.hackbulgaria.programming51.week7;

import java.util.Stack;

public class StringReverse {
	public static String reverseStringWithStack(String s) {
		Stack<Character> stack = new Stack<>();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			stack.push(s.charAt(i));
		}
		String reversedString = "";
		while (!stack.isEmpty()) {
			reversedString += stack.pop();
		}
		return reversedString;
	}

	public static void main(String[] args) {
		System.out.println(reverseStringWithStack("klfth"));
	}
}