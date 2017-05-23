package rhbattlesandstuff;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.ClickableScreen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class CreateYourOwnCharacterAndWeaponScreen extends ClickableScreen implements MouseMotionListener, MouseListener {

	private Graphic lbsod;
	private ArrayList<Graphic> gender;
	private Graphic male;
	private Graphic female;
	
	public CreateYourOwnCharacterAndWeaponScreen(int width, int height) {
		// TODO Auto-generated constructor stub
		super(width, height);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void initObjects(ArrayList<Visible> viewObjects){
		lbsod = new Graphic(0,0,1.0,"src/resources/legendarybluescreenofdeath.jpg");
		female = new Graphic(0,0,.5,"src/resources/female.png");
		male = new Graphic(500,0,.5,"src/resources/male.png");
		viewObjects.add(lbsod);
		viewObjects.add(male);
		viewObjects.add(female);
	}

	public void keyPressed(KeyEvent k) {
	
	}
	
}
