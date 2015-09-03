package com.hackbulgaria.programming51.week7;

import java.util.Stack;

public class StringUtils {
	private static Stack<Character> stack = new Stack<Character>();

	public static String reverseStringWithStack(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
			while (!stack.isEmpty()) {
				res += stack.pop();
			}

		}
		return res;

	}
}
