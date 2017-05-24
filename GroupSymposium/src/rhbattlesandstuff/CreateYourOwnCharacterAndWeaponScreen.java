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
	private String[] gender = {"male", "female"};
	private int select = 0;
	private Graphic male;
	private Graphic female;
	private boolean madeSelection = false;
	
	
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
		//CHANGE THIS LATER SO IT DISPLAYS ON THE SCREEN!!!!!!!!!!!!!!!!!!!!!!!!!!!!111!!!!!!!
		if (k.getKeyCode() == KeyEvent.VK_LEFT ){
			System.out.println("LEFT");
			select = 0;
			madeSelection = true;
		}
		else if(k.getKeyCode() == KeyEvent.VK_RIGHT){
			System.out.println("RIGHT");
			select = 1;
			madeSelection = true;
		}
		if(madeSelection && k.getKeyCode() == KeyEvent.VK_Z){
			System.out.println("You have selected " + gender[select] + ".");
		}
		
	}
	
}
