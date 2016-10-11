package com.github.trollface_studios.Screens;

import com.badlogic.gdx.Screen;

public abstract class TrololusScreen implements Screen {
	
	public abstract void draw(float delta);
	
	public abstract void update(float delta);
	
	@Override
	public final void render(float delta) {
		update(delta);
		draw(delta);
	}
}
