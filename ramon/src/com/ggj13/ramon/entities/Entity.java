package com.ggj13.ramon.entities;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Entity {
	
	private Texture texture;
	public Sprite sprite;
	ArrayList<Animation> animations;
	float x,y;
	public float speed = 4;

	

	public float getX() {
		return x;
	}



	public void setX(float x) {
		this.x = x;
		sprite.setX(x);
	}



	public float getY() {
		return y;
		
	}



	public void setY(float y) {
		this.y = y;
		sprite.setY(y);
	}



	public Entity(Texture texture){
		
		this.texture = texture;
		
		sprite = new Sprite(texture);
		sprite.setSize(32,32);
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(0, 0);
		
		
	}
	
	
}
