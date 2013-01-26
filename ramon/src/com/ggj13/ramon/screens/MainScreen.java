package com.ggj13.ramon.screens;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.ggj13.ramon.Ramon;
import com.ggj13.ramon.entities.Entity;

public class MainScreen implements Screen {
	private Ramon game;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	Sprite map;
	private Texture texture;
	ArrayList<Entity> entities;
	Entity player;
	Texture playerTexture;
	
	public MainScreen(Ramon game) {
		this.game = game;

		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, w/h);
		batch = new SpriteBatch();
		
		texture = new Texture(Gdx.files.internal("data/mappa.PNG"));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		playerTexture = new Texture(Gdx.files.internal("data/nemico.png"));
		playerTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);		
		
		map = new Sprite(texture);
		map.setSize(0.5f, 0.5f);
		map.setOrigin(map.getWidth()/2, map.getHeight()/2);
		map.setPosition(-map.getWidth()/2, -map.getHeight()/2);
		player = new Entity(playerTexture);
		entities = new ArrayList<Entity>();
		entities.add(player);
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
		handleControls();
		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		map.draw(batch);
		
		/*
		for( Entity e : entities){
			e.sprite.draw(batch);
			
		}
		*/
		
		player.sprite.draw(batch);
		batch.end();

	}

	private void handleControls() {
		// TODO Auto-generated method stub
		if(Gdx.input.isKeyPressed(Keys.UP)){
			player.setY(player.getY() + player.speed);
		}
		if(Gdx.input.isKeyPressed(Keys.DOWN)){
			player.setY(player.getY() - player.speed);
		}if(Gdx.input.isKeyPressed(Keys.LEFT)){
			player.setX(player.getX() - player.speed);
		}if(Gdx.input.isKeyPressed(Keys.RIGHT)){
			player.setX(player.getX() + player.speed);
		}
		
				
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		

	}

	@Override
	public void hide() {
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
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
