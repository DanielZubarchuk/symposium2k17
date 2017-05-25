package joeyDaniel;

import guiTeacher.GUIApplication;
import guiTeacher.userInterfaces.Screen;
import guiTeacher.components.Graphic;
import rhbattlesandstuff.Character;

public class Map extends GUIApplication{
	
	public static Map game;
	public static Character x;
	public static Floor1 screen1;
	public static Floor2 screen2;
	public static Floor3 screen3;
	public static Floor4 screen4;
	public static Floor5 screen5;
	public static Floor6 screen6;
	public static Floor7 screen7;
	
	public Map(){
		super();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game = new Map();
		Thread app = new Thread(game);
		app.start();
		
	}
	
	
	
	@Override
	protected void initScreen() {
		screen1 = new Floor1();
		screen2 = new Floor2();
		screen3 = new Floor3();
		screen4 = new Floor4();
		screen5 = new Floor5();
//		screen6 = new Floor6();
//		screen7 = new Floor7();
		setScreen(screen1);
	}
	
	
	
	
	
}
