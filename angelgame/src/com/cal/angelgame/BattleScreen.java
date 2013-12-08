package com.cal.angelgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

public class BattleScreen implements Screen {
	/**
	 * Screen with draw and update functions for the 
	 * main gameplay mode.
	 * 
	 * Handles main game loop player input. See Battlefield
	 * for main game loop logic.
	 */
	// states
	static final int GAME_READY = 0;
	static final int GAME_RUNNING = 1;
	static final int GAME_PAUSED = 2;
	static final int GAME_LEVEL_END = 3;
	static final int GAME_OVER = 4;
	
	Game game;
	
	int curState;
	OrthographicCamera guiCam;
	Vector3 touchPoint;
	SpriteBatch batcher;
	
	Battlefield battlefield;
	BattlefieldListener battlefieldListener;
	BattlefieldRenderer renderer;
	
	Rectangle pauseButtonBounds;
	Rectangle resumeButtonBounds;
	Rectangle quitButtonBounds;
	
	public BattleScreen() {
		battlefieldEventHandler = new BattlefieldEventHandler() {
			@Override
			public void playerHit() {
				Assets.playSound(Assets.playerHit);
			}
			@Override
			public void playerAttack() {
				Assets.playSound(Assets.playerAttack);
			}
			@Override
			public void playerDie() {
				Assets.playSound(Assets.playerDying);
			}
			@Override
			public void enemyHit(Enemy enemy) {
				Assets.playSound(enemy.hitSound);
			}
			@Override
			public void enemyAttack(Enemy enemy) {
				Assets.playSound(enemy.attackSound);
			}
		};
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
}
