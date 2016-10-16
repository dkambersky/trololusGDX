package com.github.trollface_studios.screens.menuScreens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.github.trollface_studios.TrololusGame;
import com.github.trollface_studios.input.StateInputProcessor;
import com.github.trollface_studios.screens.menuScreens.components.Button;

public class MainMenuScreen extends MenuScreen {

	Texture img = new Texture("fuzzydice.png");
	
	public MainMenuScreen() {
		TrololusGame.GetSelf().getInput().addProcessor(new StateInputProcessor() {
			@Override
			public boolean keyDown(int keycode) {
				if (keycode == Keys.SPACE) {
					System.out.println("I hear Kravros likes cute asian boys");
					return true;
				}
				return false;
			}

		});
		
		buttons = new Button[]{
			new Button(
				a ->{TrololusGame.GetSelf().setScreen(new PauseMenuScreen(this));},
				20,
				20,
				"button1.png"), 
		};
	}

	@Override
	public void update(float delta) {
		if (Gdx.input.isKeyJustPressed(Keys.C))
			System.out.println("Or there's this, ugly, way");
		super.update(delta);
	}
	
	@Override
	public void draw(float delta){
		TrololusGame.GetSelf().getBatch().draw(img, 0, 0);
		super.draw(delta);
	}
	
	@Override
	public void dispose(){
		super.dispose();
		img.dispose();
	}
}