package movingSprite;

public class Missile extends Sprite {

	private final int BOARD_WIDTH = 650; 
	private final int MISSILE_SPEED = 3; 
	
	public Missile(int x, int y) {
		super(x, y); 
		initMissile(); 
	}
	
	private void initMissile() {
		loadImage("Resources/Missile.png");
		getImageDimensions(); 
	}
	public void move() {
		x += MISSILE_SPEED;
		if (x > BOARD_WIDTH)
			visible = false; 
	}
}
