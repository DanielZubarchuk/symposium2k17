package joeyDaniel;

import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import rhbattlesandstuff.Character;
import rhbattlesandstuff.Monster;
import rhbattlesandstuff.NotPokemonDungeonFinalFantasyCrossOverGame;
import rhbattlesandstuff.Player;
import rhbattlesandstuff.Slime;

public class Floor5 extends Floor {

	

	
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
		layout[12][5] = new CobbleWall();
		layout[12][7] = new CobbleWall();
		layout[12][9] = new CobbleWall();
		layout[12][14] = new CobbleWall();
		layout[12][15] = new CobbleWall();
		layout[12][19] = new CobbleWall();
		layout[12][20] = new CobbleWall();
		layout[12][23] = new CobbleWall();
		
		layout[13][7] = new CobbleWall();
		layout[13][9] = new CobbleWall();
		layout[13][10] = new CobbleWall();
		layout[13][11] = new CobbleWall();
		layout[13][12] = new CobbleWall();
		layout[13][14] = new CobbleWall();
		layout[13][15] = new CobbleWall();
		layout[13][17] = new CobbleWall();
		layout[13][19] = new CobbleWall();
		layout[13][20] = new CobbleWall();
		layout[13][21] = new CobbleWall();
		layout[13][23] = new CobbleWall();
		layout[13][25] = new CobbleWall();
		
		layout[14][4] = new CobbleWall();
		layout[14][5] = new CobbleWall();
		layout[14][6] = new CobbleWall();
		layout[14][7] = new CobbleWall();
		layout[14][14] = new CobbleWall();
		layout[14][15] = new CobbleWall();
		layout[14][17] = new CobbleWall();
		layout[14][23] = new CobbleWall();
		layout[14][25] = new CobbleWall();
		
		layout[15][4] = new CobbleWall();
		layout[15][14] = new CobbleWall();
		layout[15][15] = new CobbleWall();
		layout[15][17] = new CobbleWall();
		layout[15][19] = new CobbleWall();
		layout[15][20] = new CobbleWall();
		layout[15][21] = new CobbleWall();
		layout[15][22] = new CobbleWall();
		layout[15][23] = new CobbleWall();
		layout[15][25] = new CobbleWall();

		layout[16][4] = new CobbleWall();
		layout[16][6] = new CobbleWall();
		layout[16][7] = new CobbleWall();
		layout[16][8] = new CobbleWall();
		layout[16][9] = new CobbleWall();
		layout[16][10] = new CobbleWall();
		layout[16][11] = new CobbleWall();
		layout[16][12] = new CobbleWall();
		layout[16][14] = new CobbleWall();
		layout[16][15] = new CobbleWall();
		layout[16][17] = new CobbleWall();
		layout[16][19] = new CobbleWall();
		layout[16][23] = new CobbleWall();
		layout[16][25] = new CobbleWall();
		
		layout[17][4] = new CobbleWall();
		layout[17][5] = new CobbleWall();
		layout[17][6] = new CobbleWall();
		layout[17][7] = new CobbleWall();
		layout[17][8] = new CobbleWall();
		layout[17][9] = new CobbleWall();
		layout[17][10] = new CobbleWall();
		layout[17][11] = new CobbleWall();
		layout[17][12] = new CobbleWall();
		layout[17][14] = new CobbleWall();
		layout[17][15] = new CobbleWall();
		layout[17][17] = new CobbleWall();
		layout[17][19] = new CobbleWall();
		layout[17][21] = new CobbleWall();
		layout[17][23] = new CobbleWall();
		layout[17][25] = new CobbleWall();
		
		layout[18][4] = new CobbleWall();
		layout[18][14] = new CobbleWall();
		layout[18][15] = new CobbleWall();
		layout[18][17] = new CobbleWall();
		layout[18][19] = new CobbleWall();
		layout[18][21] = new CobbleWall();
		layout[18][23] = new CobbleWall();
		layout[18][25] = new CobbleWall();
	
