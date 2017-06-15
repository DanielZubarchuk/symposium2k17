
package joeyDaniel;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import rhbattlesandstuff.Battle;
import rhbattlesandstuff.Character;
import rhbattlesandstuff.Monster;
import rhbattlesandstuff.NotPokemonDungeonFinalFantasyCrossOverGame;
import rhbattlesandstuff.Player;
import rhbattlesandstuff.Slime;
public class Floor4 extends Floor{

	

	
	
	private boolean hudstuff;
	private boolean ms;
	private int thing;

	public void background(){
		for(int i = 0; i < 7;i++){
			for(int x = 0; x < 7;x++){
				addObject(new Sand(i*100,x*100));
			}
		}
	}
	
	private void initWalls(){
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
		layout[16][25] = new SmallWall();
		
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
					layout[row][col] = new SmallWall(x*100,y*100);
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
	@Override
	public void keyPressed(KeyEvent k) {
		if(k.getKeyCode() == KeyEvent.VK_0){



			player.addAttacks("Tackle", 3);
			player.addAttacks("Lick", 2);
			player.addAttacks("Slap", 2);
			player.addAttacks("Pound", 4);
		}
		//	else if (k.getKeyCode() == KeyEvent.VK_8){
		//		System.out.println("message");
		//		Thread battle = new Thread(new Runnable() {
		//			
		//			@Override
		//			public void run() {
		//				System.out.println("message a");
		//				Battle.engage(a);
		//				Battle.engage(a2);
		//				Battle.setPlayer(player);o
		//				Battle.runBattle();
		//			}
		//		});
		//		battle.start();
		//	}
		else if (k.getKeyCode() == KeyEvent.VK_Z){
			//		initMenu(viewObjects);
			monsterMove();
			spawnMonster(viewObjects);
			updateScreen(viewObjects);
			update();
			if(hudstuff && ms){
				Battle.doTheMove();
			}
			else{
				Battle.doMoveA();
			}
		}
		else if(k.getKeyCode() == KeyEvent.VK_ENTER){
			hudstuff = !hudstuff;
		}
		if(hudstuff){
			ms = true;
			System.out.println("Menu is open");
			if(k.getKeyCode() == KeyEvent.VK_UP && thing == 0){
				System.out.println(thing);
				thing = 0;
				System.out.println("This the " + player.getMoves().get(player.getThing()).getAttName() + " option"); 	
			}
			else if(k.getKeyCode() == KeyEvent.VK_UP){
				System.out.println(thing);
				player.setThing(-- thing);
				System.out.println("This the " + player.getMoves().get(player.getThing()).getAttName() + " option"); 
			}
			else if(k.getKeyCode() == KeyEvent.VK_DOWN && thing == 3){
				System.out.println(thing);
				thing = 3;
				System.out.println("This the " + player.getMoves().get(player.getThing()).getAttName() + " option"); 
			}
			else if(k.getKeyCode() == KeyEvent.VK_DOWN){
				System.out.println(thing);
				player.setThing(++ thing);
				System.out.println("This the " + player.getMoves().get(player.getThing()).getAttName() + " option");
				System.out.println(thing);
			}
		}
		if(!hudstuff){if(k.getKeyCode() == KeyEvent.VK_UP){

			if(getFloorLayout()[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Stairs){
				NotPokemonDungeonFinalFantasyCrossOverGame.screen2.setChar(player);
				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen2);
			}else if(!(getFloorLayout()[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Obstruction)){
				getFloorLayout()[playerCoordinate[0]-1][playerCoordinate[1]] = getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]];
				getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] -= 1;
				spawnMonster(viewObjects);
				monsterMove();
				updateScreen(viewObjects);
				update();
			}else if(getFloorLayout()[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Monster){
				Monster m = (Monster) getFloorLayout()[playerCoordinate[0]-1][playerCoordinate[1]];
				if(m.isDead == true){
					getFloorLayout()[playerCoordinate[0]-1][playerCoordinate[1]] = getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]];
					getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]] = null;
					playerCoordinate[0] -= 1;
					spawnMonster(viewObjects);
					monsterMove();
					updateScreen(viewObjects);
					update();
				}
			}
		}else if(k.getKeyCode() == KeyEvent.VK_DOWN){
			if(getFloorLayout()[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Stairs){
				NotPokemonDungeonFinalFantasyCrossOverGame.screen2.setChar(player);
				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen2);
			}else if(!(getFloorLayout()[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Obstruction)){
				getFloorLayout()[playerCoordinate[0]+1][playerCoordinate[1]] = getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]];
				getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[0] += 1;
				spawnMonster(viewObjects);
				monsterMove();
				updateScreen(viewObjects);
				update();
			}else if(getFloorLayout()[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Monster){
				Monster m = (Monster) getFloorLayout()[playerCoordinate[0]+1][playerCoordinate[1]];
				if(m.isDead == true){
					getFloorLayout()[playerCoordinate[0]+1][playerCoordinate[1]] = getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]];
					getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]] = null;
					playerCoordinate[0] += 1;
					spawnMonster(viewObjects);
					monsterMove();
					updateScreen(viewObjects);
					update();
				}
			}
		}else if(k.getKeyCode() == KeyEvent.VK_LEFT){
			if(getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Stairs){
				NotPokemonDungeonFinalFantasyCrossOverGame.screen2.setChar(player);
				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen2);
			}else if(!(getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Obstruction)){
				getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]-1] = getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]];
				getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[1] -= 1;
				spawnMonster(viewObjects);
				monsterMove();
				updateScreen(viewObjects);
				update();
			}else if(getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Monster){
				Monster m = (Monster) getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]-1];
				if(m.isDead == true){
					getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]-1] = getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]];
					getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]] = null;
					playerCoordinate[1] -= 1;
					spawnMonster(viewObjects);
					monsterMove();
					updateScreen(viewObjects);
					update();
				}
			}
		}else if(k.getKeyCode() == KeyEvent.VK_RIGHT){
			if(getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Stairs){
				NotPokemonDungeonFinalFantasyCrossOverGame.screen2.setChar(player);
				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen2);
			}else if(!(getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Obstruction)){
				getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]+1] = getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]];
				getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]] = null;
				playerCoordinate[1] += 1;
				spawnMonster(viewObjects);
				monsterMove();
				updateScreen(viewObjects);
				update();
			}else if(getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Monster){
				Monster m = (Monster) getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]+1];
				if(m.isDead == true){
					getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]+1] = getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]];
					getFloorLayout()[playerCoordinate[0]][playerCoordinate[1]] = null;
					playerCoordinate[1] += 1;
					spawnMonster(viewObjects);
					monsterMove();
					updateScreen(viewObjects);
					update();
				}
			}
		}
		ms = false;
		}
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
//		if(direction == "up"){
//			if(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Stairs){
//				NotPokemonDungeonFinalFantasyCrossOverGame.screen5.setChar(player);
//				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen5);
//			}else if(!(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Obstruction)){
//				layout[playerCoordinate[0]-1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
//				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
//				playerCoordinate[0] -= 1;
//				updateScreen(viewObjects);
//				update();
//			}
//		}else if(direction == "down"){
//			if(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Stairs){
//				NotPokemonDungeonFinalFantasyCrossOverGame.screen5.setChar(player);
//				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen5);
//			}else if(!(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Obstruction)){
//				layout[playerCoordinate[0]+1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
//				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
//				playerCoordinate[0] += 1;
//				updateScreen(viewObjects);
//				update();
//			}
//		}else if(direction == "left"){
//			if(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Stairs){
//				NotPokemonDungeonFinalFantasyCrossOverGame.screen5.setChar(player);
//				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen5);
//			}else if(!(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Obstruction)){
//				layout[playerCoordinate[0]][playerCoordinate[1]-1] = layout[playerCoordinate[0]][playerCoordinate[1]];
//				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
//				playerCoordinate[1] -= 1;
//				updateScreen(viewObjects);
//				update();
//			}
//		}else{
//			if(layout[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Stairs){
//				NotPokemonDungeonFinalFantasyCrossOverGame.screen5.setChar(player);
//				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen5);
//			}else if(!(layout[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Obstruction)){
//				layout[playerCoordinate[0]][playerCoordinate[1]+1] = layout[playerCoordinate[0]][playerCoordinate[1]];
//				layout[playerCoordinate[0]][playerCoordinate[1]] = null;
//				playerCoordinate[1] += 1;
//				updateScreen(viewObjects);
//				update();
//			}
//		}
	}


	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		layout = new Graphic[24][30];
		playerCoordinate = new int[2];
		playerCoordinate[0] = 20;
		playerCoordinate[1] = 26;
		layout[12][5] = new Stairs();
		initWalls();
		updateScreen(viewObjects);
	}
	
	@Override
	public void setChar(Character x) {
		// TODO Auto-generated method stub
		player = x;
		layout[20][26] = player;
		updateScreen(viewObjects);
		update();

	}
}
