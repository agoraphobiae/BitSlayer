package com.cal.angelgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class AngelGameDesktop {
	public static void main (String[] argv) {
		new LwjglApplication(new AngelGame(), "::BIT SLAYER::",
				AngelGame.SCREEN_WIDTH, AngelGame.SCREEN_HEIGHT, false);
	}
}
