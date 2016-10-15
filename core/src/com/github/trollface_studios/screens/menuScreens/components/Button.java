package com.github.trollface_studios.screens.menuScreens.components;

import java.util.function.Consumer;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.github.trollface_studios.GameComponent;
import com.github.trollface_studios.TrololusGame;

public class Button implements GameComponent {

	Texture texture;
	Rectangle position;
	Consumer<Void> clickAction;
	
	public Button(Consumer<Void> clickAction, Rectangle position, Texture texture){
		this.clickAction = clickAction;
		this.position = position;
		this.texture = texture;
	}
	
	@Override
	public void draw(float delta) {
		TrololusGame.GetSelf().getBatch().draw(texture, position);
	}

	@Override
	public void update(float delta) {
		//TODO
	}
}