		layout[19][4] = new CobbleWall();
		layout[19][6] = new CobbleWall();
		layout[19][7] = new CobbleWall();
		layout[19][8] = new CobbleWall();
		layout[19][14] = new CobbleWall();
		layout[19][15] = new CobbleWall();
		layout[19][17] = new CobbleWall();
		layout[19][19] = new CobbleWall();
		layout[19][21] = new CobbleWall();
		layout[19][25] = new CobbleWall();
		
		layout[20][6] = new CobbleWall();
		layout[20][7] = new CobbleWall();
		layout[20][8] = new CobbleWall();
		layout[20][17] = new CobbleWall();
		layout[20][25] = new CobbleWall();
	}
	
	public void background(){
		for(int i = 0; i < 7;i++){
			for(int x = 0; x < 7;x++){
				addObject(new DungeonFloor(i*100,x*100));
			}
		}
	}
	
	public void updateScreen(List<Visible> viewObjects) {
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
				if(layout[row][col] instanceof Player){
					player.setX(300);
					player.setY(300);
					viewObjects.add(player);
				}
				x++;
			}
			y++;
			x=0;
		}
	}
	
	public int[] getPlayerLocation(){
		return playerCoordinate;
	}
	
	public int[] spawnCoord() {
		// TODO Auto-generated method stub
		ArrayList<int[]> ValidCoord = new ArrayList<>();
		for(int row = 0; row<getFloorLayout().length; row++){
			for(int col = 0; col<getFloorLayout()[row].length; col++){
				if(getFloorLayout()[row][col] == null){
					int[] x = {row,col};
					ValidCoord.add(x);
				}
			}
		}
		int pick = (int)(Math.random()*ValidCoord.size());
		return ValidCoord.get(pick);
	}
	
	private void spawnMonster(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		if(Math.random()*100 < 10){
			int[] coord = spawnCoord();
			getFloorLayout()[coord[0]][coord[1]] = new Slime();
			viewObjects.add(getFloorLayout()[coord[0]][coord[1]]);
		}
	}
	
//	private void killMonster(List<Visible> viewObjects, int r, int c){
//		viewObjects.remove(getFloorLayout()[r][c]);
//	}
	public void removeMonster(Monster m, int r, int c){
		System.out.println("trying to remove monster");
//		getFloorLayout()[r][c]=null;
//		remove(getFloorLayout()[r][c]);
//		killMonster(viewObjects, r,c);
		m.setVisible(false);
		m.setDead();
		update();
	}
	
	@Override
	public void moveCharacter(String direction) {
		if(direction == "up"){
			if(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Stairs){
				Game.game.setScreen(Game.screen6);
			}else if(!(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Obstruction)){
				layout[playerCoordinate[0]-1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] -= 1;
				updateScreen(viewObjects);
				update();
			}
		}else if(direction == "down"){
			if(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Stairs){
				NotPokemonDungeonFinalFantasyCrossOverGame.screen6.setChar(player);
				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen6);
			}else if(!(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Obstruction)){
				layout[playerCoordinate[0]+1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] += 1;
				updateScreen(viewObjects);
				update();
			}
		}else if(direction == "left"){
			if(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Stairs){
				NotPokemonDungeonFinalFantasyCrossOverGame.screen6.setChar(player);
				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen6);
			}else if(!(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Obstruction)){
				layout[playerCoordinate[0]][playerCoordinate[1]-1] = layout[playerCoordinate[0]][playerCoordinate[1]];
				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[1] -= 1;
				updateScreen(viewObjects);
				update();
			}
		}else{
			if(layout[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Stairs){
				NotPokemonDungeonFinalFantasyCrossOverGame.screen6.setChar(player);
				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen6);
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

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		layout = new Graphic[24][30];
		initWalls();
		playerCoordinate = new int[2];
		playerCoordinate[0] = 3;
		playerCoordinate[1] = 3;
		layout[3][26] = new Stairs();
		updateScreen(viewObjects);
	}

	@Override
	public void setChar(Character x) {
		// TODO Auto-generated method stub
		
	}
}
