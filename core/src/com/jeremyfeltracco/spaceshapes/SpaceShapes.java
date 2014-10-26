package com.jeremyfeltracco.spaceshapes;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;


public class SpaceShapes extends Game {
    UserInterface ui;

	@Override
	public void create () {
        ui = new UserInterface();
        ui.create();
	}

	@Override
	public void render () {
        // Clear the screen
		Gdx.gl.glClearColor(0.5f, 0.5f, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        ui.render(); // Render the UI last
	}

    @Override
    public void resize(int width, int height) {
        ui.resize(width, height);
    }

    @Override
    public void dispose() {
        ui.dispose();
    }
}
