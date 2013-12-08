package com.cal.angelgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.cal.angelgame.Battlefield.BattlefieldEventHandler;
import com.cal.angelgame.enemy.Enemy;

public class BattleScreen implements Screen {
	/**
	 * Screen with draw and update functions for the 
	 * main gameplay mode.
	 * 
	 * Handles main game loop player input. See Battlefield
	 * for main game loop logic.
	 */
	// states
	static final int GAME_RUNNING = 0;
	static final int GAME_PAUSED = 1;
	static final int GAME_LEVEL_END = 2;
	static final int GAME_OVER = 3;
	
	Game game;
	
	int curState;
	OrthographicCamera guiCam;
	Vector3 touchPoint;
	SpriteBatch batcher;
	
	Battlefield battlefield;
	BattlefieldEventHandler handler;
	BattlefieldRenderer renderer;
	
	Rectangle pauseButtonBounds;
	
	public BattleScreen() {
		this.game = game;
		
		curState = GAME_RUNNING;
		guiCam = new OrthographicCamera(AngelGame.SCREEN_WIDTH, AngelGame.SCREEN_HEIGHT);
		guiCam.position.set(AngelGame.SCREEN_WIDTH / 2, AngelGame.SCREEN_HEIGHT / 2, 0);
		touchPoint = new Vector3();
		batcher = new SpriteBatch();
		handler = new BattlefieldEventHandler() {
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
		battlefield = new Battlefield(handler);
		renderer = new BattlefieldRenderer(batcher, battlefield);
		pauseButtonBounds = new Rectangle(AngelGame.SCREEN_WIDTH - 100, AngelGame.SCREEN_HEIGHT - 100,
				64, 64);
	}
	
	public void update(float deltaTime) {
		// account for lag
		if (deltaTime > 0.1f) deltaTime = 0.1f;
		
		switch (curState) {
		case GAME_RUNNING:
			updateRunning(deltaTime);
			break;
		case GAME_PAUSED:
			updatePaused();
			break;
		case GAME_LEVEL_END:
			updateLevelEnd();
			break;
		case GAME_OVER:
			updateGameOver();
			break;
		}
	}
	
	public void updateRunning(float deltaTime) {
		if (Gdx.input.justTouched()) {
			if (OverlapTester.pointInRectangle(pauseButtonBounds, Gdx.input.getX(), Gdx.input.getY()))
			{
				Assets.playSound(Assets.tapSound);
				curState = GAME_PAUSED;
				return;
			}
		}
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
