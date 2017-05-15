package joeyDaniel;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class Floor1 extends Screen{

	private Graphic[][] layout;

	public Floor1(int width, int height, Graphic[][] layout) {
		super(width, height);
		this.layout = layout;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		background();
//		CobbleWall test1 = new CobbleWall(0,0);
//		SmallWall test = new SmallWall(300, 500);
//		GrassPanel testGrass = new GrassPanel(300,600);
//		GrassPanel testGrass1 = new GrassPanel(300,400);
//		viewObjects.add(testGrass1);
//		viewObjects.add(testGrass);
//		viewObjects.add(test1);
//		viewObjects.add(test);
	}
	
	public void background(){
		for(int i = 0; i < 9;i++){
			for(int x = 0; x < 9;x++){
				addObject(new GrassPanel(i*100,x*100));
//				addObject(new Sand(i*100,x*100));
//				addObject(new DungeonFloor(i*100,x*100));
//				addObject(new CobbleWall(i*100,x*100));
//				addObject(new SmallWall(i*100,x*100));
			}
		}
	}
	

}
