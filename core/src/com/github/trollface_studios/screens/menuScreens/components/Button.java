package com.github.trollface_studios.screens.menuScreens.components;

import java.util.function.Consumer;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Disposable;
import com.github.trollface_studios.GameComponent;
import com.github.trollface_studios.TrololusGame;

public class Button implements GameComponent, Disposable {

	Texture texture;
	Rectangle position;
	Consumer<Void> clickAction;
	boolean textureDisposeFlag = false;
	
	public Button(Consumer<Void> clickAction, Rectangle position, Texture texture){
		init(clickAction, position, texture);
	}
	
	public Button(Consumer<Void> clickAction, Rectangle position, String texturePath){
		textureDisposeFlag = true;
		init(clickAction, position, new Texture(texturePath));
	}
	
	public Button(Consumer<Void> clickAction, Vector2 position, Texture texture){
		init(clickAction, new Rectangle(position.x, position.y, texture.getWidth(), texture.getHeight()), texture);
	}
	
	public Button(Consumer<Void> clickAction, Vector2 position, String texturePath){
		textureDisposeFlag = true;
		Texture img = new Texture(texturePath);
		init(clickAction, new Rectangle(position.x, position.y, img.getWidth(), img.getHeight()), img);
	}
	
	public Button(Consumer<Void> clickAction, float x, float y, Texture texture){
		init(clickAction, new Rectangle(x, y, texture.getWidth(), texture.getHeight()), texture);
	}
	
	public Button(Consumer<Void> clickAction,float x, float y, String texturePath){
		textureDisposeFlag = true;
		Texture img = new Texture(texturePath);
		init(clickAction, new Rectangle(x, y, img.getWidth(), img.getHeight()), img);
	}
	
	public void init(Consumer<Void> clickAction, Rectangle position, Texture texture){
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

	@Override
	public void dispose() {
		if (textureDisposeFlag) {
			texture.dispose();
		}
	}
}
