package com.hackbulgaria.programming51.week7;

import java.util.Scanner;
import java.util.Scanner;

public class BraketsMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String brackets = scanner.next();
		System.out.println(Brackets.areCorrect(brackets));
	}
}
