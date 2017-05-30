package joeyDaniel;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class Floor2 extends Floor {

	private Graphic[][] layout;
	private int[] playerCoordinate;

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
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		layout = new Graphic[24][30];
		initWalls();
		playerCoordinate = new int[2];
		playerCoordinate[0] = 3;
		playerCoordinate[1] = 14;
		layout[20][26] = new Stairs();
		updateScreen(viewObjects);
	}
	public void background(){
		for(int i = 0; i < 7;i++){
			for(int x = 0; x < 7;x++){
				addObject(new GrassPanel(i*100,x*100));
			}
		}
	}
	
	private void updateScreen(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		viewObjects.removeAll(viewObjects);
		background();
		int x = 0;
		int y = 0;
		for(int row = playerCoordinate[0]-3; row<=playerCoordinate[0]+3;row++ ){
			for(int col = playerCoordinate[1]-3; col<=playerCoordinate[1]+3;col++ ){
				if(layout[row][col] instanceof Wall){
					layout[row][col] = new WoodWall(x*100,y*100);
					viewObjects.add(layout[row][col]);
				}
				if(layout[row][col] instanceof Staircase){
					layout[row][col] = new Stairs(x*100,y*100);
					viewObjects.add(layout[row][col]);
				}
				x++;
			}
			y++;
			x=0;
		}
	}
	
	private void initWalls(){
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
		
		layout[14][5] = new WoodWall();
		layout[14][7] = new WoodWall();
		layout[14][9] = new WoodWall();
		layout[14][11] = new WoodWall();
		layout[14][13] = new WoodWall();
		layout[14][16] = new WoodWall();
		layout[14][17] = new WoodWall();
		
		layout[15][5] = new WoodWall();
		layout[15][7] = new WoodWall();
		layout[15][9] = new WoodWall();
		layout[15][11] = new WoodWall();
		layout[15][13] = new WoodWall();
		layout[15][16] = new WoodWall();
		layout[15][17] = new WoodWall();
		layout[15][19] = new WoodWall();
		layout[15][20] = new WoodWall();
		layout[15][21] = new WoodWall();
		layout[15][22] = new WoodWall();
		layout[15][23] = new WoodWall();
		layout[15][24] = new WoodWall();
		layout[15][25] = new WoodWall();
		layout[15][26] = new WoodWall();

		layout[16][5] = new WoodWall();
		layout[16][7] = new WoodWall();
		layout[16][9] = new WoodWall();
		layout[16][11] = new WoodWall();
		layout[16][13] = new WoodWall();
		layout[16][14] = new WoodWall();
		layout[16][15] = new WoodWall();
		layout[16][16] = new WoodWall();
		layout[16][17] = new WoodWall();
		
		layout[17][5] = new WoodWall();
		layout[17][7] = new WoodWall();
		layout[17][9] = new WoodWall();
		layout[17][11] = new WoodWall();
		layout[17][13] = new WoodWall();
		layout[17][16] = new WoodWall();
		layout[17][17] = new WoodWall();
		layout[17][18] = new WoodWall();
		layout[17][19] = new WoodWall();
		layout[17][20] = new WoodWall();
		layout[17][21] = new WoodWall();
		layout[17][22] = new WoodWall();
		layout[17][23] = new WoodWall();
		layout[17][24] = new WoodWall();
		layout[17][25] = new WoodWall();
		
		layout[18][5] = new WoodWall();
		layout[18][7] = new WoodWall();
		layout[18][9] = new WoodWall();
		layout[18][11] = new WoodWall();
		layout[18][13] = new WoodWall();
		layout[18][16] = new WoodWall();
		
		layout[19][7] = new WoodWall();
		layout[19][11] = new WoodWall();
		layout[19][18] = new WoodWall();
		layout[19][19] = new WoodWall();
		layout[19][20] = new WoodWall();
		layout[19][21] = new WoodWall();
		layout[19][22] = new WoodWall();
		layout[19][23] = new WoodWall();
		layout[19][24] = new WoodWall();
		layout[19][25] = new WoodWall();
		layout[19][26] = new WoodWall();
		
		layout[20][7] = new WoodWall();
		layout[20][11] = new WoodWall();
		
	}
	
	@Override
	public void moveCharacter(String direction) {
		if(direction == "up"){
			if(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Stairs){
				Map.game.setScreen(Map.screen3);
			}else if(!(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Obstruction)){
				layout[playerCoordinate[0]-1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] -= 1;
				updateScreen(viewObjects);
				update();
			}
		}else if(direction == "down"){
			if(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Stairs){
				Map.game.setScreen(Map.screen3);
			}else if(!(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Obstruction)){
				layout[playerCoordinate[0]+1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] += 1;
				updateScreen(viewObjects);
				update();
			}
		}else if(direction == "left"){
			if(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Stairs){
				Map.game.setScreen(Map.screen3);
			}else if(!(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Obstruction)){
				layout[playerCoordinate[0]][playerCoordinate[1]-1] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[1] -= 1;
				updateScreen(viewObjects);
				update();
			}
		}else{
			if(layout[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Stairs){
				Map.game.setScreen(Map.screen3);
			}else if(!(layout[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Obstruction)){
				layout[playerCoordinate[0]][playerCoordinate[1]+1] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[1] += 1;
				updateScreen(viewObjects);
				update();
			}
		}
	}
	@Override
	public void monsterMove() {
		// TODO Auto-generated method stub
		
	}
}
