package com.cal.angelgame.enemy;

import com.cal.angelgame.Character;

public abstract class Enemy extends Character {
	/**
	 * Anything the player can attack
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */

	public int str;
	public int def;
	public int speed;
	public int health;
	public int healthSteal;
	
	public Enemy(float posx, float posy, float width, float height) {
		super(posx, posy, width, height);
	}
	
	public Enemy(float x, float y, float width, float height,
			int str, int def, int speed, int health, int healthSteal){
		super(x, y, width, height, str, def, speed, health, healthSteal);
		// TODO Auto-generated constructor stub
		this.str = str;
		this.def = def;
		this.speed = speed;
		this.health = health;
		this.healthSteal = healthSteal;
	}
}
