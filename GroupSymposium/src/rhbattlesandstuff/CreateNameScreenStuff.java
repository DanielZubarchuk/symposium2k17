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
	private boolean nameInput = false;
	private Button confirm; 
	

	public CreateNameScreenStuff(int width, int height) {
		// TODO Auto-generated constructor stub
		super(width, height);
	}



	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		namestuff = new TextLabel(100,70,800,25, "Name goes here:");
		typeName = new TextField(100, 100, 800, 48, "", "");
		confirm = new Button(900, 550, 100, 50, "Confirm", Color.BLUE, new Action(){
			public void act(){
				if(typeName.getText().length()<=3 || typeName.getText().length()>=12){
					typeName.setText("");
					System.out.println("Please type in a name between 3-12 characters");
				}
				else{
					NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.sjsScreen);
				}
			}
		});
		viewObjects.add(namestuff);
		viewObjects.add(typeName);
		viewObjects.add(confirm);
	}


}
