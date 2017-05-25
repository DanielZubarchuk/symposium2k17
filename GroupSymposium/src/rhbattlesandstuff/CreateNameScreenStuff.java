package rhbattlesandstuff;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.ClickableScreen;
import guiPractice.TextLabel;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Visible;

public class CreateNameScreenStuff extends ClickableScreen implements MouseMotionListener, MouseListener{
	
	private TextLabel typeName;
	private TextLabel input;

	public CreateNameScreenStuff(int width, int height) {
		// TODO Auto-generated constructor stub
		super(width, height);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		typeName = new TextLabel(100, 100, 800, 25, "Type in your name: ");
		input = new TextLabel(100, 150, 800,25,"Name");
		
		viewObjects.add(typeName);
		viewObjects.add(input);
	}
}
