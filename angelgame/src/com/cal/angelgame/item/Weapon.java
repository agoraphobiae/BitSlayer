package com.cal.angelgame.item;

public class Weapon extends Item {
	/**
	 * Player can wear up to two weapons
	 * Increases Strength
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param strInc
	 * @param defInc
	 * @param speedInc
	 * @param healthRegen
	 * @param healthSteal
	 */

	public Weapon(float x, float y, float width, float height,
			int strInc, int defInc, int speedInc, int healthRegen, int healthSteal){
		super(x, y, width, height, strInc, defInc, speedInc, healthRegen, healthSteal);
		// TODO Auto-generated constructor stub
	}

}
