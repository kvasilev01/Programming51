package com.hackbulgaria.programming51.week6;

public class ToShoot extends Weapon {
	public ToShoot(){
	type = "ToShoot";
	}
public int getDamage(){
	if(Currentdurability > 0){
		Currentdurability--;
	}
	if(Currentdurability == 0){
		damage = 1;
	}
	return damage;
}
}
