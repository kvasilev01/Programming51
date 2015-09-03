package com.hackbulgaria.programming51.week7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PositivesAndNegatives {
	public static Stack<Integer> stack = new Stack<>();
	public static ArrayList<Integer> positive = new ArrayList<>();
	public static ArrayList<Integer> negative = new ArrayList<>();

	public static Stack<Integer> reorder(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				positive.add(numbers[i]);
			} else {
				negative.add(numbers[i]);
			}

		}
		positive.sort(null);
		negative.sort(null);
		for (int i : positive) {
			stack.add(i);
		}
		for (int i = 0; i < negative.size(); i++) {
			stack.add(negative.get(negative.size() - i - 1));
		}
		return stack;
	}

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, -10, -5, 8, -100 };
		Stack<Integer> result = reorder(n);

		while (!result.isEmpty()) {
			System.out.println(result.pop());

		}
	}
}
