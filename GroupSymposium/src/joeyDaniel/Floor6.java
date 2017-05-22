package joeyDaniel;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class Floor6 extends Floor {

	private Graphic[][] layout;


	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		background();
	}

	public void background(){
		for(int i = 0; i < 7;i++){
			for(int x = 0; x < 7;x++){
				addObject(new DungeonFloor(i*100,x*100));
			}
		}
	}
	
	private void UpdateScreen(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		int[] playerCoordinate = new int[2];
		playerCoordinate[0] = 3;
		playerCoordinate[1] = 3;
		int x = 0;
		int y = 0;
		for(int row = playerCoordinate[0]-3; row<=playerCoordinate[0]+3;row++ ){
			for(int col = playerCoordinate[1]-3; col<=playerCoordinate[1]+3;col++ ){
				if(layout[row][col] instanceof Obstruction){
					layout[row][col] = new SmallWall(x*100,y*100);
					viewObjects.add(layout[row][col]);
				}
				x++;
			}
			y++;
			x=0;
		}
	}
	
	public boolean isObstructed(String direction) {
		// TODO Auto-generated method stub
		return false;
	}
}
