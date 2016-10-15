package com.github.trollface_studios.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.github.trollface_studios.TrololusGame;

public abstract class TrololusScreen implements Screen {
	
	public abstract void draw(float delta);
	
	public abstract void update(float delta);
	
	@Override
	public final void render(float delta) {
		update(delta);
		TrololusGame.GetSelf().getBatch().begin();
		draw(delta);
		TrololusGame.GetSelf().getBatch().end();
	}
}
