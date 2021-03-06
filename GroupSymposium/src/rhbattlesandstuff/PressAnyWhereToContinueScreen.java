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
	private TextLabel text;
	private Graphic loading1;
	private Graphic loading2;
	private Player b;
	private BasicMonster a;
	private BasicMonster a2;
//	private int[] test = b.getStats(); 
//	private int[] monTest = a.getStats();
	private int floor = 1;
	private ArrayList<Moves> testing;
	private Graphic hud;
	boolean hudstuff;
	boolean ms;
	
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
	
	public void keyPressed(KeyEvent k){
		bsod.act();
	}
	
	

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
//		// TODO Auto-generated method stub
		a =new Monster(1.0, "src/resources/Monster/slimeSingle.png");
		a2 = new Monster(1.0, "src/resources/Monster/slimeSingle.png");
		a.setId("Monster a");
		a2.setId("Monster b");
		b = new Character();
		bsod = new ClickableGraphic(0,0,"src/resources/background.png");
//		loading1 = new Graphic(140,700,"src/resources/loadingbar.png");
//		loading2 = new Graphic(140,695,"src/resources/loadingbar2.png");
		text = new TextLabel(220,200,800,400, "PRESS ANYWHERE TO CONTINUE");
		bsod.setAction(new Action(){
			public void act(){
				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.cnssScreen);
			}
		});
		viewObjects.add(bsod);
//		viewObjects.add(loading2);
//		viewObjects.add(loading1);
		viewObjects.add(text);
	}
	
}
