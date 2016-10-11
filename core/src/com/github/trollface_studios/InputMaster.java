package com.github.trollface_studios;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class InputMaster {
	
	private static Input formerInput;
	
	public static Boolean IsMouseLeftClicked(){
		return !formerInput.isButtonPressed(Input.Buttons.LEFT) & (formerInput = Gdx.input).isButtonPressed(Input.Buttons.LEFT);
	}
}
