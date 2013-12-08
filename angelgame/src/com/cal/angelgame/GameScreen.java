package com.cal.angelgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.cal.angelgame.Level.WorldListener;


public class GameScreen implements Screen{
	static final int GAME_READY = 0;
	static final int GAME_RUNNING = 1;
	static final int GAME_PAUSED = 2;
	static final int GAME_LEVEL_END = 3;
	static final int GAME_OVER = 4;
	
	int currstate;//current state
	Game game;
	
	//copypasta
	OrthographicCamera guiCam;
	Vector2 touchPoint;
	SpriteBatch batcher;
	Level world;
	WorldListener worldListener;
	WorldRenderer renderer;
	
	public GameScreen(Game game) {
		this.game = game;
		
		currstate = GAME_READY;
		guiCam = new OrthographicCamera(320, 480);
		guiCam.position.set(320 / 2, 480 / 2, 0);
		touchPoint = new Vector2();
		batcher = new SpriteBatch();
		
		worldListener = new WorldListener() {

			@Override
			public void playerHits() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void enemyHits() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void playerDies() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void enemyDies() {
				// TODO Auto-generated method stub
				
			}
			// pass
		};
		
		world = new Level(worldListener);
		renderer = new WorldRenderer(batcher, world);
	}

	public void render(float num){}
	
	public void resume(){}
	
	public void dispose(){}
	
	public void show(){}
	
	public void hide(){}
	
	public void resize(int num1, int num2){}
	
	public void pause(){}
	
//	public void update(float deltaTime){
//		//lag control
//		if (deltaTime > 0.1f) deltaTime = 0.1f;
//		
//		switch (currstate) {
//		case GAME_READY:
//			updateReady();
//			break;
//		case GAME_RUNNING:
//			updateRunning(deltaTime);
//			break;
//		case GAME_PAUSED:
//			updatePaused();
//			break;
//		case GAME_LEVEL_END:
//			updateLevelEnd();
//			break;
//		case GAME_OVER:
//			updateGameOver();
//			break;
//		}
//	}
}
