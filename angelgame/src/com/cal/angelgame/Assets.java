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
	public static Sound winGame;
	public static Sound endGame;
	public static Sound playerAttack;
	public static Sound playerDies;
	public static Sound playerHit;
	public static Sound levelUp;
	public static Sound monsterAttack;
	public static Sound monsterDies;
	public static Sound monsterHit;
	public static Sound tapSound;
	public static Sound gameWin;
	
	public static Texture background;
	public static Texture logo;
	public static Texture start;
	public static Texture enemyDeadLeft;
	public static Texture enemyLeft; 
	public static Texture gameOver;

	public static Texture monsterhealth;
	public static Texture playerDie;
	public static Texture playerhealth;
	public static Texture playerStrike;
	public static Texture playerIdle;
	public static Texture playerEndLevelRight;
	public static Texture playerGroundPoundRight;
	public static Texture pauseButton;
	public static Texture pauseLogo;
	public static Texture skillDoubleHit;
	public static Texture skillGroundPound;
	public static Texture skillHealthRegen;
	public static Texture skillInstantKill;
	public static Texture skillSpeed;
	public static Texture skillStealthHealth;
	public static Texture skillTank;
	public static Texture skillThreeHitCombo;
	public static Texture upDef;
	public static Texture upSpeed;
	public static Texture upStr;
	
	//public static Texture items;
	//public static TextureRegion soundOn;
	//public static TextureRegion soundOff;
	//public static Sound skillSFX;
	//public static Sound enemyHit;
	//public static Sound enemyAttack;
	//public static Sound tapSound;
	
//	public static BitmapFont font;
//	
//	public static Animation playerMove;
//	public static Animation playerStrike;
//	public static Animation playerDie;
//	public static Animation playerSkill;
//	public static Animation playerIdle;
//	
//	public static TextureRegion enemyMove; //should be animation but can't
//	public static Animation enemyStrike;
//	public static Animation enemyWounded;
//	public static Animation enemyDie;
	
	public static Texture loadTexture(String file) {
		return new Texture(Gdx.files.internal(file));
	}
	
	public static void load() {
		/**
		 * Load internal assets from assets/ folder
		 * Including images and sound. Store into public vars defined above.
		 */
		// TODO: implement
		background  = loadTexture("Sprites/1136_640_BG");
		logo  = loadTexture("Sprites/BitSlayerLogo");
		start  = loadTexture("Sprites/StartButton");
		enemyDeadLeft  = loadTexture("Sprites/EnemyDeadLeft");
		enemyLeft  = loadTexture("Sprites/EnemyLeft");
		gameOver  = loadTexture("Sprites/GameOver");
		monsterhealth = loadTexture("Sprites/Health100");
		playerhealth = loadTexture("Sprites/Health100");
		playerStrike = loadTexture("Sprites/HeroAttackRight");
		playerDie = loadTexture("Sprites/HeroDead");
		playerIdle = loadTexture("Sprites/HeroRight");
		playerEndLevelRight = loadTexture("Sprites/HeroFrontRight");
		playerGroundPoundRight = loadTexture("Sprites/HeroGroundPoundRight");
		pauseButton = loadTexture("Sprites/PauseButton");
		pauseLogo = loadTexture("Sprites/PauseText");
		skillDoubleHit = loadTexture("Sprites/SkillDoubleHit");
		skillGroundPound = loadTexture("Sprites/SkillGroundPound");
		skillHealthRegen = loadTexture("Sprites/SkillHealthRegen");
		skillInstantKill = loadTexture("Sprites/SkillInstantKill");
		skillSpeed = loadTexture("Sprites/SkillSpeed");
		skillStealthHealth = loadTexture("Sprites/SkillStealthHealth");
		skillTank = loadTexture("Sprites/SkillTank");
		skillThreeHitCombo = loadTexture("Sprites/SkillThreeHitCombo");
		upDef = loadTexture("Sprites/Updef");
		upSpeed = loadTexture("Sprites/UpSpeed");
		upStr = loadTexture("Sprites/UpStr");
		
		bgMusic = Gdx.audio.newMusic(Gdx.files.internal("Sounds/miami.mp3"));
		bgMusic.setLooping(true);
		bgMusic.setVolume(0.5f);
		
		if (Settings.soundEnabled) bgMusic.play();
		bgMusic = Gdx.audio.newMusic(Gdx.files.internal("Sounds/BackGround.mp3"));
		winGame = Gdx.audio.newSound(Gdx.files.internal("Sounds/WinGame.wav"));
		endGame = Gdx.audio.newSound(Gdx.files.internal("Sounds/EndGame.wav"));
		playerAttack = Gdx.audio.newSound(Gdx.files.internal("Sounds/HeroAttack"));
		playerDies = Gdx.audio.newSound(Gdx.files.internal("Sounds/HeroDies.wav"));
		playerHit = Gdx.audio.newSound(Gdx.files.internal("Sounds/HeroHurt.wav"));
		levelUp = Gdx.audio.newSound(Gdx.files.internal("Sounds/LevelUp.wav"));
		monsterAttack = Gdx.audio.newSound(Gdx.files.internal("Sounds/MonsterAttack.wav"));
		monsterDies = Gdx.audio.newSound(Gdx.files.internal("Sounds/MonsterDies.wav"));
		monsterHit = Gdx.audio.newSound(Gdx.files.internal("Sounds/MonsterHurt.wav"));
		tapSound = Gdx.audio.newSound(Gdx.files.internal("Sounds/PauseSound.wav"));
	
		//need to implement animations
		
	}
	
	public static void playSound(Sound sound) {
		if (Settings.soundEnabled) sound.play(1);
	}

}
