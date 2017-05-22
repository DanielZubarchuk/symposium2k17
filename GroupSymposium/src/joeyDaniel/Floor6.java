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
	
	public boolean isObstructed(String direction) {
		// TODO Auto-generated method stub
		return false;
	}
}
