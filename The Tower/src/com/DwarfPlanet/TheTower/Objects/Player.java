package com.DwarfPlanet.TheTower.Objects;

import java.awt.image.BufferedImage;
import java.util.LinkedList;

import com.DwarfPlanet.TheTower.Draw;
import com.DwarfPlanet.TheTower.Game;
import com.DwarfPlanet.TheTower.framework.BufferedImageLoader;
import com.DwarfPlanet.TheTower.framework.GameObject;
import com.DwarfPlanet.TheTower.framework.Handler;
import com.DwarfPlanet.TheTower.framework.ObjectId;
import com.DwarfPlanet.TheTower.framework.Side;

public class Player extends GameObject{
	
	private Handler handler;
	private static final BufferedImage image = BufferedImageLoader.loadImage("/Level-1.png");

	public Player(float x, float y,Handler handler) {
		super(x, y, 64f, 64f, ObjectId.Player);
		this.handler = handler;
		width = 64;
		height = 64;
	}

	
	public void tick(LinkedList<GameObject> object) {
		x += velX;
		y += velY;
		
		Game.camX = (int) x - Game.width / 2 + (int)width / 2;
		Game.camY = (int)y - Game.height / 2 + (int)height / 2;
		
	}

	
	public void render() {
		//Draw.rectangle((int)x, (int)y, (int) width, (int) height, 0xffffff);
		Draw.texture((int) x, (int) y, (int) width,  (int) height, image, 0, 0, false);
	}
}
