package com.DwarfPlanet.TheTower.framework;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	Handler handler;
	
	int walkSpeed = 5;
	
	public KeyInput(Handler handler){
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		for (int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ObjectId.Player){
				if(key == KeyEvent.VK_D)
					tempObject.setVelX(walkSpeed);
				if(key == KeyEvent.VK_A)
					tempObject.setVelX(-walkSpeed);
				if(key == KeyEvent.VK_W)
					tempObject.setVelY(-walkSpeed);
				if(key == KeyEvent.VK_S)
					tempObject.setVelY(walkSpeed);
				
			}
		}
		
		if(key == KeyEvent.VK_ESCAPE)
			System.exit(0);
		
	}
		public void keyReleased(KeyEvent e){
			int key = e.getKeyCode();
			
			for (int i = 0; i < handler.object.size(); i++){
				GameObject tempObject = handler.object.get(i);
				
				if(tempObject.getId() == ObjectId.Player){
					if(key == KeyEvent.VK_D)
						tempObject.setVelX(0);
					if(key == KeyEvent.VK_A)
						tempObject.setVelX(0);
					if(key == KeyEvent.VK_W)
						tempObject.setVelY(0);
					if(key == KeyEvent.VK_S)
						tempObject.setVelY(0);
					
				}
			}
		}
}
