package com.cal.angelgame;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.cal.angelgame.enemy.Enemy;
import com.cal.angelgame.player.PlayerCharacter;

public class BattlefieldRenderer {
	static final float FRUSTUM_WIDTH = 16;
	static final float FRUSTUM_HEIGHT = 9;
	
	Battlefield battlefield;
	OrthographicCamera cam;
	SpriteBatch batch;
	TextureRegion background;
	
	public BattlefieldRenderer (SpriteBatch batch, Battlefield battlefield) {
		this.battlefield = battlefield;
		this.cam = new OrthographicCamera(FRUSTUM_WIDTH, FRUSTUM_HEIGHT);
		this.cam.position.set(FRUSTUM_WIDTH/2, FRUSTUM_HEIGHT/2, 0);
		this.batch = batch;
	}
	
	public void render() {
		cam.update();
		batch.setProjectionMatrix(cam.combined);
		renderBackground();
		renderObjects();
	}
	
	public void renderBackground() {
		batch.disableBlending();
		batch.begin();
		batch.draw(Assets.backgroundRegion, cam.position.x-FRUSTUM_WIDTH/2, cam.position.y-FRUSTUM_HEIGHT/2, 
				FRUSTUM_WIDTH, FRUSTUM_HEIGHT);
		batch.end();
	}
	
	public void renderObjects() {
		batch.enableBlending();
		batch.begin();
		renderPlayer();
		renderEnemies();
		batch.end();
	}
	
	private void renderPlayer() {
		Texture keyFrame;
		switch (battlefield.pchar.curState) {
//		case PlayerCharacter.PLAYER_STATE_ATTACKING:
//			keyFrame = Assets.playerStrike.getKeyFrame(battlefield.pchar.stateTime, Animation.ANIMATION_LOOPING);
//			break;
//		case PlayerCharacter.PLAYER_STATE_MOVING:
//			keyFrame = Assets.playerMove.getKeyFrame(battlefield.pchar.stateTime, Animation.ANIMATION_LOOPING);
//			break;
//		case PlayerCharacter.PLAYER_STATE_DYING:
//			keyFrame = Assets.playerDie.getKeyFrame(battlefield.pchar.stateTime, Animation.ANIMATION_LOOPING);
//			break;
//		case PlayerCharacter.PLAYER_STATE_IDLE:
//		default:
//			keyFrame = Assets.playerIdle.getKeyFrame(battlefield.pchar.stateTime, Animation.ANIMATION_LOOPING);
		case PlayerCharacter.PLAYER_STATE_ATTACKING:
			keyFrame = Assets.playerStrike;
			break;
		case PlayerCharacter.PLAYER_STATE_MOVING:
			keyFrame = Assets.playerStrike;
			break;
		case PlayerCharacter.PLAYER_STATE_DYING:
			keyFrame = Assets.playerDie;
			break;
		case PlayerCharacter.PLAYER_STATE_IDLE:
		default:
			keyFrame = Assets.playerIdle;
		}
		
		if (battlefield.pchar.position.x < battlefield.pchar.destination.x) {
			batch.draw(keyFrame, battlefield.pchar.position.x, battlefield.pchar.position.y,
					battlefield.pchar.width, battlefield.pchar.height);
		} else {
			batch.draw(keyFrame, battlefield.pchar.position.x, battlefield.pchar.position.y,
					battlefield.pchar.width * -1, battlefield.pchar.height);
		}
	}
	
	private void renderEnemies() {
		for (Enemy e: battlefield.enemies) {
//			TextureRegion keyFrame = Assets.enemyMove;
			Texture keyFrame = Assets.enemyLeft;
			int dirsign = 1;
			int deadsign = 1;
			if (e.curState == Enemy.ENEMY_STATE_DYING) {
				deadsign = -1;
				keyFrame = Assets.enemyDeadLeft;
			}
			if (e.position.x < e.destination.x)
				dirsign = -1;
			batch.draw(keyFrame, e.position.x, e.position.y,
					e.width * dirsign, e.height * deadsign);
		}
	}
	

}
