package Graphics;

import java.awt.Font;
import java.awt.image.BufferedImage;

public class Assets {
	
	public static boolean loaded = false;
	public static float count = 0;
	public static float MAX_COUNT = 57;
	
	
	public static BufferedImage[] player = new BufferedImage[2];
	
	// effects
	
	public static BufferedImage[] shipSpeed = new BufferedImage[2]; 
	public static BufferedImage shipCadence;
	public static BufferedImage[] shipReduceSpeed = new BufferedImage[2];
	public static BufferedImage shipHealth;
	
	// explosion
	
	public static BufferedImage[] exp = new BufferedImage[5];
	
	// lasers
	
	public static BufferedImage laser;
	
	// CosmicDanger
	
	public static BufferedImage meteors;
    public static BufferedImage blackHole;
    public static BufferedImage[] planet = new BufferedImage[2];
;	
	// numbers
	
	public static BufferedImage[] numbers = new BufferedImage[11];
	
	public static BufferedImage life;
	
	// ui
	
	public static BufferedImage blueBtn;
	public static BufferedImage greyBtn;
	
	// power ups
	
	public static BufferedImage cadence, speed, reduceSpeed, health;
	
	public static void init()
	{
		shipCadence = loadImage("nave_powerup_cadenia.gif");

		shipHealth = loadImage("nave_recuperando_vida.gif");
		
		laser = loadImage("lasegreen.gif");
		
		meteors = loadImage("asteroide.gif");

		blackHole = loadImage("agujero_negro.gif");

		cadence = loadImage("powerup_cadencia.gif");

		speed = loadImage("powerup_boost.gif");

		reduceSpeed = loadImage("powerup_reduce.gif");

		health = loadImage("vida.gif");
		
		for(int i = 0; i < 3; i++)
			shieldEffect[i] = loadImage("/effects/shield" + (i + 1) +".png"); 
		
		for(int i = 0; i < bigs.length; i++)
			bigs[i] = loadImage("/meteors/big"+(i+1)+".png");
		
		for(int i = 0; i < meds.length; i++)
			meds[i] = loadImage("/meteors/med"+(i+1)+".png");
		
		for(int i = 0; i < smalls.length; i++)
			smalls[i] = loadImage("/meteors/small"+(i+1)+".png");
		
		for(int i = 0; i < tinies.length; i++)
			tinies[i] = loadImage("/meteors/tiny"+(i+1)+".png");
		
		for(int i = 0; i < exp.length; i++)
			exp[i] = loadImage("/explosion/"+i+".png");
		
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = loadImage("/numbers/"+i+".png");
		
		backgroundMusic = loadSound("/sounds/backgroundMusic.wav");
		explosion = loadSound("/sounds/explosion.wav");
		playerLoose = loadSound("/sounds/playerLoose.wav");
		playerShoot = loadSound("/sounds/playerShoot.wav");
		ufoShoot = loadSound("/sounds/ufoShoot.wav");
		powerUp = loadSound("/sounds/powerUp.wav");
		
		greyBtn = loadImage("/ui/grey_button.png");
		blueBtn = loadImage("/ui/blue_button.png");
		
		orb = loadImage("/powers/orb.png");
		doubleScore = loadImage("/powers/doubleScore.png");
		doubleGun = loadImage("/powers/doubleGun.png");
		fastFire = loadImage("/powers/fastFire.png");
		star = loadImage("/powers/star.png");
		shield = loadImage("/powers/shield.png");
		
		// ===========================================================
		
		loaded = true;
		
	}

	public static BufferedImage loadImage(String path) {
		count ++;
		return Loader.ImageLoader(path);
	}
	public static Font loadFont(String path, int size) {
		count ++;
		return Loader.loadFont(path, size);
	}
	public static Clip loadSound(String path) {
		count ++;
		return Loader.loadSound(path);
	}
	
}