package com.hackbulgaria.programming51.week6;

public class ToSmash extends Weapon {
	
	public ToSmash(){
		type = "ToSmash";
	}
public int getDamage(){
	if(Currentdurability < durability/2 && damage > 1){
		damage--;
		Currentdurability -= Currentdurability;	
	}
	return damage;
}
}
