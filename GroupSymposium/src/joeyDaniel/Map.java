package joeyDaniel;

import guiPractice.GUIApplication;
import guiPractice.Screen;
import guiPractice.components.Graphic;
import rhbattlesandstuff.Character;

public class Map extends GUIApplication{
	
	private static Floor3 screen3;
	private static Floor1 screen1;
	private static Map game;
	public static Character x;
	
	public Map(){
		super();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x = new Character();
		x.setLocation(3, 3);
		game = new Map();
		Thread app = new Thread(game);
		app.start();
		
	}
	
	
	
	@Override
	protected void initScreen() {
		screen3 = new Floor3();
		screen1 = new Floor1();
		setScreen(screen1);
	}
	
	
	
	
	
}
