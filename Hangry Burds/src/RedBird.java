import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class RedBird{
	private Image img; 	
	private AffineTransform tx;
	private double x =0,y=0;
	private double xSpeed = (Math.random()*5)+5, ySpeed =(Math.random()*5)+5;
	public RedBird(double x, double y) {
		img = getImage("/imgs/Red Bird.png"); //load the image for Tree
		this.x = x;
		this.y= y;

		tx = AffineTransform.getTranslateInstance(0, 0);
		update(); 				//initialize the location of the image
									//use your variables
	}
	
	public void changePicture(String newFileName) {
		img = getImage(newFileName);
		update();
	}
	
	public void paint(Graphics g) {
		//these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(img, tx, null);
		x-=xSpeed;
		y+=ySpeed;
		if (x >= 740||x <=5) {
			xSpeed*=-1;
		}
		if (y >= 385|| y <= 5 ) {
			ySpeed*=-1;
		}
		update();
		
	}
	
	private void update() {
		tx.setToTranslation(x,y);
		tx.scale(.15, .15);
	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(.25, .25);
	}
	public double getZombieX() {
		return x;
	}
	public double getZombieY() {
		return y;
	}
	public double getZombieSpeedX() {
		return xSpeed;
	}
	public double getZombieSpeedY() {
		return ySpeed;
	}
	public void setZombieSpeedX(double newXSpeed) {
		xSpeed = newXSpeed;
	}
	public void setZombieSpeedY(double newYSpeed) {
		ySpeed = newYSpeed;
	}
	/*
	public void zombieFloat() {
		xSpeed =0;
		while (y>=-100) {
			y-=5;
		}
	}
	*/
	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = RedBird.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}

}
