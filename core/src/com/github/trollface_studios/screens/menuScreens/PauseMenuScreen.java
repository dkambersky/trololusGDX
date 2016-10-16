package com.github.trollface_studios.screens.menuScreens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.github.trollface_studios.TrololusGame;
import com.github.trollface_studios.screens.TrololusScreen;
import com.github.trollface_studios.screens.menuScreens.components.Button;

public class PauseMenuScreen extends MenuScreen  {

	TrololusScreen originScreen;
	
	public PauseMenuScreen(TrololusScreen originScreen) {
		this.originScreen = originScreen;
		buttons = new Button[]{
				new Button(a->{
					TrololusGame.GetSelf().setScreen(originScreen);
					this.dispose();
				}, 10,300, "button1.png"),
				new Button(a->{
					originScreen.dispose();
				}, 80,200, "button2.png")
		};
	}
	
	@Override
	public void draw(float delta) {
		originScreen.draw(0);
		//TODO draw filter here
		super.draw(delta);
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void update(float delta) {
		super.update(delta);
	}

}
