package com.hackbulgaria.programming51.week8a;

import javax.swing.JFrame;

public class AppBouncingBall extends JFrame {

	public AppBouncingBall() {
		add(new Canvas());

		setResizable(false);
		pack();

		setTitle("Bouncing ball");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		Application app = new Application();
		app.setVisible(true);
	}
}