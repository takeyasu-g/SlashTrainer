package com.mygdx.slashtrainer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class SlashTrainerGame extends ApplicationAdapter {
    // make player with Player class
    private SpriteBatch batch;
    private Player player;

    @Override
    public void create() {
        batch = new SpriteBatch();
        player = new Player();
    }

    @Override
    public void render() {
        player.update(Gdx.graphics.getDeltaTime());
        batch.begin();
        player.render(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        player.dispose();
    }
}
