package joeyDaniel;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class Floor5 extends Floor {

	private Graphic[][] layout;
	private int[] playerCoordinate;

	

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		playerCoordinate = new int[2];
		playerCoordinate[0] = 3;
		playerCoordinate[1] = 14;
		layout = new Graphic[24][30];
		
		for(int i = 0; i<layout.length; i++){
			for(int j = 0; j<layout[i].length; j++){
				if(layout.length-i<=3 || i<3){
					layout[i][j] = new CobbleWall();
				}else{
					if(layout[i].length-j <=3 || j<3){
						layout[i][j] = new CobbleWall();
					}
				}
			}
		}
		
		layout[3][12] = new CobbleWall();
		layout[3][13] = new CobbleWall();
		layout[3][14] = new CobbleWall();
		layout[3][15] = new CobbleWall();
		layout[3][16] = new CobbleWall();
		layout[3][17] = new CobbleWall();
		layout[3][23] = new CobbleWall();
		
		layout[4][6] = new CobbleWall();
		layout[4][7] = new CobbleWall();
		layout[4][8] = new CobbleWall();
		layout[4][9] = new CobbleWall();
		layout[4][10] = new CobbleWall();
		layout[4][20] = new CobbleWall();
		layout[4][21] = new CobbleWall();
		layout[4][23] = new CobbleWall();
		
		layout[5][4] = new CobbleWall();
		layout[5][5] = new CobbleWall();
		layout[5][6] = new CobbleWall();
		layout[5][7] = new CobbleWall();
		layout[5][13] = new CobbleWall();
		layout[5][14] = new CobbleWall();
		layout[5][15] = new CobbleWall();
		layout[5][16] = new CobbleWall();
		layout[5][20] = new CobbleWall();
		layout[5][21] = new CobbleWall();
		layout[5][23] = new CobbleWall();
		layout[5][24] = new CobbleWall();
		layout[5][25] = new CobbleWall();
		
		layout[6][4] = new CobbleWall();
		layout[6][7] = new CobbleWall();
		layout[6][13] = new CobbleWall();
		layout[6][14] = new CobbleWall();
		layout[6][15] = new CobbleWall();
		layout[6][16] = new CobbleWall();
		layout[6][17] = new CobbleWall();
		layout[6][18] = new CobbleWall();
		layout[6][19] = new CobbleWall();
		layout[6][20] = new CobbleWall();
		layout[6][21] = new CobbleWall();
		layout[6][25] = new CobbleWall();
		
		layout[7][4] = new CobbleWall();
		layout[7][7] = new CobbleWall();
		layout[7][9] = new CobbleWall();
		layout[7][11] = new CobbleWall();
		layout[7][12] = new CobbleWall();
		layout[7][13] = new CobbleWall();
		layout[7][14] = new CobbleWall();
		layout[7][15] = new CobbleWall();
		layout[7][19] = new CobbleWall();
		layout[7][25] = new CobbleWall();
		
		layout[8][4] = new CobbleWall();
		layout[8][6] = new CobbleWall();
		layout[8][7] = new CobbleWall();
		layout[8][9] = new CobbleWall();
		layout[8][11] = new CobbleWall();
		layout[8][19] = new CobbleWall();
		layout[8][20] = new CobbleWall();
		layout[8][21] = new CobbleWall();
		layout[8][22] = new CobbleWall();
		layout[8][23] = new CobbleWall();
		layout[8][24] = new CobbleWall();
		layout[8][25] = new CobbleWall();
		
		layout[9][4] = new CobbleWall();
		layout[9][6] = new CobbleWall();
		layout[9][7] = new CobbleWall();
		layout[9][9] = new CobbleWall();
		layout[9][11] = new CobbleWall();
		layout[9][13] = new CobbleWall();
		layout[9][14] = new CobbleWall();
		layout[9][15] = new CobbleWall();
		layout[9][16] = new CobbleWall();
		layout[9][18] = new CobbleWall();
		layout[9][19] = new CobbleWall();
		layout[9][20] = new CobbleWall();
		layout[9][22] = new CobbleWall();
		layout[9][23] = new CobbleWall();
		layout[9][24] = new CobbleWall();
		layout[9][25] = new CobbleWall();
		
		layout[10][4] = new CobbleWall();
		layout[10][9] = new CobbleWall();
		layout[10][11] = new CobbleWall();
		layout[10][13] = new CobbleWall();
		layout[10][14] = new CobbleWall();
		layout[10][15] = new CobbleWall();
		layout[10][16] = new CobbleWall();
		layout[10][18] = new CobbleWall();
		layout[10][19] = new CobbleWall();
		layout[10][20] = new CobbleWall();
		
		layout[11][4] = new CobbleWall();
		layout[11][5] = new CobbleWall();
		layout[11][7] = new CobbleWall();
		layout[11][9] = new CobbleWall();
		layout[11][11] = new CobbleWall();
		layout[11][13] = new CobbleWall();
		layout[11][14] = new CobbleWall();
		layout[11][15] = new CobbleWall();
		layout[11][16] = new CobbleWall();
		layout[11][18] = new CobbleWall();
		layout[11][19] = new CobbleWall();
		layout[11][20] = new CobbleWall();
		layout[11][22] = new CobbleWall();
		layout[11][23] = new CobbleWall();
		layout[11][24] = new CobbleWall();
		layout[11][25] = new CobbleWall();
		layout[11][26] = new CobbleWall();
		
		layout[12][4] = new CobbleWall();
		layout[12][8] = new CobbleWall();
		layout[12][14] = new CobbleWall();
		layout[12][15] = new CobbleWall();
		layout[12][17] = new CobbleWall();
		layout[12][18] = new CobbleWall();
		layout[12][19] = new CobbleWall();
		layout[12][20] = new CobbleWall();
		layout[12][21] = new CobbleWall();
		layout[12][22] = new CobbleWall();
		layout[12][24] = new CobbleWall();
		layout[12][25] = new CobbleWall();
		
		layout[13][4] = new CobbleWall();
		layout[13][5] = new CobbleWall();
		layout[13][6] = new CobbleWall();
		layout[13][8] = new CobbleWall();
		layout[13][9] = new CobbleWall();
		layout[13][10] = new CobbleWall();
		layout[13][11] = new CobbleWall();
		layout[13][12] = new CobbleWall();
		layout[13][14] = new CobbleWall();
		layout[13][15] = new CobbleWall();
		layout[13][18] = new CobbleWall();
		layout[13][22] = new CobbleWall();
		layout[13][24] = new CobbleWall();
		layout[13][25] = new CobbleWall();
		
		layout[14][6] = new CobbleWall();
		layout[14][11] = new CobbleWall();
		layout[14][12] = new CobbleWall();
		layout[14][14] = new CobbleWall();
		layout[14][15] = new CobbleWall();
		layout[14][18] = new CobbleWall();
		layout[14][20] = new CobbleWall();
		layout[14][22] = new CobbleWall();
		layout[14][24] = new CobbleWall();
		layout[14][25] = new CobbleWall();
		
		layout[15][4] = new CobbleWall();
		layout[15][6] = new CobbleWall();
		layout[15][11] = new CobbleWall();
		layout[15][15] = new CobbleWall();
		layout[15][17] = new CobbleWall();
		layout[15][18] = new CobbleWall();
		layout[15][20] = new CobbleWall();
		layout[15][22] = new CobbleWall();
		layout[15][24] = new CobbleWall();
		layout[15][25] = new CobbleWall();

		layout[16][6] = new CobbleWall();
		layout[16][11] = new CobbleWall();
		layout[16][13] = new CobbleWall();
		layout[16][15] = new CobbleWall();
		layout[16][17] = new CobbleWall();
		layout[16][18] = new CobbleWall();
		layout[16][20] = new CobbleWall();
		layout[16][22] = new CobbleWall();
		layout[16][24] = new CobbleWall();
		
		layout[17][4] = new CobbleWall();
		layout[17][5] = new CobbleWall();
		layout[17][6] = new CobbleWall();
		layout[17][7] = new CobbleWall();
		layout[17][9] = new CobbleWall();
		layout[17][10] = new CobbleWall();
		layout[17][11] = new CobbleWall();
		layout[17][15] = new CobbleWall();
		layout[17][17] = new CobbleWall();
		layout[17][18] = new CobbleWall();
		layout[17][20] = new CobbleWall();
		layout[17][21] = new CobbleWall();
		layout[17][22] = new CobbleWall();
		layout[17][24] = new CobbleWall();
		layout[17][25] = new CobbleWall();
		
		layout[18][4] = new CobbleWall();
		layout[18][5] = new CobbleWall();
		layout[18][6] = new CobbleWall();
		layout[18][7] = new CobbleWall();
		layout[18][9] = new CobbleWall();
		layout[18][10] = new CobbleWall();
		layout[18][11] = new CobbleWall();
		layout[18][12] = new CobbleWall();
		layout[18][14] = new CobbleWall();
		layout[18][15] = new CobbleWall();
		layout[18][17] = new CobbleWall();
		layout[18][18] = new CobbleWall();
		layout[18][24] = new CobbleWall();
		layout[18][25] = new CobbleWall();
		
		layout[19][14] = new CobbleWall();
		layout[19][18] = new CobbleWall();
		layout[19][24] = new CobbleWall();
		layout[19][25] = new CobbleWall();
		
		layout[20][3] = new CobbleWall();
		layout[20][4] = new CobbleWall();
		layout[20][5] = new CobbleWall();
		layout[20][6] = new CobbleWall();
		layout[20][7] = new CobbleWall();
		layout[20][8] = new CobbleWall();
		layout[20][9] = new CobbleWall();
		layout[20][10] = new CobbleWall();
		layout[20][11] = new CobbleWall();
		layout[20][12] = new CobbleWall();
		layout[20][13] = new CobbleWall();
		layout[20][14] = new CobbleWall();
		layout[20][18] = new CobbleWall();
		layout[20][24] = new CobbleWall();
		layout[20][25] = new CobbleWall();
		
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
					layout[row][col] = new CobbleWall(x*100,y*100);
					viewObjects.add(layout[row][col]);
				}
				x++;
			}
			y++;
			x=0;
		}
	}
	
	@Override
	public void moveCharacter(String direction) {
		if(direction == "up"){
			if(!(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Obstruction)){
				layout[playerCoordinate[0]-1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] -= 1;
				UpdateScreen(viewObjects);
				update();
			}
		}else if(direction == "down"){
			if(!(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Obstruction)){
				layout[playerCoordinate[0]+1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] += 1;
				UpdateScreen(viewObjects);
				update();
			}
		}else if(direction == "left"){
			if(!(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Obstruction)){
				layout[playerCoordinate[0]][playerCoordinate[1]-1] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[1] -= 1;
				UpdateScreen(viewObjects);
				update();
			}
		}else{
			if(!(layout[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Obstruction)){
				layout[playerCoordinate[0]][playerCoordinate[1]+1] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[1] += 1;
				UpdateScreen(viewObjects);
				update();
			}
		}
	}
}
