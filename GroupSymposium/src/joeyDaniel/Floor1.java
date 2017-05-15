package joeyDaniel;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class Floor1 extends Screen{

	private Graphic[][] layout;

	public Floor1(int width, int height) {
		super(width, height);
		layout = new Graphic[18][18];
		for(int i = 0; i<layout.length; i++){
			for(int j = 0; j<layout[i].length; j++){
				if(layout.length-i<=3 || i<3){
					layout[i][j] = new WoodWall();
				}else{
					if(layout[i].length-j <=3 || j<3){
						layout[i][j] = new WoodWall();
					}
				}
			}
		}
		for(int row = 3; row < layout.length-3; row++){
			if(row!= 10){
				layout[row][7] = new WoodWall();
			}
			if(row!= 13){
				layout[row][10] = new WoodWall();
			}
			if(row!= 9){
				layout[row][13] = new WoodWall();
			}
		}
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		background();
		WoodWall test1 = new WoodWall();
//		SmallWall test = new SmallWall(300, 500);
//		GrassPanel testGrass = new GrassPanel(300,600);
//		GrassPanel testGrass1 = new GrassPanel(300,400);
//		viewObjects.add(testGrass1);
//		viewObjects.add(testGrass);
		viewObjects.add(test1);
//		viewObjects.add(test);
	}
	
	public void background(){
		for(int i = 0; i < 7;i++){
			for(int x = 0; x < 7;x++){
				addObject(new GrassPanel(i*100,x*100));
//				addObject(new Sand(i*100,x*100));
//				addObject(new DungeonFloor(i*100,x*100));
//				addObject(new CobbleWall(i*100,x*100));
//				addObject(new SmallWall(i*100,x*100));
			}
		}
	}
	

}
