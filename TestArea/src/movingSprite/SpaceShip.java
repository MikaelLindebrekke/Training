package movingSprite;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class SpaceShip extends Sprite {

	private int directionX; 
	private int directionY;
	private final int SPEED = 3; 
	private List<Missile> missiles; 
	
	
	public SpaceShip(int x, int y) {
		super(x, y);
		
		initCraft();
	}
	
	private void initCraft() {
		missiles = new ArrayList<>();
		loadImage("Resources/SpaceShip.png");
		getImageDimensions(); 
	}
	
	public void move() {
		x += directionX; 
		y += directionY; 
		
		if (x < 1)
			x = 1; 
		
		if (y < 1) 
			y = 1; 
	}
	
	public List<Missile> getMissiles() {
		return missiles; 
	}

	
	public void keyPressed(KeyEvent e) { 
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_SPACE)
			fire();
		if (key == KeyEvent.VK_LEFT) 
			directionX = -SPEED; 
		
		if (key == KeyEvent.VK_RIGHT)
			directionX = SPEED; 
		
		if (key == KeyEvent.VK_UP)
			directionY = -SPEED; 
		
		if (key == KeyEvent.VK_DOWN)
			directionY = SPEED; 
	}
	public void fire() {
		missiles.add(new Missile(x + width, y + height / 2));
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT)
			directionX = 0; 
		
		if (key == KeyEvent.VK_RIGHT)
			directionX = 0;
		
		if (key == KeyEvent.VK_UP)
			directionY = 0; 
		
		if (key == KeyEvent.VK_DOWN)
			directionY = 0; 
		
	}
	
	
	
	
	
	
	
}
