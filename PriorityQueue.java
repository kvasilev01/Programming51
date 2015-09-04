package com.hackbulgaria.programming51.week10;

public interface PriorityQueue {

	public int pop(); // remove and returns the oldest person.

	public int peek(); // only returns the oldest person without removing it

	public boolean isEmpty(); // returns true if empty

	public void push(int data); // pushes person into the queue

}