package com.hackbulgaria.programming51.week6;

public class MoveRight extends Movement {

	public Pair<Integer> move(Pair<Integer> currentPosition) {
		// System.out.println("Moving right!");
		// This is just an example! The math here depends on yout
		// implementation.
		currentPosition = currentPosition.copy();
		currentPosition.setSecond(currentPosition.getSecond() + 1);
		return currentPosition;
	}

}
