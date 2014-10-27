package com.jeremyfeltracco.spaceshapes.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.jeremyfeltracco.spaceshapes.SpaceShapes;

public class DesktopLauncher {
	public static void main (String[] arg) {
        // This packs our assets on every run into "packedAssets/packed.atlas"
        TexturePacker.process("../images/toPack", "packedAssets", "packed");

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new SpaceShapes(), config);
	}
}
