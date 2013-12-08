package com.cal.angelgame;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.World;

public class WorldRenderer {
	
	// get these from eric
	public static final int SCREEN_WIDTH = 1136;
	public static final int SCREEN_HEIGHT = 640;
	
	Level world;
	SpriteBatch batch;
	OrthographicCamera cam;
	TextureRegion background;
	
	public WorldRenderer(SpriteBatch batch, Level world) {
		this.world = world;
		this.cam = new OrthographicCamera();
		this.cam.setToOrtho(false, SCREEN_WIDTH, SCREEN_HEIGHT);
		this.batch = batch;
	}
	
	public void render() {
		// pass
	}

}
