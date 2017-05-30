package joeyDaniel;

import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class Floor1 extends Floor{
	private Graphic[][] layout;
	private int[] playerCoordinate;

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		playerCoordinate = new int[2];
		playerCoordinate[0] = 3;
		playerCoordinate[1] = 14;
		initWalls();
		layout[5][5] = new Stairs();
		updateScreen(viewObjects);
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

	public void background(){
		for(int i = 0; i < 7;i++){
			for(int x = 0; x < 7;x++){
				viewObjects.add(new GrassPanel(i*100,x*100));
			}
		}
	}

	private void initWalls(){
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
		for(int row = 3; row < layout.length-3; row++){
			for(int col = 3; col<layout[row].length-3;col++){
				if(layout[row][col] == null){
					layout[row][col] = new Blank();
				}
			}				
		}
	}

	@Override
	public void moveCharacter(String direction) {
		if(direction == "up"){
			if(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Stairs){
				Map.game.setScreen(Map.screen2);
			}else if(!(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Obstruction)){
				layout[playerCoordinate[0]-1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] -= 1;
				updateScreen(viewObjects);
				update();
			}
		}else if(direction == "down"){
			if(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Stairs){
				Map.game.setScreen(Map.screen2);
			}else if(!(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Obstruction)){
				layout[playerCoordinate[0]+1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] += 1;
				updateScreen(viewObjects);
				update();
			}
		}else if(direction == "left"){
			if(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Stairs){
				Map.game.setScreen(Map.screen2);
			}else if(!(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Obstruction)){
				layout[playerCoordinate[0]][playerCoordinate[1]-1] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[1] -= 1;
				updateScreen(viewObjects);
				update();
			}
		}else{
			if(layout[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Stairs){
				Map.game.setScreen(Map.screen2);
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
