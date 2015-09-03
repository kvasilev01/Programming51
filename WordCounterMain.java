package com.hackbulgaria.programming51.week5;

import java.util.Scanner;

public class WordCounterMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searched = scanner.next();
        char [][] map;
        int n,m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        map = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = scanner.next().charAt(0);
            }
        }

        // Print result here
    }
}