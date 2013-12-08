package com.cal.angelgame.enemy;

public class Monster extends Enemy {
	/**
	 * Basic Monster enemy
	 * Wrapper class
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	
	final static float width = 160;
	final static float height = 160; 
	
	public Monster(float posx, float posy) {
		super(posx, posy, width, height);
	}

	public Monster(float x, float y, 
			int str, int def, int speed, int health, int healthSteal) {
		super(x, y, width, height, str, def, speed, health, healthSteal);
		// TODO Auto-generated constructor stub
	}

}
