package com.mygdx.slashtrainer; // import purpose

// import necessary classes
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Player {
    // variables names set
    private Texture texture; // store players image
    private Vector2 position; // track players position

    // create Player with these properties
    public Player() {
        texture = new Texture("catpixel.png");
        position = new Vector2(100, 100);
    }

    // update method based on deltaTime (set in Game Class)
    public void update(float deltaTime) {
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            position.x -= 200 * deltaTime;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            position.x += 200 * deltaTime;
        }
    }

    // render method to draw the player using SpriteBatch
    public void render(SpriteBatch batch) {
        batch.draw(texture, position.x, position.y,60, 60);
    }

    // make sure each Player instance has a dispose method
    public void dispose() {
        texture.dispose();
    }
}
