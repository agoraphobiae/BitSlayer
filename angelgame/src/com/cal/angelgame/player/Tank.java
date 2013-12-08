package com.cal.angelgame.player;

import com.cal.angelgame.enemy.Enemy;

public class Tank extends Warrior {

	public Tank(float x, float y, int str, int def, int speed, int health,
			int healthSteal) {
		super(x, y, str, def, speed, health, healthSteal);
		// TODO Auto-generated constructor stub
	}
	
	//Tank warrior
	public void GroundPound(Enemy enemy){ // active
		enemy.health -= 15;
	}
	
	public void DoubleSwing(Enemy enemy){ // active
		enemy.health -= 25;
	}
	
	public void DefStrUp(){ // passive
		this.def += 10;
		this.str += 10;
	}
	
	public void HealthRegen(){ // active
		this.health += 20;
	}

}
