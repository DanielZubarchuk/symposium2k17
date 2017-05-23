package joeyDaniel;

import guiPractice.GUIApplication;
import guiPractice.Screen;
import guiPractice.components.Graphic;
import rhbattlesandstuff.Character;

public class Map extends GUIApplication{
	
	private static Map game;
	public static Character x;
	private static Floor1 screen1;
	private static Floor2 screen2;
	private static Floor3 screen3;
	private static Floor4 screen4;
	private static Floor5 screen5;
	private static Floor6 screen6;
	private static Floor7 screen7;
	
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
		screen6 = new Floor6();
		screen7 = new Floor7();
		setScreen(screen3);
	}
	
	
	
	
	
}
