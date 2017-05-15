package joeyDaniel;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class Floor2 extends Screen {

	private Graphic[][] layout;

	public Floor2(int width, int height) {
		super(width, height);
		
		layout = new Graphic[24][30];
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
		layout[3][12] = new WoodWall();
		layout[3][16] = new WoodWall();
		
		layout[4][12] = new WoodWall();
		layout[4][16] = new WoodWall();
		
		layout[5][5] = new WoodWall();
		layout[5][12] = new WoodWall();
		layout[5][16] = new WoodWall();
		layout[5][24] = new WoodWall();
		
		layout[6][5] = new WoodWall();
		layout[6][6] = new WoodWall();
		layout[6][7] = new WoodWall();
		layout[6][8] = new WoodWall();
		layout[6][9] = new WoodWall();
		layout[6][10] = new WoodWall();
		layout[6][11] = new WoodWall();
		layout[6][12] = new WoodWall();
		layout[6][16] = new WoodWall();
		layout[6][17] = new WoodWall();
		layout[6][18] = new WoodWall();
		layout[6][19] = new WoodWall();
		layout[6][20] = new WoodWall();
		layout[6][21] = new WoodWall();
		layout[6][22] = new WoodWall();
		layout[6][23] = new WoodWall();
		layout[6][24] = new WoodWall();
		
		layout[9][5] = new WoodWall();
		layout[9][6] = new WoodWall();
		layout[9][7] = new WoodWall();
		layout[9][8] = new WoodWall();
		layout[9][9] = new WoodWall();
		layout[9][10] = new WoodWall();
		layout[9][11] = new WoodWall();
		layout[9][12] = new WoodWall();
		layout[9][13] = new WoodWall();
		layout[9][16] = new WoodWall();
		layout[9][17] = new WoodWall();
		layout[9][18] = new WoodWall();
		layout[9][19] = new WoodWall();
		layout[9][20] = new WoodWall();
		layout[9][21] = new WoodWall();
		layout[9][22] = new WoodWall();
		layout[9][23] = new WoodWall();
		layout[9][24] = new WoodWall();
		
		layout[10][5] = new WoodWall();
		layout[10][6] = new WoodWall();
		layout[10][7] = new WoodWall();
		layout[10][8] = new WoodWall();
		layout[10][9] = new WoodWall();
		layout[10][10] = new WoodWall();
		layout[10][11] = new WoodWall();
		layout[10][12] = new WoodWall();
		layout[10][13] = new WoodWall();
		layout[10][16] = new WoodWall();
		layout[10][17] = new WoodWall();
		
		layout[11][5] = new WoodWall();
		layout[11][9] = new WoodWall();
		layout[11][13] = new WoodWall();
		layout[11][16] = new WoodWall();
		layout[11][17] = new WoodWall();
		layout[11][20] = new WoodWall();
		layout[11][21] = new WoodWall();
		layout[11][22] = new WoodWall();
		layout[11][23] = new WoodWall();
		layout[11][24] = new WoodWall();
		layout[11][25] = new WoodWall();
		layout[11][25] = new WoodWall();
		layout[11][26] = new WoodWall();
		layout[11][27] = new WoodWall();
		
		layout[12][5] = new WoodWall();
		layout[12][9] = new WoodWall();
		layout[12][11] = new WoodWall();
		layout[12][13] = new WoodWall();
		layout[12][16] = new WoodWall();
		layout[12][17] = new WoodWall();
		
		layout[13][5] = new WoodWall();
		layout[13][7] = new WoodWall();
		layout[13][9] = new WoodWall();
		layout[13][11] = new WoodWall();
		layout[13][13] = new WoodWall();
		layout[13][16] = new WoodWall();
		layout[13][17] = new WoodWall();
		layout[13][18] = new WoodWall();
		layout[13][19] = new WoodWall();
		layout[13][20] = new WoodWall();
		layout[13][21] = new WoodWall();
		layout[13][22] = new WoodWall();
		layout[13][23] = new WoodWall();
		layout[13][24] = new WoodWall();
		
		
		
		
		
//		for(int i = 0; i < 4; i++){
//		for(int j = 0; j < 30;j++){
//			layout[i][j] = new WoodWall();
//		}
//	}
//	for(int i = 21 ; i < 24; i++){
//		for(int j = 0; j < 30;j++){
//			layout[i][j] = new WoodWall();
//		}
//	}
//	for(int i = 0; i < 24; i++){
//		for(int j = 0; j < 4;j++){
//			layout[i][j] = new WoodWall();
//		}
//	}
//	for(int i = 0; i < 24; i++){
//		for(int j = 27; j < 30;j++){
//			layout[i][j] = new WoodWall();
//		}
//	}
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
