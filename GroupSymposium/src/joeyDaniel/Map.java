package joeyDaniel;

import guiPractice.GUIApplication;
import guiPractice.Screen;
import guiPractice.components.Graphic;

public class Map extends GUIApplication{
	
	private static Floor1 screen1;
	private static Map game;
	
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
		screen1 = new Floor1(716, 738);
		setScreen(screen1);
	}
	
	
	
	
	
}
