package joeyDaniel;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class Floor6 extends Floor {

	private Graphic[][] layout;
	private int[] playerCoordinate;


	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		layout = new Graphic[24][30];
		playerCoordinate = new int[2];
		playerCoordinate[0] = 11;
		playerCoordinate[1] = 9;
		initWalls();
		layout[3][7] = new Stairs();
		updateScreen(viewObjects);
	}

	public void background(){
		for(int i = 0; i < 7;i++){
			for(int x = 0; x < 7;x++){
				addObject(new DungeonFloor(i*100,x*100));
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
					layout[row][col] = new CobbleWall(x*100,y*100);
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
					layout[i][j] = new CobbleWall();
				}else{
					if(layout[i].length-j <=3 || j<3){
						layout[i][j] = new CobbleWall();
					}
				}
			}
		}
		
		layout[3][4] = new CobbleWall();
		
		layout[4][6] = new CobbleWall();
		layout[4][7] = new CobbleWall();
		layout[4][8] = new CobbleWall();
		layout[4][9] = new CobbleWall();
		layout[4][10] = new CobbleWall();
		layout[4][11] = new CobbleWall();
		layout[4][12] = new CobbleWall();
		layout[4][13] = new CobbleWall();
		layout[4][14] = new CobbleWall();
		layout[4][15] = new CobbleWall();
		layout[4][16] = new CobbleWall();
		layout[4][17] = new CobbleWall();
		layout[4][18] = new CobbleWall();
		layout[4][19] = new CobbleWall();
		layout[4][20] = new CobbleWall();
		layout[4][21] = new CobbleWall();
		layout[4][22] = new CobbleWall();
		layout[4][23] = new CobbleWall();
		layout[4][24] = new CobbleWall();
		layout[4][25] = new CobbleWall();
		
		layout[5][20] = new CobbleWall();
		layout[5][25] = new CobbleWall();
		
		layout[6][3] = new CobbleWall();
		layout[6][4] = new CobbleWall();
		layout[6][5] = new CobbleWall();
		layout[6][7] = new CobbleWall();
		layout[6][8] = new CobbleWall();
		layout[6][9] = new CobbleWall();
		layout[6][10] = new CobbleWall();
		layout[6][11] = new CobbleWall();
		layout[6][12] = new CobbleWall();
		layout[6][13] = new CobbleWall();
		layout[6][14] = new CobbleWall();
		layout[6][15] = new CobbleWall();
		layout[6][16] = new CobbleWall();
		layout[6][17] = new CobbleWall();
		layout[6][18] = new CobbleWall();
		layout[6][19] = new CobbleWall();
		layout[6][20] = new CobbleWall();
		layout[6][21] = new CobbleWall();
		layout[6][22] = new CobbleWall();
		layout[6][23] = new CobbleWall();
		layout[6][25] = new CobbleWall();
		
		layout[7][5] = new CobbleWall();
		layout[7][8] = new CobbleWall();
		layout[7][9] = new CobbleWall();
		layout[7][10] = new CobbleWall();
		layout[7][11] = new CobbleWall();
		layout[7][12] = new CobbleWall();
		layout[7][23] = new CobbleWall();
		layout[7][25] = new CobbleWall();
		
		layout[8][4] = new CobbleWall();
		layout[8][5] = new CobbleWall();
		layout[8][14] = new CobbleWall();
		layout[8][15] = new CobbleWall();
		layout[8][16] = new CobbleWall();
		layout[8][17] = new CobbleWall();
		layout[8][18] = new CobbleWall();
		layout[8][20] = new CobbleWall();
		layout[8][21] = new CobbleWall();
		layout[8][23] = new CobbleWall();
		layout[8][25] = new CobbleWall();
		
		layout[9][4] = new CobbleWall();
		layout[9][5] = new CobbleWall();
		layout[9][6] = new CobbleWall();
		layout[9][7] = new CobbleWall();
		layout[9][8] = new CobbleWall();
		layout[9][9] = new CobbleWall();
		layout[9][10] = new CobbleWall();
		layout[9][11] = new CobbleWall();
		layout[9][12] = new CobbleWall();
		layout[9][14] = new CobbleWall();
		layout[9][23] = new CobbleWall();
		
		layout[10][7] = new CobbleWall();
		layout[10][14] = new CobbleWall();
		layout[10][15] = new CobbleWall();
		layout[10][16] = new CobbleWall();
		layout[10][17] = new CobbleWall();
		layout[10][18] = new CobbleWall();
		layout[10][19] = new CobbleWall();
		layout[10][20] = new CobbleWall();
		layout[10][21] = new CobbleWall();
		layout[10][23] = new CobbleWall();
		layout[10][24] = new CobbleWall();
		layout[10][25] = new CobbleWall();
		
		layout[11][4] = new CobbleWall();
		layout[11][5] = new CobbleWall();
		layout[11][7] = new CobbleWall();
		layout[11][20] = new CobbleWall();
		layout[11][24] = new CobbleWall();
		
		layout[12][7] = new CobbleWall();
		layout[12][14] = new CobbleWall();
		layout[12][15] = new CobbleWall();
		layout[12][16] = new CobbleWall();
		layout[12][18] = new CobbleWall();
		layout[12][20] = new CobbleWall();
		layout[12][22] = new CobbleWall();
		layout[12][23] = new CobbleWall();
		layout[12][24] = new CobbleWall();
		
		layout[13][4] = new CobbleWall();
		layout[13][5] = new CobbleWall();
		layout[13][6] = new CobbleWall();
		layout[13][7] = new CobbleWall();
		layout[13][8] = new CobbleWall();
		layout[13][9] = new CobbleWall();
		layout[13][10] = new CobbleWall();
		layout[13][11] = new CobbleWall();
		layout[13][12] = new CobbleWall();
		layout[13][14] = new CobbleWall();
		layout[13][20] = new CobbleWall();
		
		layout[14][12] = new CobbleWall();
		layout[14][14] = new CobbleWall();
		layout[14][16] = new CobbleWall();
		layout[14][17] = new CobbleWall();
		layout[14][18] = new CobbleWall();
		layout[14][19] = new CobbleWall();
		layout[14][20] = new CobbleWall();
		layout[14][21] = new CobbleWall();
		layout[14][22] = new CobbleWall();
		layout[14][23] = new CobbleWall();
		layout[14][24] = new CobbleWall();
		layout[14][25] = new CobbleWall();
		
		layout[15][8] = new CobbleWall();
		layout[15][9] = new CobbleWall();
		layout[15][10] = new CobbleWall();
		layout[15][12] = new CobbleWall();
		layout[15][14] = new CobbleWall();
		layout[15][16] = new CobbleWall();
		layout[15][25] = new CobbleWall();

		layout[16][6] = new CobbleWall();
		layout[16][8] = new CobbleWall();
		layout[16][9] = new CobbleWall();
		layout[16][14] = new CobbleWall();
		layout[16][16] = new CobbleWall();
		layout[16][21] = new CobbleWall();
		layout[16][22] = new CobbleWall();
		layout[16][23] = new CobbleWall();
		layout[16][24] = new CobbleWall();
		layout[16][25] = new CobbleWall();
		
		layout[17][6] = new CobbleWall();
		layout[17][8] = new CobbleWall();
		layout[17][9] = new CobbleWall();
		layout[17][11] = new CobbleWall();
		layout[17][12] = new CobbleWall();
		layout[17][13] = new CobbleWall();
		layout[17][14] = new CobbleWall();
		layout[17][16] = new CobbleWall();
		layout[17][17] = new CobbleWall();
		layout[17][19] = new CobbleWall();
		layout[17][20] = new CobbleWall();
		layout[17][21] = new CobbleWall();
		
		layout[18][4] = new CobbleWall();
		layout[18][8] = new CobbleWall();
		layout[18][9] = new CobbleWall();
		layout[18][17] = new CobbleWall();
		layout[18][23] = new CobbleWall();
		layout[18][24] = new CobbleWall();
		layout[18][25] = new CobbleWall();
		layout[18][26] = new CobbleWall();
	
		layout[19][4] = new CobbleWall();
		layout[19][8] = new CobbleWall();
		layout[19][9] = new CobbleWall();
		layout[19][10] = new CobbleWall();
		layout[19][11] = new CobbleWall();
		layout[19][12] = new CobbleWall();
		layout[19][13] = new CobbleWall();
		layout[19][14] = new CobbleWall();
		layout[19][15] = new CobbleWall();
		layout[19][17] = new CobbleWall();
		layout[19][18] = new CobbleWall();
		layout[19][19] = new CobbleWall();
		layout[19][20] = new CobbleWall();
		layout[19][21] = new CobbleWall();
		
		layout[20][8] = new CobbleWall();
		layout[20][23] = new CobbleWall();
		layout[20][24] = new CobbleWall();
		layout[20][25] = new CobbleWall();
	}
	
	@Override
	public void moveCharacter(String direction) {
		if(direction == "up"){
			if(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Stairs){
				Game.game.setScreen(Game.screen7);
			}else if(!(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Obstruction)){
				layout[playerCoordinate[0]-1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] -= 1;
				updateScreen(viewObjects);
				update();
			}
		}else if(direction == "down"){
			if(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Stairs){
				Game.game.setScreen(Game.screen7);
			}else if(!(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Obstruction)){
				layout[playerCoordinate[0]+1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] += 1;
				updateScreen(viewObjects);
				update();
			}
		}else if(direction == "left"){
			if(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Stairs){
				Game.game.setScreen(Game.screen7);
			}else if(!(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Obstruction)){
				layout[playerCoordinate[0]][playerCoordinate[1]-1] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[1] -= 1;
				updateScreen(viewObjects);
				update();
			}
		}else{
			if(layout[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Stairs){
				Game.game.setScreen(Game.screen7);
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
