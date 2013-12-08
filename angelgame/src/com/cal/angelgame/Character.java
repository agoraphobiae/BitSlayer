package com.cal.angelgame;

public abstract class Character extends GameObject {
	
	/**
	 * Anything that the player(s) interacts with: includes the player(s)
	 * implements health bar
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	int str = 50;
	int def = 50;
	int speed = 50;
	int health = 100;
	int healthSteal = 5;
	
	public Character(float posx, float posy, float width, float height) {
		super(posx, posy, width, height);
	}

	public Character(float x, float y, float width, float height,
			int str, int def, int speed, int health, int healthSteal){
		super(x, y, width, height);
		this.str = str;
		this.def = def;
		this.speed = speed;
		this.health = health;
		this.healthSteal = healthSteal;
	}

}
