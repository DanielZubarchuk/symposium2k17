package rhbattlesandstuff;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.ClickableScreen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class CreateYourOwnCharacterAndWeaponScreen extends ClickableScreen implements MouseMotionListener, MouseListener {

	private Graphic lbsod;
	
	
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
		viewObjects.add(lbsod);
	}

	
}
