import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*Comments
 * 
 * 
 * very yum
 * 
 * I like the terrain generation
 * 
 * nicep roject
 * legendary game 
 * vwery cool, cvan't beat boweser
 * 
 * good game but clouds spawn on the ground
 * very well made
 * w
 */


/*
 * control
 * arrow keys to move
 * press down at pipe to go to boss fight
 * jump fast
 * I WONNNNNNNNNNNN
 */
public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {

	Background b = new Background(0,0);
	ArrayList<Background> ground = new ArrayList<Background>();
	ArrayList<Background> wall = new ArrayList<Background>();

	
	//Brick[] bricks = {new Brick(300-24,350),new Brick(346-24,350), new Brick(438-24,350), new Brick(484-24,350)};
	 
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		
		
	}
	
	public static void main(String[] arg) {
		/*
		Music pvz = new Music("PVZRemix.wav",true);
		Music ARS = new Music("Air-raid-siren.wav",true);
		ARS.play();
		pvz.play();
		*/
		Music MJ = new Music("MJump.wav",false);
		Music M = new Music("Super Mario Bros. Theme Song.wav",false);
		M.play();
		
		Frame f = new Frame();

	}
	
	public Frame() {
		JFrame f = new JFrame("Duck Hunt");
		f.setSize(new Dimension(1288, 700));
		f.setBackground(Color.blue);
		f.add(this);
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
		f.addMouseListener(this);
		f.addKeyListener(this);
		Timer t = new Timer(8, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//this.setCursor(Toolkit.getDefaultToolkit()
		
	    Toolkit toolkit = Toolkit.getDefaultToolkit();
	    Point hotSpot = new Point(0,0);
	    BufferedImage cursorImage = new BufferedImage(1, 1, BufferedImage.TRANSLUCENT); 
	    Cursor invisibleCursor = toolkit.createCustomCursor(cursorImage, hotSpot, "InvisibleCursor");        
	    setCursor(invisibleCursor);
	    
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		/*
		Music ss = new Music("Sniper.wav",false);
		ss.play();
		*/
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}  
 
	@Override
	public void keyPressed(KeyEvent arg0) { 
		// TODO Auto-generated method stub
		//System.out.println(arg0.getKeyCode());
		
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void collision(double MarioR, double MarioL, double MarioT, double MarioB, double ObjR,double ObjL, double ObjT, double ObjB, boolean Mario) {
		//System.out.println(MSpeedY);
		
		
	}
	public boolean collision(double MarioR, double MarioL, double MarioT, double MarioB, double ObjR,double ObjL, double ObjT, double ObjB, boolean Mario, boolean bool) {
		//System.out.println(MSpeedY);
		return false;
	}

}