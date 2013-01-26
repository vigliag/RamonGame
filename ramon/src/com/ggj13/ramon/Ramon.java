package com.ggj13.ramon;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.ggj13.ramon.screens.MainScreen;
import com.ggj13.ramon.screens.SplashScreen;



public class Ramon extends Game {
	
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Sprite sprite;
	private MainScreen mainScreen;
	
	
	@Override
	public void create() {
		
		mainScreen = new MainScreen(this);
		setScreen(mainScreen);
		
	}

	

	
}
