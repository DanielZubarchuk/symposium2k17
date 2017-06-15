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
	private TextLabel textPop;
	private Graphic picPop;
	private Button confirm; 
	private TextColoredLabel pop;
	
	static Player realPlayer = new Character();

	public CreateNameScreenStuff(int width, int height) {
		// TODO Auto-generated constructor stub
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		pop = new TextColoredLabel(100, 500, 500, 100, "Are you sure?", Color.BLUE, Color.BLACK);
		namestuff = new TextLabel(100,70,800,25, "Name goes here:");
		typeName = new TextField(100, 100, 500, 48, "", "");
		confirm = new Button(600, 550, 100, 50, "Confirm", Color.BLUE, new Action(){
			
			boolean shown = false;
			public void act(){
				
//				if(!shown){
//					addObject(pop);
//					shown = true;
//					System.out.println("pop");
//				}
//				else{
//					remove(pop);
//					shown = false;
//					System.out.println("unpop");
//				}
				
				if(typeName.getText().length()<=2 || typeName.getText().length()>=13){
					System.out.println(typeName.getText());
					typeName.setText("");
					System.out.println("Please type in a name between 3-12 characters");
				}
				else{
					realPlayer.setName(typeName.getText());
					NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.gssScreen);
					System.out.println(realPlayer.getName());;
				}
			}
		});
		viewObjects.add(namestuff);
		viewObjects.add(typeName);
		viewObjects.add(confirm);
		update();
	}
}
