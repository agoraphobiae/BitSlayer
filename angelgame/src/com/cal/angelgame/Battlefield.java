package com.cal.angelgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.cal.angelgame.enemy.Enemy;
import com.cal.angelgame.enemy.Monster;
import com.cal.angelgame.player.PlayerCharacter;
import com.cal.angelgame.player.Warrior;

public class Battlefield {
	/**
	 * Handles main game loop logic between game instances,
	 * like player and enemies.
	 */
	public interface BattlefieldEventHandler {
		public void playerHit();

		public void playerAttack();

		public void playerDie();

		public void enemyHit(Enemy enemy);

		public void enemyAttack(Enemy enemy);
	}
	 
	public static final float BF_WIDTH = 16; // sidescroll ?!?!?!
	public static final float BF_HEIGHT = 9;
	public static final int BF_STATE_RUNNING = 0;
	public static final int BF_STATE_NEXT_LEVEL = 1;
	public static final int BF_STATE_GAME_OVER = 2;
	
	public final PlayerCharacter pchar;
	public final List<Enemy> enemies;
	public final BattlefieldEventHandler handler;
	public final Random rand;
	
	public int curState;
	
	public long lastEnemySpawn = System.currentTimeMillis();
	
	public Battlefield(BattlefieldEventHandler handler) {
		this.pchar = new Warrior(2, 4.5);
		this.enemies = new ArrayList<Enemy>();
		this.handler = handler;
		rand = new Random();
		
		generateLevel();
		
		this.curState = BF_STATE_RUNNING;
	}
	
	private void generateLevel() {
		Enemy spawnedEnemy = new Monster(BF_WIDTH, rand.nextFloat() * BF_HEIGHT);
		lastEnemySpawn = System.currentTimeMillis();
	}
	
	public void update(float deltaTime) {
		updatePlayer(deltaTime);
		updateEnemies(deltaTime);
	}
	
	private void updatePlayer(float deltaTime) {
		
	}
}
