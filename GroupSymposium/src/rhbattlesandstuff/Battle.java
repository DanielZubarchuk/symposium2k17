package rhbattlesandstuff;

import java.util.ArrayList;

import guiTeacher.components.*;
import guiTeacher.userInterfaces.Screen;
import joeyDaniel.Floor;

public class Battle{

	private static Graphic hud;
	private TextArea movesMenu;
	private TextArea status;
	private TextArea inventory;
	private TextArea floor;
	
	private ArrayList<String> moves;
	
	//MR. NOCKLES FIELD
	static private ArrayList<BasicMonster> enemy = new ArrayList<BasicMonster>();
	static private Player player;
	static private boolean moveA;
	static private boolean moveMade;
	static private boolean computerTurn;
	static private ArrayList<BasicMonster> attackable = new ArrayList<BasicMonster>();
	

	public Battle() {
		
	}

	public static void battle(Player a, BasicMonster b){
		System.out.println("Player has " + a.getStats()[0] + " hp");
		System.out.println("Enemy has " + b.getStats()[0] + " hp");
		while ((a.getStats()[0] > 0 && b.getStats()[0] != 0) || (b.getStats()[0] > 0 && a.getStats()[0] != 0)){
			if (a.getStats()[3] > b.getStats()[3] && b.getStats()[0] > 0){
				dealDamageToEnemy(chooseMove(a),a,b);
				if (b.getStats()[0] > 0){
					dealDamageToPlayer(chooseMove(b),b,a);
				}
				else {
					break;
				}
			}
			else if (b.getStats()[3] > a.getStats()[3] && a.getStats()[0] > 0){
				dealDamageToPlayer(chooseMove(b),b,a);
				if (a.getStats()[0] > 0){
					dealDamageToEnemy(chooseMove(a),a,b);
				}
				else {
					break;
				}
			}
			else if(a.getStats()[3] == b.getStats()[3]){
				int rng = (int)Math.random() * 2 + 1;
				if(rng == 1){
					dealDamageToEnemy(chooseMove(a),a,b);
					if (b.getStats()[0] > 0){
						dealDamageToPlayer(chooseMove(b),b,a);
					}
					else {
						break;
					}
				}
				else {
					dealDamageToPlayer(chooseMove(b),b,a);
					if (a.getStats()[0] > 0){
						dealDamageToEnemy(chooseMove(a),a,b);
					}
					else {
						break;
					}
				}
			}
			else if((a.getStats()[0] > 0 && b.getStats()[0] <= 0) || (b.getStats()[0] > 0 && a.getStats()[0] <= 0)){
				break;
			}
		}
		outcome(a,b);
	}

	public static void outcome(Player a, BasicMonster b) {		
		if(a.getStats()[0] > 0 && b.getStats()[0] <= 0){
			System.out.println("You've won!");
		}
		else{
			System.out.println("You're fucking trash");
		}
	}

	public static void dealDamageToEnemy(Moves m, Player a, BasicMonster b) {
		System.out.println("Javaman used " + "bodied" + "!");
		b.getStats()[0] -= 3;
		System.out.println("Enemy has " + b.getStats()[0] + " hp left");
	}

	public static void dealDamageToPlayer(Moves m, BasicMonster a, Player b) {
		System.out.println("Enemy used "  + "tackle" + "!");
		b.getStats()[0] -= 3;
		System.out.println("Javaman has " + b.getStats()[0] + " hp left");
	}

	public static Moves chooseMove(Player n){
		return null;

	}

	public static Moves chooseMove(BasicMonster n){
		return n.getAttacks().get(0);
	}

	public static void engage(BasicMonster b){
		enemy.add(b);
		b.setInFight(true);
	}

	public static void disengage(BasicMonster b){
		
	}
	
	public static void setPlayer(Player a){
		player = a;
	}

	public static void doMoveA(){
		moveA = true;
	}
//??????
	public static void takeTurn(){
		computerTurn = true;
	}
	
	public static void runBattle() {
		if(enemy!= null){
			System.out.println(enemy.get(0));
			System.out.println("enemy is not null");
			while(enemyIsLeftAlive() && player.getStats()[0]>0){
				eachEnemyTakesTurn();
				
				computerTurn = false;
				while(!computerTurn){
					try {
						Thread.sleep(500);
						
					} catch (InterruptedException c) {
						// TODO Auto-generated catch block
						c.printStackTrace();
					}
					if(moveA){
						BasicMonster e = getEnemyInFrontOfPlayer();
						int hp = e.getStats()[0];
						e.getStats()[0] = hp - player.getStats()[1];
						System.out.println(e.getId() + " hp is equal to " + hp);
						System.out.println("YOOOOUU is tackling " + e.getId() + ". " + e.getId() + "'s health is equal to " + (hp - player.getStats()[1]) + ".");
						moveA = false;
					computerTurn = true;
					}
					else if(moveMade){
						BasicMonster e = getEnemyInFrontOfPlayer();
						int hp = e.getStats()[0];
						e.getStats()[0] = hp - player.getMoves().get(player.getThing()).getDmg();
						System.out.println(e.getId() + " hp is equal to " + hp);
						System.out.println("YOOOOUU is doing something to " + e.getId() + ". " + e.getId() + "'s health is equal to " + (hp - player.getMoves().get(player.getThing()).getDmg()) + ".");
						moveMade = false;
					computerTurn = true;
					}
				}
			}
			report();
			enemy.removeAll(enemy);
			
		}
		else if (enemy == null){
			System.out.println("Nothing is there");
			computerTurn = false;
			while(!computerTurn){
				try {
					Thread.sleep(500);
					
				} catch (InterruptedException c) {
					// TODO Auto-generated catch block
					c.printStackTrace();
				}
				if(moveA){
					System.out.println("You attacked nothing");
					moveA = false;
					computerTurn = true;
				}
				else if(moveMade){
					System.out.println("You attacked nothing");
					moveMade = false;
					computerTurn = true;
				}
			}
		}
	}
	
	private static void report() {
		for (BasicMonster e : enemy){
			System.out.println(e.getId() + "'s hp is " + e.getStats()[0]);
			
		}
		
	}

	//TEST METHOD
	private static BasicMonster getEnemyInFrontOfPlayer() {
		for (BasicMonster e : enemy){
			if (e.getStats()[0] > 0){
				return e;
			}
			
		}
		return null;
	}

	private static void eachEnemyTakesTurn() {
		for(BasicMonster e: enemy){
			if (e.getStats()[0] > 0){
				System.out.println(e.getId() + " is DOOING THIIIIINGS!");
			}
			else {
				System.out.println(e.getId() + " is ded");
				
			}
		}
		
	}

	private static boolean enemyIsLeftAlive() {
		for (BasicMonster e : enemy){
			if (e.getStats()[0] > 0){
				return true;
			}
			
		}
		enemy.removeAll(enemy);
		return false;
	}

	public static void doTheMove() {
		moveMade = true;
		
	}
	
	public static void chooseEnemy() {
		
	}

	public static void setCurretLayout(Graphic[][] sprites) {
		// TODO Auto-generated method stub
		
	}
	
//	public ArrayList<BasicMonster> checkEnemy(){
//		int[][] check = new int[3][3];
//		int[] pos;
//		pos = player.getLocation();
//		for (int i = (pos[0] - 1); i < (pos[0] + 1); i++ ){
//			for (int j = (pos[1] - 1); j < (pos[1] + 1); j++){
//				for (BasicMonster e: enemy){
//					if ((e.getLocation()[0] == i) && (e.getLocation()[1] == j)){
//						
//					}
//				}
//			}
//		}
//		return attackable;
//	}

}