package com.cal.angelgame.skill;

public class SkillTree {
	/**
	 * The skills that the character can obtain divided into a tree
	 */
	final int skillSet = 2;
	final int maxLevels = 5;
	Skill skills[][] = new Skill[maxLevels][skillSet];
}
