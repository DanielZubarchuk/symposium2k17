package joeyDaniel;

import guiPractice.GUIApplication;
import guiPractice.Screen;
import guiPractice.components.Graphic;

public class Map extends GUIApplication{
	
	private static Floor1 screen1;
	private static Map game;
	private Graphic[][] levelOne;
	private Object[][] levelTwo;
	private Object[][] levelThree;
	private Object[][] levelFour;
	private Object[][] levelFive;
	private Object[][] levelSix;
	private Object[][] levelSeven;
	
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
		screen1 = new Floor1(916, 938);
		setScreen(screen1);
	}
	
	
	
	
	
}
