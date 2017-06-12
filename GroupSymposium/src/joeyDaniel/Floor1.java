package joeyDaniel;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import rhbattlesandstuff.BasicMonster;
import rhbattlesandstuff.Battle;
import rhbattlesandstuff.Character;
import rhbattlesandstuff.NotPokemonDungeonFinalFantasyCrossOverGame;
import rhbattlesandstuff.Player;
import rhbattlesandstuff.Slime;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;

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
				if(layout[row][col] != null){
					layout[row][col].setX(x*100);
					layout[row][col].setY(y*100);
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
				addObject(new GrassPanel(i*100,x*100));
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
			layout[coord[0]][coord[1]] = new Slime();
			viewObjects.add(layout[coord[0]][coord[1]]);
		}
	}

	@Override
	public void monsterMove() {
		// TODO Auto-generated method stub
		for(int row = 0; row<layout.length; row++){
			for(int col = 0; col<layout[row].length; col++){
				if(layout[row][col] instanceof BasicMonster){
					if(nextToPlayer(row,col)){
//						
					}else{
						if(playerCoordinate[0] < row){
							if(layout[row-1][col] == null||!(layout[row-1][col] instanceof Obstruction)){
								layout[row-1][col] = layout[row][col];
								layout[row][col] = null;
							}else if(playerCoordinate[1] < col){
								if(layout[row][col-1] == null||!(layout[row][col-1] instanceof Obstruction)){
									layout[row][col-1] = layout[row][col];
									layout[row][col] = null;
								}
							}else if(playerCoordinate[1] > col){
								if(layout[row][col+1] == null||!(layout[row][col+1] instanceof Obstruction)){
									layout[row][col+1] = layout[row][col];
									layout[row][col] = null;
								}
							}
						}else if(playerCoordinate[0] > row){
							if(layout[row+1][col] == null||!(layout[row+1][col] instanceof Obstruction)){
								layout[row+1][col] = layout[row][col];
								layout[row][col] = null;
							}else if(playerCoordinate[1] < col){
								if(layout[row][col-1] == null||!(layout[row][col-1] instanceof Obstruction)){
									layout[row][col-1] = layout[row][col];
									layout[row][col] = null;
								}
							}else if(playerCoordinate[1] > col){
								if(layout[row][col+1] == null||!(layout[row][col+1] instanceof Obstruction)){
									layout[row][col+1] = layout[row][col];
									layout[row][col] = null;
								}
							}
						}else{
							if(playerCoordinate[1] < col){
								if(layout[row][col-1] == null||!(layout[row][col-1] instanceof Obstruction)){
									layout[row][col-1] = layout[row][col];
									layout[row][col] = null;
								}
							}else if(playerCoordinate[1] > col){
								if(layout[row][col+1] == null||!(layout[row][col+1] instanceof Obstruction)){
									layout[row][col+1] = layout[row][col];
									layout[row][col] = null;
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
		for(int row = 0; row<layout.length; row++){
			for(int col = 0; col<layout[row].length; col++){
				if(layout[row][col] == null){
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
		layout[5][5] = new Stairs();
		updateScreen(viewObjects);
		update();
	}

	@Override
	public void setChar(Character x) {
		// TODO Auto-generated method stub
		player = x;
		layout[3][14] = player;
		updateScreen(viewObjects);
		update();
	}

	public void keyPressed(KeyEvent k) {
			// TODO Auto-generated method stub\
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
			if(!hudstuff){
				if(k.getKeyCode() == KeyEvent.VK_UP){
					if(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Stairs){
						NotPokemonDungeonFinalFantasyCrossOverGame.screen2.setChar(player);
						NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen2);
					}else if(!(layout[playerCoordinate[0]-1][playerCoordinate[1]] instanceof Obstruction)){
						layout[playerCoordinate[0]-1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
						layout[playerCoordinate[0]][playerCoordinate[1]] = null;
						playerCoordinate[0] -= 1;
						spawnMonster(viewObjects);
						monsterMove();
						updateScreen(viewObjects);
						update();
					}
				}else if(k.getKeyCode() == KeyEvent.VK_DOWN){
					if(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Stairs){
						NotPokemonDungeonFinalFantasyCrossOverGame.screen2.setChar(player);
						NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen2);
					}else if(!(layout[playerCoordinate[0]+1][playerCoordinate[1]] instanceof Obstruction)){
						layout[playerCoordinate[0]+1][playerCoordinate[1]] = layout[playerCoordinate[0]][playerCoordinate[1]];
						layout[playerCoordinate[0]][playerCoordinate[1]] = null;
						playerCoordinate[0] += 1;
						spawnMonster(viewObjects);
						monsterMove();
						updateScreen(viewObjects);
						update();
					}
				}else if(k.getKeyCode() == KeyEvent.VK_LEFT){
					if(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Stairs){
						NotPokemonDungeonFinalFantasyCrossOverGame.screen2.setChar(player);
						NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen2);
					}else if(!(layout[playerCoordinate[0]][playerCoordinate[1]-1] instanceof Obstruction)){
						layout[playerCoordinate[0]][playerCoordinate[1]-1] = layout[playerCoordinate[0]][playerCoordinate[1]];
						layout[playerCoordinate[0]][playerCoordinate[1]] = null;
						playerCoordinate[1] -= 1;
						spawnMonster(viewObjects);
						monsterMove();
						updateScreen(viewObjects);
						update();
					}
				}else{
					if(layout[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Stairs){
						NotPokemonDungeonFinalFantasyCrossOverGame.screen2.setChar(player);
						NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen2);
					}else if(!(layout[playerCoordinate[0]][playerCoordinate[1]+1] instanceof Obstruction)){
						layout[playerCoordinate[0]][playerCoordinate[1]+1] = layout[playerCoordinate[0]][playerCoordinate[1]];
						layout[playerCoordinate[0]][playerCoordinate[1]] = null;
						playerCoordinate[1] += 1;
						spawnMonster(viewObjects);
						monsterMove();
						updateScreen(viewObjects);
						update();
					}
				}
				ms = false;
			}
//		if(Battle.pick){
//			if(k.getKeyCode() == KeyEvent.VK_UP && monNum == 0){
//				System.out.println(a.getMonNum());
//				monNum = 0;
//				System.out.println("You have selected" + Battle.enemy.get(monNum).getId());
//			}
//		}
//		else {
//			NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.cyocawScreen);
//		}
		}

	
}
