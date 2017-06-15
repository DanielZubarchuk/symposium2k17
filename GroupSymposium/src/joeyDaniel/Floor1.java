package joeyDaniel;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import rhbattlesandstuff.BasicMonster;
import rhbattlesandstuff.Battle;
import rhbattlesandstuff.Character;
import rhbattlesandstuff.Monster;
import rhbattlesandstuff.NotPokemonDungeonFinalFantasyCrossOverGame;
import rhbattlesandstuff.Player;
import rhbattlesandstuff.Slime;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.Screen;

public class Floor1 extends Floor{
	private int floor = 1;
	private int thing = 0;
	private boolean hudstuff;
	private boolean ms;


	private void updateScreen(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		viewObjects.removeAll(viewObjects);
		background();
		int x = 0;
		int y = 0;
		for(int row = playerCoordinate[0]-3; row<=playerCoordinate[0]+3;row++ ){
			for(int col = playerCoordinate[1]-3; col<=playerCoordinate[1]+3;col++ ){
//				if(layout[row][col] instanceof Wall){
//					layout[row][col] = new WoodWall(x*100,y*100);
//					viewObjects.add(layout[row][col]);
//				}
//				if(layout[row][col] instanceof Staircase){
//					layout[row][col] = new Stairs(x*100,y*100);
//					viewObjects.add(layout[row][col]);
//				}
//				if(layout[row][col] instanceof Player){
//					player.setX(300);
//					player.setY(300);
//					viewObjects.add(player);
//				}
				if(getFloorLayout()[row][col] != null){
					getFloorLayout()[row][col].setX(x*100);
					getFloorLayout()[row][col].setY(y*100);
					viewObjects.add(getFloorLayout()[row][col]);
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
				addObject(new GrassPanel(i*100,x*100));
			}
		}
	}

	private void initWalls(){
		setLayout(new Graphic[18][18]);
		for(int i = 0; i<getFloorLayout().length; i++){
			for(int j = 0; j<getFloorLayout()[i].length; j++){
				if(getFloorLayout().length-i<=3 || i<3){
					getFloorLayout()[i][j] = new WoodWall();
				}else{
					if(getFloorLayout()[i].length-j <=3 || j<3){
						getFloorLayout()[i][j] = new WoodWall();
					}
				}
			}
		}
		for(int row = 3; row < getFloorLayout().length-3; row++){
			if(row!= 10){
				getFloorLayout()[row][7] = new WoodWall();
			}
			if(row!= 13){
				getFloorLayout()[row][10] = new WoodWall();
			}
			if(row!= 9){
				getFloorLayout()[row][13] = new WoodWall();
			}
		}
	}

	@Override
	public void moveCharacter(String direction) {
//			if(direction == "up"){
//				if(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Stairs){
//					NotPokemonDungeonFinalFantasyCrossOverGame.screen2.setChar(player);
//					NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen2);
//				}else if(!(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Obstruction)){
//					layout[playerCoordinate[0]-1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
//					layout[playerCoordinate[0]][playerCoordinate[1]] = null;
//					playerCoordinate[0] -= 1;
//					spawnMonster(viewObjects);
//					monsterMove();
//					updateScreen(viewObjects);
//					update();
//				}
//			}else if(direction == "down"){
//				if(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Stairs){
//					NotPokemonDungeonFinalFantasyCrossOverGame.screen2.setChar(player);
//					NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen2);
//				}else if(!(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Obstruction)){
//					layout[playerCoordinate[0]+1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
//					layout[playerCoordinate[0]][playerCoordinate[1]] = null;
//					playerCoordinate[0] += 1;
//					spawnMonster(viewObjects);
//					monsterMove();
//					updateScreen(viewObjects);
//					update();
//				}
//			}else if(direction == "left"){
//				if(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Stairs){
//					NotPokemonDungeonFinalFantasyCrossOverGame.screen2.setChar(player);
//					NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen2);
//				}else if(!(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Obstruction)){
//					layout[playerCoordinate[0]][playerCoordinate[1]-1] = layout[playerCoordinate[0]][playerCoordinate[1]];
//					layout[playerCoordinate[0]][playerCoordinate[1]] = null;
//					playerCoordinate[1] -= 1;
//					spawnMonster(viewObjects);
//					monsterMove();
//					updateScreen(viewObjects);
//					update();
//				}
//			}else{
//				if(layout[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Stairs){
//					NotPokemonDungeonFinalFantasyCrossOverGame.screen2.setChar(player);
//					NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen2);
//				}else if(!(layout[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Obstruction)){
//					layout[playerCoordinate[0]][playerCoordinate[1]+1] = layout[playerCoordinate[0]][playerCoordinate[1]];
//					layout[playerCoordinate[0]][playerCoordinate[1]] = null;
//					playerCoordinate[1] += 1;
//					spawnMonster(viewObjects);
//					monsterMove();
//					updateScreen(viewObjects);
//					update();
//				}
//			}
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
	public void monsterMove() {
		// TODO Auto-generated method stub
		for(int row = 0; row<getFloorLayout().length; row++){
			for(int col = 0; col<getFloorLayout()[row].length; col++){
				if(getFloorLayout()[row][col] instanceof BasicMonster){
					Monster m = (Monster) getFloorLayout()[row][col];
					if(m.isDead == true){
						
					}
					else{
						if(nextToPlayer(row,col)){
//						
						}else{
							if(playerCoordinate[0] < row){
								if(getFloorLayout()[row-1][col] == null||!(getFloorLayout()[row-1][col] instanceof Obstruction)){
									getFloorLayout()[row-1][col] = getFloorLayout()[row][col];
									getFloorLayout()[row][col] = null;
								}else if(playerCoordinate[1] < col){
									if(getFloorLayout()[row][col-1] == null||!(getFloorLayout()[row][col-1] instanceof Obstruction)){
										getFloorLayout()[row][col-1] = getFloorLayout()[row][col];
										getFloorLayout()[row][col] = null;
									}
								}else if(playerCoordinate[1] > col){
									if(getFloorLayout()[row][col+1] == null||!(getFloorLayout()[row][col+1] instanceof Obstruction)){
										getFloorLayout()[row][col+1] = getFloorLayout()[row][col];
										getFloorLayout()[row][col] = null;
									}
								}
							}else if(playerCoordinate[0] > row){
								if(getFloorLayout()[row+1][col] == null||!(getFloorLayout()[row+1][col] instanceof Obstruction)){
									getFloorLayout()[row+1][col] = getFloorLayout()[row][col];
									getFloorLayout()[row][col] = null;
								}else if(playerCoordinate[1] < col){
									if(getFloorLayout()[row][col-1] == null||!(getFloorLayout()[row][col-1] instanceof Obstruction)){
										getFloorLayout()[row][col-1] = getFloorLayout()[row][col];
										getFloorLayout()[row][col] = null;
									}
								}else if(playerCoordinate[1] > col){
									if(getFloorLayout()[row][col+1] == null||!(getFloorLayout()[row][col+1] instanceof Obstruction)){
										getFloorLayout()[row][col+1] = getFloorLayout()[row][col];
										getFloorLayout()[row][col] = null;
									}
								}
							}else{
								if(playerCoordinate[1] < col){
									if(getFloorLayout()[row][col-1] == null||!(getFloorLayout()[row][col-1] instanceof Obstruction)){
										getFloorLayout()[row][col-1] = getFloorLayout()[row][col];
										getFloorLayout()[row][col] = null;
									}
								}else if(playerCoordinate[1] > col){
									if(getFloorLayout()[row][col+1] == null||!(getFloorLayout()[row][col+1] instanceof Obstruction)){
										getFloorLayout()[row][col+1] = getFloorLayout()[row][col];
										getFloorLayout()[row][col] = null;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	private boolean nextToPlayer(int row, int col) {
		// TODO Auto-generated method stub
		if(playerCoordinate[0] == row && (playerCoordinate[1] == col-1 || playerCoordinate[1] == col+1)){
			return true;
		}
		if(playerCoordinate[1] == col && (playerCoordinate[0] == row-1 || playerCoordinate[0] == row+1)){
			return true;
		}
		return false;
		
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

	@Override
	public void initAllObjects(List<guiTeacher.interfaces.Visible> viewObjects) {
		// TODO Auto-generated method stub
		playerCoordinate = new int[2];
		playerCoordinate[0] = 3;
		playerCoordinate[1] = 14;
		initWalls();
		getFloorLayout()[5][5] = new Stairs();
		updateScreen(viewObjects);
		update();
	}

	@Override
	public void setChar(Character x) {
		// TODO Auto-generated method stub
		player = x;
		getFloorLayout()[3][14] = player;
		updateScreen(viewObjects);
		update();
	}
	
//	public void checkMonster(){
//		System.out.println("checking for monster");
//		int r = getPlayerCoordinate()[0];
//		int c = getPlayerCoordinate()[1];
//		for(int i=r-1; i < r+2; i++){
//			for(int j = c-1; j<c+2; j++){
//				if(!(getFloorLayout()[r][c]== null) && getFloorLayout()[r][c] instanceof Monster){
//					System.out.println("I found a monster");
//					Monster m = (Monster)getFloorLayout()[r][c];
//					if(m.getStats()[0]<0){
//						System.out.println("setting this to null");					
//						getFloorLayout()[r][c] = null;
//					}
//				}
//			}
//		}
//	}

	public void keyPressed(KeyEvent k) {
			if(k.getKeyCode() == KeyEvent.VK_0){
				
				
				
				player.addAttacks("Tackle", 3);
				player.addAttacks("Lick", 2);
				player.addAttacks("Slap", 2);
				player.addAttacks("Pound", 4);
			}
//		else if (k.getKeyCode() == KeyEvent.VK_8){
//			System.out.println("message");
//			Thread battle = new Thread(new Runnable() {
//				
//				@Override
//				public void run() {
//					System.out.println("message a");
//					Battle.engage(a);
//					Battle.engage(a2);
//					Battle.setPlayer(player);o
//					Battle.runBattle();
//				}
//			});
//			battle.start();
//		}
			else if (k.getKeyCode() == KeyEvent.VK_Z){
//			initMenu(viewObjects);
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
//	if(Battle.pick){
//		if(k.getKeyCode() == KeyEvent.VK_UP && monNum == 0){
//			System.out.println(a.getMonNum());
//			monNum = 0;
//			System.out.println("You have selected" + Battle.enemy.get(monNum).getId());
//		}
//	}
//	else {
//		NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.cyocawScreen);
//	}
	}


}