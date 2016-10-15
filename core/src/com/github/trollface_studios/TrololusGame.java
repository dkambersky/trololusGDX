package com.github.trollface_studios;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.github.trollface_studios.input.TrololusInputProcessor;
import com.github.trollface_studios.screens.menuScreens.MainMenuScreen;

public class TrololusGame extends Game {
	TrololusBatch batch;
	Texture img;
	InputMultiplexer multiplexer;
	static TrololusGame self;

	public static TrololusGame GetSelf() {
		return self;
	}

	public InputMultiplexer getInput() {
		return multiplexer;
	}
	
	public TrololusBatch getBatch() {
		return batch;
	}
	@Override
	public void create() {
		self = this;
		batch = new TrololusBatch();
		img = new Texture("badlogic.jpg");
		multiplexer = new InputMultiplexer();
		multiplexer.addProcessor(new TrololusInputProcessor());
		Gdx.input.setInputProcessor(multiplexer);

		setScreen(new MainMenuScreen());
	}

	@Override
	public void render() {
		super.render();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);

		batch.end();
	}

	@Override
	public void dispose() {
		batch.dispose();
		img.dispose();
	}


}
