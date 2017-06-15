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

public class Floor3 extends Floor {


	private boolean ms;
	private boolean hudstuff;
	private int thing;

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
		layout[3][7] = new SmallWall();
		layout[3][9] = new SmallWall();
		layout[3][17] = new SmallWall();

		layout[4][5] = new SmallWall();
		layout[4][7] = new SmallWall();
		layout[4][9] = new SmallWall();
		layout[4][17] = new SmallWall();
		layout[4][18] = new SmallWall();
		layout[4][19] = new SmallWall();
		layout[4][20] = new SmallWall();
		layout[4][21] = new SmallWall();
		layout[4][22] = new SmallWall();
		layout[4][23] = new SmallWall();
		layout[4][25] = new SmallWall();
		layout[4][26] = new SmallWall();

		layout[5][5] = new SmallWall();
		layout[5][7] = new SmallWall();
		layout[5][9] = new SmallWall();
		layout[5][13] = new SmallWall();
		layout[5][14] = new SmallWall();

		layout[6][5] = new SmallWall();
		layout[6][9] = new SmallWall();
		layout[6][13] = new SmallWall();
		layout[6][14] = new SmallWall();

		layout[7][5] = new SmallWall();
		layout[7][7] = new SmallWall();
		layout[7][9] = new SmallWall();
		layout[7][13] = new SmallWall();
		layout[7][14] = new SmallWall();
		layout[7][15] = new SmallWall();
		layout[7][16] = new SmallWall();
		layout[7][17] = new SmallWall();
		layout[7][18] = new SmallWall();
		layout[7][19] = new SmallWall();
		layout[7][21] = new SmallWall();
		layout[7][22] = new SmallWall();
		layout[7][23] = new SmallWall();
		layout[7][24] = new SmallWall();
		layout[7][25] = new SmallWall();
		layout[7][26] = new SmallWall();

		layout[8][5] = new SmallWall();
		layout[8][7] = new SmallWall();
		layout[8][9] = new SmallWall();
		layout[8][13] = new SmallWall();
		layout[8][14] = new SmallWall();

		layout[9][5] = new SmallWall();
		layout[9][7] = new SmallWall();
		layout[9][13] = new SmallWall();
		layout[9][14] = new SmallWall();

		layout[10][3] = new SmallWall();
		layout[10][4] = new SmallWall();
		layout[10][5] = new SmallWall();
		layout[10][6] = new SmallWall();
		layout[10][7] = new SmallWall();
		layout[10][8] = new SmallWall();
		layout[10][13] = new SmallWall();
		layout[10][14] = new SmallWall();

		layout[11][13] = new SmallWall();
		layout[11][14] = new SmallWall();
		layout[11][15] = new SmallWall();
		layout[11][16] = new SmallWall();
		layout[11][17] = new SmallWall();
		layout[11][18] = new SmallWall();
		layout[11][22] = new SmallWall();
		layout[11][23] = new SmallWall();
		layout[11][24] = new SmallWall();
		layout[11][25] = new SmallWall();
		layout[11][26] = new SmallWall();

		layout[12][13] = new SmallWall();
		layout[12][14] = new SmallWall();
		layout[12][18] = new SmallWall();

		layout[13][7] = new SmallWall();
		layout[13][10] = new SmallWall();
		layout[13][13] = new SmallWall();
		layout[13][14] = new SmallWall();
		layout[13][18] = new SmallWall();
		layout[13][19] = new SmallWall();
		layout[13][20] = new SmallWall();
		layout[13][21] = new SmallWall();
		layout[13][22] = new SmallWall();
		layout[13][23] = new SmallWall();
		layout[13][24] = new SmallWall();

		layout[14][7] = new SmallWall();
		layout[14][10] = new SmallWall();
		layout[14][13] = new SmallWall();
		layout[14][14] = new SmallWall();
		layout[14][16] = new SmallWall();
		layout[14][18] = new SmallWall();
		layout[14][22] = new SmallWall();
		layout[14][23] = new SmallWall();
		layout[14][24] = new SmallWall();

		layout[15][7] = new SmallWall();
		layout[15][10] = new SmallWall();
		layout[15][13] = new SmallWall();
		layout[15][14] = new SmallWall();
		layout[15][16] = new SmallWall();
		layout[15][18] = new SmallWall();
		layout[15][22] = new SmallWall();
		layout[15][23] = new SmallWall();
		layout[15][24] = new SmallWall();

		layout[16][3] = new SmallWall();
		layout[16][4] = new SmallWall();
		layout[16][5] = new SmallWall();
		layout[16][6] = new SmallWall();
		layout[16][7] = new SmallWall();
		layout[16][10] = new SmallWall();
		layout[16][13] = new SmallWall();
		layout[16][14] = new SmallWall();
		layout[16][16] = new SmallWall();
		layout[16][18] = new SmallWall();
		layout[16][22] = new SmallWall();
		layout[16][23] = new SmallWall();
		layout[16][24] = new SmallWall();

		layout[17][10] = new SmallWall();
		layout[17][13] = new SmallWall();
		layout[17][14] = new SmallWall();
		layout[17][16] = new SmallWall();
		layout[17][18] = new SmallWall();
		layout[17][20] = new SmallWall();
		layout[17][22] = new SmallWall();
		layout[17][24] = new SmallWall();
		layout[17][25] = new SmallWall();
		layout[17][26] = new SmallWall();

		layout[18][10] = new SmallWall();
		layout[18][16] = new SmallWall();
		layout[18][18] = new SmallWall();
		layout[18][20] = new SmallWall();
		layout[18][22] = new SmallWall();

		layout[19][10] = new SmallWall();
		layout[19][16] = new SmallWall();
		layout[19][20] = new SmallWall();
		layout[19][22] = new SmallWall();
		layout[19][23] = new SmallWall();
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
		layout[20][16] = new SmallWall();
		layout[20][20] = new SmallWall();


	}

	public void background(){
		for(int i = 0; i < 7;i++){
			for(int x = 0; x < 7;x++){
				addObject(new Sand(i*100,x*100));
			}
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
	@Override
	public void initAllObjects(List<guiTeacher.interfaces.Visible> viewObjects) {
		// TODO Auto-generated method stub
		layout = new Graphic[24][30];
		initWalls();
		playerCoordinate = new int[2];
		playerCoordinate[0] = 18;
		playerCoordinate[1] = 3;
		layout[9][26] = new Stairs();
		updateScreen(viewObjects);
		update();
	}

	@Override
	public void setChar(Character x) {
		// TODO Auto-generated method stub
		player = x;
		layout[18][3] = player;
		updateScreen(viewObjects);
		update();

	}

	@Override
	public void moveCharacter(String direction) {
		// TODO Auto-generated method stub
		
	}

	
}
