package com.cal.angelgame.player;

import com.cal.angelgame.Character;
import com.cal.angelgame.skill.Skill;
import com.cal.angelgame.skill.SkillTree;

public abstract class PlayerCharacter extends Character {
	
	/**
	 * Player controlled character
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	int currLevel = 0;
	int xp = 0;
	int levelUpXp = 100;
	int levels = 10;
	Skill unlockedSkill[] = new Skill[levels];
	SkillTree skillTree[][];
	boolean dead = false;
	public String characterType;
	
	public PlayerCharacter(float x, float y, float width, float height,
			int str, int def, int speed, int health, int healthSteal, String characterType){
		super(x, y, width, height, str, def, speed, health, healthSteal);
		// TODO Auto-generated constructor stub
		this.characterType = characterType;
	}

	public void levelUp(int str, int def, int speed, int health,
			int healthSteal, Skill skillPicked){
		str += 10;
		def += 10;
		speed += 5;
		health += 10;
		healthSteal += 3;
		levelUpXp *= 10;
		unlockedSkill[currLevel] = skillPicked;
		currLevel += 1;
	}
	
}
