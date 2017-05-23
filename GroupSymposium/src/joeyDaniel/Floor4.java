
package joeyDaniel;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class Floor4 extends Floor{


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
					layout[i][j] = new SmallWall();
				}else{
					if(layout[i].length-j <=3 || j<3){
						layout[i][j] = new SmallWall();
					}
				}
			}
		}
		layout[3][11] = new SmallWall();
		layout[3][12] = new SmallWall();
		
		layout[4][4] = new SmallWall();
		layout[4][5] = new SmallWall();
		layout[4][6] = new SmallWall();
		layout[4][7] = new SmallWall();
		layout[4][11] = new SmallWall();
		layout[4][12] = new SmallWall();
		layout[4][17] = new SmallWall();
		layout[4][18] = new SmallWall();
		layout[4][19] = new SmallWall();
		layout[4][20] = new SmallWall();
		layout[4][21] = new SmallWall();
		layout[4][22] = new SmallWall();
		layout[4][24] = new SmallWall();
		layout[4][25] = new SmallWall();
		layout[4][26] = new SmallWall();
		
		layout[5][4] = new SmallWall();
		layout[5][5] = new SmallWall();
		layout[5][6] = new SmallWall();
		layout[5][7] = new SmallWall();
		layout[5][11] = new SmallWall();
		layout[5][12] = new SmallWall();
		layout[5][17] = new SmallWall();
		layout[5][18] = new SmallWall();
		layout[5][19] = new SmallWall();
		layout[5][20] = new SmallWall();
		layout[5][21] = new SmallWall();
		layout[5][22] = new SmallWall();
		
		layout[6][7] = new SmallWall();
		layout[6][8] = new SmallWall();
		layout[6][9] = new SmallWall();
		layout[6][10] = new SmallWall();
		layout[6][11] = new SmallWall();
		layout[6][12] = new SmallWall();
		layout[6][17] = new SmallWall();
		layout[6][18] = new SmallWall();
		layout[6][19] = new SmallWall();
		layout[6][20] = new SmallWall();
		layout[6][21] = new SmallWall();
		layout[6][22] = new SmallWall();
		
		layout[7][4] = new SmallWall();
		layout[7][5] = new SmallWall();
		layout[7][7] = new SmallWall();
		layout[7][8] = new SmallWall();
		layout[7][9] = new SmallWall();
		layout[7][10] = new SmallWall();
		layout[7][11] = new SmallWall();
		layout[7][12] = new SmallWall();
		layout[7][14] = new SmallWall();
		layout[7][15] = new SmallWall();
		layout[7][16] = new SmallWall();
		layout[7][17] = new SmallWall();
		layout[7][18] = new SmallWall();
		layout[7][19] = new SmallWall();
		layout[7][20] = new SmallWall();
		layout[7][21] = new SmallWall();
		layout[7][22] = new SmallWall();
		
		layout[8][19] = new SmallWall();
		layout[8][20] = new SmallWall();
		layout[8][21] = new SmallWall();
		layout[8][22] = new SmallWall();
		layout[8][24] = new SmallWall();
		layout[8][25] = new SmallWall();
		layout[8][26] = new SmallWall();
		
		layout[9][3] = new SmallWall();
		layout[9][4] = new SmallWall();
		layout[9][7] = new SmallWall();
		layout[9][8] = new SmallWall();
		layout[9][10] = new SmallWall();
		layout[9][11] = new SmallWall();
		layout[9][14] = new SmallWall();
		layout[9][19] = new SmallWall();
		layout[9][20] = new SmallWall();
		layout[9][21] = new SmallWall();
		layout[9][22] = new SmallWall();
		layout[9][24] = new SmallWall();
		layout[9][25] = new SmallWall();
		layout[9][26] = new SmallWall();
		
		layout[10][7] = new SmallWall();
		layout[10][8] = new SmallWall();
		layout[10][14] = new SmallWall();
		layout[10][19] = new SmallWall();
		layout[10][20] = new SmallWall();
		layout[10][21] = new SmallWall();
		layout[10][22] = new SmallWall();
		layout[10][24] = new SmallWall();
		layout[10][25] = new SmallWall();
		layout[10][26] = new SmallWall();
		
		layout[11][4] = new SmallWall();
		layout[11][5] = new SmallWall();
		layout[11][6] = new SmallWall();
		layout[11][7] = new SmallWall();
		layout[11][8] = new SmallWall();
		layout[11][10] = new SmallWall();
		layout[11][12] = new SmallWall();
		layout[11][14] = new SmallWall();
		
		layout[12][4] = new SmallWall();
		layout[12][8] = new SmallWall();
		layout[12][14] = new SmallWall();
		layout[12][15] = new SmallWall();
		layout[12][17] = new SmallWall();
		layout[12][18] = new SmallWall();
		layout[12][19] = new SmallWall();
		layout[12][20] = new SmallWall();
		layout[12][21] = new SmallWall();
		layout[12][22] = new SmallWall();
		layout[12][24] = new SmallWall();
		layout[12][25] = new SmallWall();
		
		layout[13][4] = new SmallWall();
		layout[13][5] = new SmallWall();
		layout[13][6] = new SmallWall();
		layout[13][8] = new SmallWall();
		layout[13][9] = new SmallWall();
		layout[13][10] = new SmallWall();
		layout[13][11] = new SmallWall();
		layout[13][12] = new SmallWall();
		layout[13][14] = new SmallWall();
		layout[13][15] = new SmallWall();
		layout[13][18] = new SmallWall();
		layout[13][22] = new SmallWall();
		layout[13][24] = new SmallWall();
		layout[13][25] = new SmallWall();
		
		layout[14][6] = new SmallWall();
		layout[14][11] = new SmallWall();
		layout[14][12] = new SmallWall();
		layout[14][14] = new SmallWall();
		layout[14][15] = new SmallWall();
		layout[14][18] = new SmallWall();
		layout[14][20] = new SmallWall();
		layout[14][22] = new SmallWall();
		layout[14][24] = new SmallWall();
		layout[14][25] = new SmallWall();
		
		layout[15][4] = new SmallWall();
		layout[15][6] = new SmallWall();
		layout[15][11] = new SmallWall();
		layout[15][15] = new SmallWall();
		layout[15][17] = new SmallWall();
		layout[15][18] = new SmallWall();
		layout[15][20] = new SmallWall();
		layout[15][22] = new SmallWall();
		layout[15][24] = new SmallWall();
		layout[15][25] = new SmallWall();

		layout[16][6] = new SmallWall();
		layout[16][11] = new SmallWall();
		layout[16][13] = new SmallWall();
		layout[16][15] = new SmallWall();
		layout[16][17] = new SmallWall();
		layout[16][18] = new SmallWall();
		layout[16][20] = new SmallWall();
		layout[16][22] = new SmallWall();
		layout[16][24] = new SmallWall();
		
		layout[17][4] = new SmallWall();
		layout[17][5] = new SmallWall();
		layout[17][6] = new SmallWall();
		layout[17][7] = new SmallWall();
		layout[17][9] = new SmallWall();
		layout[17][10] = new SmallWall();
		layout[17][11] = new SmallWall();
		layout[17][15] = new SmallWall();
		layout[17][17] = new SmallWall();
		layout[17][18] = new SmallWall();
		layout[17][20] = new SmallWall();
		layout[17][21] = new SmallWall();
		layout[17][22] = new SmallWall();
		layout[17][24] = new SmallWall();
		layout[17][25] = new SmallWall();
		
		layout[18][4] = new SmallWall();
		layout[18][5] = new SmallWall();
		layout[18][6] = new SmallWall();
		layout[18][7] = new SmallWall();
		layout[18][9] = new SmallWall();
		layout[18][10] = new SmallWall();
		layout[18][11] = new SmallWall();
		layout[18][12] = new SmallWall();
		layout[18][14] = new SmallWall();
		layout[18][15] = new SmallWall();
		layout[18][17] = new SmallWall();
		layout[18][18] = new SmallWall();
		layout[18][24] = new SmallWall();
		layout[18][25] = new SmallWall();
		
		layout[19][14] = new SmallWall();
		layout[19][18] = new SmallWall();
		layout[19][24] = new SmallWall();
		layout[19][25] = new SmallWall();
		
		layout[20][3] = new SmallWall();
		layout[20][4] = new SmallWall();
		layout[20][5] = new SmallWall();
		layout[20][6] = new SmallWall();
		layout[20][7] = new SmallWall();
		layout[20][8] = new SmallWall();
		layout[20][9] = new SmallWall();
		layout[20][10] = new SmallWall();
		layout[20][11] = new SmallWall();
		layout[20][12] = new SmallWall();
		layout[20][13] = new SmallWall();
		layout[20][14] = new SmallWall();
		layout[20][18] = new SmallWall();
		layout[20][24] = new SmallWall();
		layout[20][25] = new SmallWall();
		
		
		background();
		UpdateScreen(viewObjects);
		
	}
	
	public void background(){
		for(int i = 0; i < 7;i++){
			for(int x = 0; x < 7;x++){
				addObject(new Sand(i*100,x*100));
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
				if(layout[row][col] instanceof Wall){
					layout[row][col] = new SmallWall(x*100,y*100);
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
