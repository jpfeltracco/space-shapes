package com.jeremyfeltracco.spaceshapes;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;


public class SpaceShapes extends Game {
    UserInterface ui;
    TextureAtlas atlas;
    Sprite pentagon;
    SpriteBatch batch;

	@Override
	public void create () {
        ui = new UserInterface();
        ui.create();

        batch = new SpriteBatch();
        atlas = new TextureAtlas("packedAssets/packed.atlas");
        pentagon = atlas.createSprite("pentagon");

	}

	@Override
	public void render () {
        // Clear the screen
		Gdx.gl.glClearColor(0.23f, 0.23f, 0.23f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        pentagon.draw(batch);
        batch.end();

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
