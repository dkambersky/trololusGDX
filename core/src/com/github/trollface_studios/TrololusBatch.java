package com.github.trollface_studios;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class TrololusBatch extends SpriteBatch {
	public void draw(Texture texture, Vector2 position){
		super.draw(texture, position.x, position.y);
	}
	public void draw(Texture texture, Rectangle position){
		super.draw(texture, position.x, position.y, position.width, position.height);
	}
}
