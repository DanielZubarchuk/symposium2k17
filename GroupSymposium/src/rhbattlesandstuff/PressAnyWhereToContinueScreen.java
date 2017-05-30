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
	private Enemy a;
	private Enemy a2;
	private int[] test = b.getStats(); 
	private int[] monTest = a.getStats();
	private int floor = 0;
	private ArrayList<Moves> testing;
	private Graphic hud;
	boolean hudstuff;
	
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
			System.out.println("Character Stats");
			System.out.println(test[0]);
			System.out.println(test[1]);
			System.out.println(test[2]);
			System.out.println(test[3]);
			System.out.println(test[4]);
			System.out.println();
			b.incrementStats();
			System.out.println("Monster Stats");
			System.out.println(monTest[0]);
			System.out.println(monTest[1]);
			System.out.println(monTest[2]);
			System.out.println(monTest[3]);
			System.out.println(monTest[4]);
			
			a.setAttacks(testing);
			b.setAttacks(testing);
			
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
			Battle.doMoveA();
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
