package com.jeremyfeltracco.spaceshapes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;

/**
 * Created by Jeremy on 10/25/2014.
 */
public class UserInterface {
    private Stage stage;
    private Table table;
    // For debug drawing
    private ShapeRenderer shapeRenderer;

    public void create () {
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        TextureAtlas atlas = new TextureAtlas(new FileHandle("ui/uiskin.atlas"));

        Skin skin = new Skin(new FileHandle("ui/uiskin.json"), atlas);

        table = new Table();
        table.setFillParent(true);

        TextField text = new TextField("hey", skin, "default");
        table.add(text);

        stage.addActor(table);



        shapeRenderer = new ShapeRenderer();

        // Add widgets to the table here.
    }

    public void resize (int width, int height) {
        stage.getViewport().update(width, height, true);
    }

    public void render () {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();

        table.drawDebug(shapeRenderer); // This is optional, but enables debug lines for tables.
    }

    public void dispose() {
        stage.dispose();
        shapeRenderer.dispose();
    }
}
