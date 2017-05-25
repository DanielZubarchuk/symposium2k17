package rhbattlesandstuff;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CreateNameScreenStuff extends FullFunctionScreen{
	
	private TextField typeName;
	private TextLabel namestuff;
	

	public CreateNameScreenStuff(int width, int height) {
		// TODO Auto-generated constructor stub
		super(width, height);
	}



	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		namestuff = new TextLabel(100,70,800,25, "Name goes here:");
		typeName = new TextField(100, 100, 800, 48, "", "");
		typeName.getText();
		viewObjects.add(namestuff);
		viewObjects.add(typeName);
	}



}
