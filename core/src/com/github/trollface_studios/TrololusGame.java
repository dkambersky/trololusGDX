package com.github.trollface_studios;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.github.trollface_studios.screens.menuScreens.MainMenuScreen;

public class TrololusGame extends Game {
	SpriteBatch batch;
	Texture img;
	
	static TrololusGame self;
	public static TrololusGame GetSelf(){
		return self;
	}
	
	@Override
	public void create () {
		self = this;
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		setScreen(new MainMenuScreen());
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
