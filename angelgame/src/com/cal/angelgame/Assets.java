package com.cal.angelgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {
	/**
	 * Internal assets, located in the angelgame-android/assets
	 * folder. load()s assets in to memory and also has
	 * playSound().
	 */
	public static Music bgMusic;
	public static Sound playerAttack;
	public static Sound playerHit;
	public static Sound playerDying;
	public static Sound enemyAttack;
	public static Sound enemyHit;
	public static Sound skillSFX;
	public static Sound tapSound;
	public static Sound monsterHit;
	public static Sound monsterAttack;
	
	public static Texture background;
	public static TextureRegion backgroundRegion;
	
	public static Texture items;
	public static TextureRegion healthBar;
	public static TextureRegion pauseMenu;
	public static TextureRegion soundOn;
	public static TextureRegion soundOff;
	public static TextureRegion pauseButton;
	public static TextureRegion logo;
	public static TextureRegion mainMenu;
	public static TextureRegion gameOver;
	
	public static BitmapFont font;
	
	public static Animation playerMove;
	public static Animation playerStrike;
	public static Animation playerWounded;
	public static Animation playerDie;
	public static Animation playerSkill;
	public static Animation playerIdle;
	
	public static TextureRegion enemyMove; //should be animation but can't
	public static Animation enemyStrike;
	public static Animation enemyWounded;
	public static Animation enemyDie;
	
	public static Texture loadTexture(String file) {
		return new Texture(Gdx.files.internal(file));
	}
	
	public static void load() {
		/**
		 * Load internal assets from assets/ folder
		 * Including images and sound. Store into public vars defined above.
		 */
		// TODO: implement
	}
	
	public static void playSound(Sound sound) {
		if (Settings.soundEnabled) sound.play(1);
	}

}
