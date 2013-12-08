package com.cal.angelgame.player;

import com.cal.angelgame.enemy.Enemy;

public class Speed extends Warrior {

	public Speed(float x, float y, int str, int def, int speed, int health,
			int healthSteal) {
		super(x, y, str, def, speed, health, healthSteal);
		// TODO Auto-generated constructor stub
	}
	
	//fast
		public void DoubleStrike(Enemy enemy){ // active
			enemy.health -= 10;
		}
		
		public void ThreeHitCombo(Enemy enemy){ // active
			enemy.health -= 15;
		}
		
		public void StrSpeedUp(){ // passive
			this.str += 10;
			this.speed += 10;
		}
		
		public void StealHealth(Enemy enemy){ // active
			this.health += 10;
			enemy.health -= 10;
		}
		
	
}
