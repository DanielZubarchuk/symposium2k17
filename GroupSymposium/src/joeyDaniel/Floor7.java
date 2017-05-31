package joeyDaniel;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class Floor7 extends Floor{

	private Graphic[][] layout;
	private int[] playerCoordinate;


	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		layout = new Graphic[24][30];
		initWalls();
//		playerCoordinate = new int[2];
//		playerCoordinate[0] = 3;
//		playerCoordinate[1] = 3;
		//layout[3][26] = new Stairs();
		updateScreen(viewObjects);
	}
	
	public void background(){
		for(int i = 0; i < 7;i++){
			for(int x = 0; x < 7;x++){
				viewObjects.add(new BossGround(i*100,x*100));
			}
		}
	}
	
	private void initWalls(){
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
		
		layout[3][3] = new CobbleWall();
		layout[3][4] = new CobbleWall();
		layout[3][5] = new CobbleWall();
		layout[3][6] = new CobbleWall();
		layout[3][7] = new CobbleWall();
		layout[3][8] = new CobbleWall();
		layout[3][9] = new CobbleWall();
		layout[3][10] = new CobbleWall();
		layout[3][11] = new CobbleWall();
		layout[3][12] = new CobbleWall();
		layout[3][13] = new CobbleWall();
		layout[3][14] = new CobbleWall();
		layout[3][15] = new CobbleWall();
		layout[3][16] = new CobbleWall();
		layout[3][17] = new CobbleWall();
		layout[3][18] = new CobbleWall();
		layout[3][19] = new CobbleWall();
		layout[3][20] = new CobbleWall();
		layout[3][21] = new CobbleWall();
		layout[3][22] = new CobbleWall();
		layout[3][23] = new CobbleWall();
		
		layout[4][3] = new CobbleWall();
		layout[4][9] = new CobbleWall();
		layout[4][14] = new CobbleWall();
		layout[4][22] = new CobbleWall();
		layout[4][23] = new CobbleWall();
		layout[4][25] = new CobbleWall();  
		
		layout[5][3] = new CobbleWall();
		layout[5][5] = new CobbleWall();
		layout[5][6] = new CobbleWall();
		layout[5][7] = new CobbleWall();
		layout[5][9] = new CobbleWall();
		layout[5][11] = new CobbleWall();
		layout[5][12] = new CobbleWall();
		layout[5][14] = new CobbleWall();
		layout[5][16] = new CobbleWall();
		layout[5][17] = new CobbleWall();
		layout[5][19] = new CobbleWall();
		layout[5][20] = new CobbleWall();
		layout[5][22] = new CobbleWall();
		layout[5][23] = new CobbleWall();
		layout[5][25] = new CobbleWall();
		
		layout[6][3] = new CobbleWall();
		layout[6][5] = new CobbleWall();
		layout[6][7] = new CobbleWall();
		layout[6][11] = new CobbleWall();
		layout[6][17] = new CobbleWall();
		layout[6][19] = new CobbleWall();
		layout[6][23] = new CobbleWall();
		layout[6][25] = new CobbleWall();
		
		layout[7][3] = new CobbleWall();
		layout[7][5] = new CobbleWall();
		layout[7][7] = new CobbleWall();
		layout[7][8] = new CobbleWall();
		layout[7][9] = new CobbleWall();
		layout[7][11] = new CobbleWall();
		layout[7][13] = new CobbleWall();
		layout[7][15] = new CobbleWall();
		layout[7][21] = new CobbleWall();
		layout[7][25] = new CobbleWall();
		
		layout[8][3] = new CobbleWall();
		layout[8][5] = new CobbleWall();
		layout[8][9] = new CobbleWall();
		layout[8][10] = new CobbleWall();
		layout[8][11] = new CobbleWall();
		layout[8][13] = new CobbleWall();
		layout[8][15] = new CobbleWall();
		layout[8][17] = new CobbleWall();
		layout[8][18] = new CobbleWall();
		layout[8][19] = new CobbleWall();
		layout[8][22] = new CobbleWall();
		layout[8][25] = new CobbleWall();
		
		layout[9][3] = new CobbleWall();
		layout[9][5] = new CobbleWall();
		layout[9][6] = new CobbleWall();
		layout[9][7] = new CobbleWall();
		layout[9][13] = new CobbleWall();
		layout[9][15] = new CobbleWall();
		layout[9][22] = new CobbleWall();
		layout[9][23] = new CobbleWall();
		layout[9][25] = new CobbleWall();
		
		layout[10][3] = new CobbleWall();
		layout[10][5] = new CobbleWall();
		layout[10][6] = new CobbleWall();
		layout[10][7] = new CobbleWall();
		layout[10][8] = new CobbleWall();
		layout[10][9] = new CobbleWall();
		layout[10][10] = new CobbleWall();
		layout[10][11] = new CobbleWall();
		layout[10][12] = new CobbleWall();
		layout[10][16] = new CobbleWall();
		layout[10][17] = new CobbleWall();
		layout[10][18] = new CobbleWall();
		layout[10][19] = new CobbleWall();
		layout[10][20] = new CobbleWall();
		layout[10][22] = new CobbleWall();
		layout[10][23] = new CobbleWall();
		layout[10][25] = new CobbleWall();
		
		layout[11][3] = new CobbleWall();
		layout[11][5] = new CobbleWall();
		layout[11][20] = new CobbleWall();
		layout[11][25] = new CobbleWall();
		
		layout[12][3] = new CobbleWall();
		layout[12][5] = new CobbleWall();
		layout[12][7] = new CobbleWall();
		layout[12][8] = new CobbleWall();
		layout[12][9] = new CobbleWall();
		layout[12][10] = new CobbleWall();
		layout[12][11] = new CobbleWall();
		layout[12][12] = new CobbleWall();
		layout[12][16] = new CobbleWall();
		layout[12][17] = new CobbleWall();
		layout[12][18] = new CobbleWall();
		layout[12][20] = new CobbleWall();
		layout[12][22] = new CobbleWall();
		layout[12][23] = new CobbleWall();
		layout[12][25] = new CobbleWall();
		
		layout[13][3] = new CobbleWall();
		layout[13][5] = new CobbleWall();
		layout[13][13] = new CobbleWall();
		layout[13][15] = new CobbleWall();
		layout[13][18] = new CobbleWall();
		layout[13][22] = new CobbleWall();
		layout[13][23] = new CobbleWall();
		layout[13][25] = new CobbleWall();
		
		layout[14][3] = new CobbleWall();
		layout[14][5] = new CobbleWall();
		layout[14][6] = new CobbleWall();
		layout[14][7] = new CobbleWall();
		layout[14][8] = new CobbleWall();
		layout[14][9] = new CobbleWall();
		layout[14][10] = new CobbleWall();
		layout[14][11] = new CobbleWall();
		layout[14][13] = new CobbleWall();
		layout[14][15] = new CobbleWall();
		layout[14][16] = new CobbleWall();
		layout[14][18] = new CobbleWall();
		layout[14][19] = new CobbleWall();
		layout[14][20] = new CobbleWall();
		layout[14][21] = new CobbleWall();
		layout[14][22] = new CobbleWall();
		layout[14][23] = new CobbleWall();
		layout[14][25] = new CobbleWall();
		
		layout[15][3] = new CobbleWall();
		layout[15][5] = new CobbleWall();
		layout[15][9] = new CobbleWall();
		layout[15][13] = new CobbleWall();
		layout[15][15] = new CobbleWall();
		layout[15][16] = new CobbleWall();
		layout[15][25] = new CobbleWall();

		layout[16][3] = new CobbleWall();
		layout[16][5] = new CobbleWall();
		layout[16][7] = new CobbleWall();
		layout[16][9] = new CobbleWall();
		layout[16][11] = new CobbleWall();
		layout[16][12] = new CobbleWall();
		layout[16][13] = new CobbleWall();
		layout[16][15] = new CobbleWall();
		layout[16][16] = new CobbleWall();
		layout[16][17] = new CobbleWall();
		layout[16][18] = new CobbleWall();
		layout[16][19] = new CobbleWall();
		layout[16][20] = new CobbleWall();
		layout[16][21] = new CobbleWall();
		layout[16][22] = new CobbleWall();
		layout[16][23] = new CobbleWall();
		layout[16][24] = new CobbleWall();
		layout[16][25] = new CobbleWall();
		
		layout[17][3] = new CobbleWall();
		layout[17][5] = new CobbleWall();
		layout[17][7] = new CobbleWall();
		layout[17][12] = new CobbleWall();
		layout[17][13] = new CobbleWall();
		layout[17][21] = new CobbleWall();
		
		layout[18][3] = new CobbleWall();
		layout[18][5] = new CobbleWall();
		layout[18][6] = new CobbleWall();
		layout[18][7] = new CobbleWall();
		layout[18][8] = new CobbleWall();
		layout[18][9] = new CobbleWall();
		layout[18][10] = new CobbleWall();
		layout[18][12] = new CobbleWall();
		layout[18][13] = new CobbleWall();
		layout[18][14] = new CobbleWall();
		layout[18][15] = new CobbleWall();
		layout[18][16] = new CobbleWall();
		layout[18][17] = new CobbleWall();
		layout[18][18] = new CobbleWall();
		layout[18][19] = new CobbleWall();
		layout[18][20] = new CobbleWall();
		layout[18][21] = new CobbleWall();
		layout[18][23] = new CobbleWall();
		layout[18][24] = new CobbleWall();
		layout[18][25] = new CobbleWall();
		layout[18][26] = new CobbleWall();
	
		layout[19][3] = new CobbleWall();
		layout[19][12] = new CobbleWall();
		
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
		layout[20][15] = new CobbleWall();
		layout[20][16] = new CobbleWall();
		layout[20][17] = new CobbleWall();
		layout[20][18] = new CobbleWall();
		layout[20][19] = new CobbleWall();
		layout[20][20] = new CobbleWall();
		layout[20][21] = new CobbleWall();
		layout[20][22] = new CobbleWall();
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
					layout[row][col] = new BossWall(x*100,y*100);
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
	
	@Override
	public void moveCharacter(String direction) {
		if(direction == "up"){
			if(!(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Obstruction)){
				layout[playerCoordinate[0]-1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] -= 1;
				updateScreen(viewObjects);
				update();
			}
		}else if(direction == "down"){
			if(!(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Obstruction)){
				layout[playerCoordinate[0]+1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] += 1;
				updateScreen(viewObjects);
				update();
			}
		}else if(direction == "left"){
			if(!(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Obstruction)){
				layout[playerCoordinate[0]][playerCoordinate[1]-1] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[1] -= 1;
				updateScreen(viewObjects);
				update();
			}
		}else{
			if(!(layout[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Obstruction)){
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
