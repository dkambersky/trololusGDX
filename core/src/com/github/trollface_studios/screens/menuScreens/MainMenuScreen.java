package com.github.trollface_studios.screens.menuScreens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.github.trollface_studios.TrololusGame;
import com.github.trollface_studios.input.StateInputProcessor;

public class MainMenuScreen extends MenuScreen {

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
	}

	public void update(float delta) {
		if (Gdx.input.isKeyJustPressed(Keys.C))
			System.out.println("Or there's this, ugly, way");
	}
}