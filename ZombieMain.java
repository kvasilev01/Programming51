package com.hackbulgaria.programming51.week6;

import java.util.LinkedList;
import java.util.Scanner;

public class ZombieMain {
	public static void main(String[] args) {
		int hit = 0;
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int health = scanner.nextInt();
		String weaponName = scanner.next();
	
	Weapon w;
	
		if (weaponName.equals("Axe")) {
			w = new Axe();
		} else if (weaponName.equals("Sword")) {
			w = new AncientSword();
		} else if (weaponName.equals("Shotgun")) {
			w = new Shotgun();
		} else {
			w = new Revolver();
		}

		for (int i = 0; i < count; i++) {
			Zombie zombie = new Zombie(health);
			while (!zombie.isDead()) {
				int m = w.getDamage();
				zombie.hit(m);
				hit += 1;
			}
		}
		System.out.println(hit);
	}
}
