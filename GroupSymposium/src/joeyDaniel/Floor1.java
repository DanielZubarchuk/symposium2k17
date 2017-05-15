package joeyDaniel;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class Floor1 extends Screen{

	private Graphic[][] layout;
	private int[] playerCoordinate;

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
		playerCoordinate = new int[2];
		playerCoordinate[0] = 3;
		playerCoordinate[1] = 3;
		UpdateScreen(viewObjects);
	}
	
	private void UpdateScreen(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
		for(int row = playerCoordinate[0]-3; row<=playerCoordinate[0]+3;row++ ){
			for(int col = playerCoordinate[1]-3; col<=playerCoordinate[1]+3;col++ ){
				if(layout[row][col] != null){
					viewObjects.add(layout[row][col]);
				}
			}
		}
	}

	public void background(){
		for(int i = 0; i < 7;i++){
			for(int x = 0; x < 7;x++){
				addObject(new GrassPanel(i*100,x*100));
			}
		}
	}
	

}
