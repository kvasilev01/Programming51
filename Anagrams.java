package com.hackbulgaria.programming51.week4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static boolean areAnagrams(String a, String b) {
		char [] a1 = a.replaceAll("[\\s]", "").toCharArray();
		char [] b1 = b.replaceAll("[\\s]", "").toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		return Arrays.equals(a1, b1);
	}	
			
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String a = scanner.next();
		String b = scanner.next();

		if (areAnagrams(a, b)) {
			System.out.println("ANAGRAMS");
		} else {
			System.out.println("NOT ANAGRAMS");
		}
	}
}
