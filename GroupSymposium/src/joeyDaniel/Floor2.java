package joeyDaniel;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class Floor2 extends Screen {

	private Graphic[][] layout;
	private int[][] floorTwo = new int[20][26];

	public Floor2(int width, int height, Graphic[][] layout) {
		super(width, height);
		this.layout = layout;
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		
		background();
	}
	public void background(){
		for(int i = 0; i < 7;i++){
			for(int x = 0; x < 7;x++){
				addObject(new GrassPanel(i*100,x*100));
			}
		}
	}
}
