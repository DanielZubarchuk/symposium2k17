package rhbattlesandstuff;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class GenderScreenStuff extends ClickableScreen implements MouseMotionListener, MouseListener, KeyListener {

	private Graphic lbsod;
	private String[] gender = {"male", "female"};
	private int select = 0;
	private ClickableGraphic male;
	private ClickableGraphic female;
	private boolean madeSelection = false;
	private Button helloJoeyHowIsTheBombHimerProjectGoing;
	private TextLabel pick;
	
	
	public GenderScreenStuff(int width, int height) {
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
	
	public void mouseClicked(MouseEvent e){
		System.out.println("click");
		if(helloJoeyHowIsTheBombHimerProjectGoing.isHovered(e.getX(), e.getY())){
			helloJoeyHowIsTheBombHimerProjectGoing.act();
		  }
		if(male.isHovered(e.getX(), e.getY())){
			male.act();
		  }
		if(female.isHovered(e.getX(), e.getY())){
			female.act();
		  }
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

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		lbsod = new Graphic(0,0,1.0,"src/resources/WHITE.png");
		female = new ClickableGraphic(30,50,.5,"src/resources/male.png");
		male = new ClickableGraphic(550,50,.5,"src/resources/female.png");
		pick = new TextLabel(180,200, 800, 25, "Choose Your Sex");
		female.setAction(new Action(){
			public void act(){
				select = 0;
				madeSelection= true;
			}
		});
		male.setAction(new Action(){
			public void act(){
				select = 1;
				madeSelection= true;
			}
		});
		viewObjects.add(lbsod);
		viewObjects.add(male);
		viewObjects.add(female);
		viewObjects.add(pick);
		helloJoeyHowIsTheBombHimerProjectGoing = new Button(300, 300, 100, 50, "Click", Color.BLACK, new Action(){
			public void act() {
				if(madeSelection){
					if(select==0){
						NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.sjsmScreen);
					}
					else{
						NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.sjsfScreen);
					}
				}
				else{
					System.out.println("Choose your gender");
				}
			}
		});
		viewObjects.add(helloJoeyHowIsTheBombHimerProjectGoing);
		update();
	}

	public KeyListener getKeyListener(){
		return this;
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
