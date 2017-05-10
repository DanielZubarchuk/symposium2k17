package joeyDaniel;

import guiPractice.GUIApplication;
import guiPractice.Screen;

public class Map extends GUIApplication{
	
	private static Screen screen1;
	private static Map game;
	private Object[][] levelOne;
	private Object[][] levelTwo;
	private Object[][] levelThree;
	private Object[][] levelFour;
	private Object[][] levelFive;
	private Object[][] levelSix;
	private Object[][] levelSeven;
	
	
	public Map(){
		game = new Map();
		Thread app = new Thread(game);
		app.start();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	protected void initScreen() {
		screen1 = new DisplayScreen(1000, 1000);
		setScreen(screen1);
	}
	
	
	
	
	
}
