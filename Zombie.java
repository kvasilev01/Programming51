package com.hackbulgaria.programming51.week6;

public class Zombie {
protected int totalHealth;
protected int currentHealth;

public Zombie(int health){
	totalHealth = currentHealth = health;
}
public int getCurrentHealth(){
	return currentHealth;
}
public int getTotalHealth(){
	return totalHealth;
}
public void hit(int damage){
	currentHealth -= damage;
}
public boolean isDead(){
	if(currentHealth <= 0){
		return true;
	}
	return false;
}
}
