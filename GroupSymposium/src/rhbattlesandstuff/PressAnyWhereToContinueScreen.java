package rhbattlesandstuff;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class PressAnyWhereToContinueScreen extends FullFunctionScreen implements MouseMotionListener{

	private ClickableGraphic bsod;
	private Player b;
	private BasicMonster a;
	private BasicMonster a2;
	private int[] test = b.getStats(); 
	private int[] monTest = a.getStats();
	private int floor = 1;
	private ArrayList<Moves> testing;
	private Graphic hud;
	boolean hudstuff;
	boolean ms;
	private int thing = 0;
	
	public PressAnyWhereToContinueScreen(int width, int height) {
		
		super(width, height);
		
		try {
			File fontFile = new File("resources/Beefd.ttf");
			//			File fontFile = new File("resources//DayRoman.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
			Font baseFont=font.deriveFont(16f);
			StyledComponent.setBaseFont(baseFont);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseClicked(MouseEvent e){
		System.out.println("click");
		if(bsod.isHovered(e.getX(), e.getY())){
			bsod.act();
		  }
	}

	public void initMenu(ArrayList<Visible> viewObjects) {
		hud = new Graphic(100, 100, 300, 300, "src/resources/TOP KEK.png");
			viewObjects.add(hud);

	}
	
	public void initThing(ArrayList<Visible> viewObjects) {
		viewObjects.remove(hud);
	}
	

	
	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub\
		if(k.getKeyCode() == KeyEvent.VK_9){
			floor++;
			System.out.println("This is floor " + floor + ".");
			a.scaleWFloor();
		}
		else if(k.getKeyCode() == KeyEvent.VK_0){
			System.out.println("Character Stats:");
			System.out.println();
			System.out.println("Health:  " + test[0]);
			System.out.println("Attack:  " + test[1]);
			System.out.println("Defense: " + test[2]);
			System.out.println("Level:   " + test[3]);
			System.out.println();
			System.out.println("Floor " + floor + " Monster Stats:");
			System.out.println("Health:  " + monTest[0]);
			System.out.println("Attack:  " + monTest[1]);
			System.out.println("Defense: " + monTest[2]);
			System.out.println("Level:   " + monTest[3]);
			
			
			b.addAttacks("Tackle", 3);
			b.addAttacks("Lick", 2);
			b.addAttacks("Slap", 2);
			b.addAttacks("Pound", 4);
		}
		else if (k.getKeyCode() == KeyEvent.VK_8){
			System.out.println("message");
			Thread battle = new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("message a");
					Battle.engage(a);
					Battle.engage(a2);
					Battle.setPlayer(b);
					Battle.runBattle();
				}
			});
			battle.start();
		}
		else if (k.getKeyCode() == KeyEvent.VK_Z){
//			initMenu(viewObjects);
			if(hudstuff && ms){
				Battle.doTheMove();
			}
			else{
				Battle.doMoveA();
			}
		}
		else if(k.getKeyCode() == KeyEvent.VK_ENTER){
			hudstuff = !hudstuff;
		}
		if(hudstuff){
			ms = true;
			System.out.println("Menu is open");
			if(k.getKeyCode() == KeyEvent.VK_UP && thing == 0){
				System.out.println(thing);
				thing = 0;
				System.out.println("This the " + b.getMoves().get(b.getThing()).getAttName() + " option"); 	
			}
			else if(k.getKeyCode() == KeyEvent.VK_UP){
				System.out.println(thing);
				b.setThing(-- thing);
				System.out.println("This the " + b.getMoves().get(b.getThing()).getAttName() + " option"); 
			}
			else if(k.getKeyCode() == KeyEvent.VK_DOWN && thing == 3){
				System.out.println(thing);
				thing = 3;
				System.out.println("This the " + b.getMoves().get(b.getThing()).getAttName() + " option"); 
			}
			else if(k.getKeyCode() == KeyEvent.VK_DOWN){
				System.out.println(thing);
				b.setThing(++ thing);
				System.out.println("This the " + b.getMoves().get(b.getThing()).getAttName() + " option");
				System.out.println(thing);
			}
		}
		if(!hudstuff){
			System.out.println("Menu is closed");
			ms = false;
		}
//		else {
//			NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.cyocawScreen);
//		}
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		a =new Monster();
		a2 = new Monster();
		a.setId("Monster a");
		a2.setId("Monster b");
		b = new Character();
		bsod = new ClickableGraphic(0,0,"src/resources/bluescreenofdeath.png");
		bsod.setAction(new Action(){
			public void act(){
				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.cnssScreen);
			}
		});
		viewObjects.add(bsod);
		
	}
	
}
