package joeyDaniel;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class Floor2 extends Screen {

	private Graphic[][] layout;

	public Floor2(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		background();
	}
	public void background(){
		for(int i = 0; i < 9;i++){
			for(int x = 0; x < 9;x++){
				addObject(new GrassPanel(i*100,x*100));
			}
		}
	}
}
