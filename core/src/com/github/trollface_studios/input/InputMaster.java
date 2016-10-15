package com.github.trollface_studios.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.math.Vector2;

public class InputMaster {
	public static Vector2 getMousePosition(){
		return new Vector2(Gdx.input.getX(), Gdx.graphics.getHeight()-Gdx.input.getY());
	}
}
