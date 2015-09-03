package com.hackbulgaria.programming51.week2;

public class Fridge {
	public int fridgeCapacity = 10;
	public Fridge[] type;
	public double Weight = 5000;
	
	public Fridge(){
		type = new Fridge[fridgeCapacity];
		
	}
	
	public boolean addFood(Food f){
		int i;
		for(i = 0; i < Weight; i++);{
				if (type[i].equals(type));{
				return true;
			}
	 return false;
    }
}