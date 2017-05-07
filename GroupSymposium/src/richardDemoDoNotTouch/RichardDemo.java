package richardDemoDoNotTouch;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import guiPractice.components.AnimatedComponent;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;
import guiPractice.components.ClickableGraphic;
import guiPractice.Screen;
import guiPractice.TextLabel;
import guiPractice.ClickableScreen;
import guiPractice.GUIApplication;

public class RichardDemo extends GUIApplication implements MouseMotionListener, MouseListener{

	public static RichardDemo demos;
	public static Screen demo;
	
	public RichardDemo() {
		// TODO Auto-generated constructor stub
		setBounds(50,50,1000,600);
	}
	
	public static void main(String[] args) {
		demos = new RichardDemo();
		Thread app = new Thread(demos);
		app.start();
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		demo = new DemoScreen(1000, 600);
		setScreen(demo);
	}
private static class DemoScreen extends ClickableScreen {

	public DemoScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	private ClickableGraphic background;
	
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		background = new ClickableGraphic(1,1,1.0,"src/resources/bluescreenofdeath.png");
		background.setAction(new Action(){
			public void act(){
				
			}
		}
				);
		
		viewObjects.add(background);
	}
}

}
