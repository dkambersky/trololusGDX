package com.github.trollface_studios.screens.menuScreens;

import com.badlogic.gdx.Screen;
import com.github.trollface_studios.TrololusGame;
import com.github.trollface_studios.screens.menuScreens.components.Button;

public abstract class MenuScreen implements Screen {
	
	protected Button[] buttons;

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public final void render(float delta) {
		this.update(delta);
		for (Button button : buttons) {
			button.update(delta);
		}
		TrololusGame.GetSelf().getBatch().begin();
		this.draw(delta);
		for (Button button : buttons) {
			button.draw(delta);
		}
		TrololusGame.GetSelf().getBatch().end();
	}

	public abstract void update(float delta);

	public abstract void draw(float delta);
	
	@Override
	public final void dispose(){
		for (Button button : buttons) {
			button.dispose();
			menuDispose();
		}
	}
	
	public abstract void menuDispose();
	
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
}
