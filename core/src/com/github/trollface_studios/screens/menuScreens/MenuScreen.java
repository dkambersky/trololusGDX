package com.github.trollface_studios.screens.menuScreens;

import com.badlogic.gdx.Screen;
import com.github.trollface_studios.TrololusGame;
import com.github.trollface_studios.screens.TrololusScreen;
import com.github.trollface_studios.screens.menuScreens.components.Button;

public abstract class MenuScreen extends TrololusScreen {
	
	protected Button[] buttons;

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	public void update(float delta){
		for (Button button : buttons) {
			button.update(delta);
		}
	};

	public void draw(float delta){
		for (Button button : buttons) {
			button.draw(delta);
		}
	};
	
	@Override
	public void dispose(){
		for (Button button : buttons) {
			button.dispose();
		}
	}
	
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
