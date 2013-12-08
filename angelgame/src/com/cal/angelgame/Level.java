package com.cal.angelgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.cal.angelgame.enemy.Enemy;
import com.cal.angelgame.player.PlayerCharacter;
import com.cal.angelgame.player.Warrior;

public class Level {
	// global event handling
	public interface WorldListener {
		public void playerHits ();

		public void enemyHits ();

		public void playerDies ();

		public void enemyDies ();
	}
	
	public static final int LEVEL_STATE_RUNNING = 0;
	public static final int LEVEL_STATE_NEXT_LEVEL = 1;
	public static final int LEVEL_STATE_GAME_OVER = 2;
	
	public final List<Enemy> enemies;
	public final PlayerCharacter hero;
	
	public int curstate = LEVEL_STATE_RUNNING;
	
	public final Random rand;
	
	public Level(WorldListener listener) {
		// for now player is just a warrior
		this.hero = new Warrior(50, 50);
		this.enemies = new ArrayList<Enemy>();
	}
}
