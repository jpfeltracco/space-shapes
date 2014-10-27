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

    public void create () {
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        Skin skin = new Skin(new FileHandle("ui/uiskin.json"), new TextureAtlas(new FileHandle("ui/uiskin.atlas")));

        table = new Table();
        table.setFillParent(true);

        stage.addActor(table);

        TextField text = new TextField("hey", skin, "default");
        table.add(text);


        // Add widgets to the table here.
    }

    public void resize (int width, int height) {
        stage.getViewport().update(width, height, true); // Updates stage viewport and centers it
    }

    public void render () {
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    public void dispose() {
        stage.dispose();
    }
}
