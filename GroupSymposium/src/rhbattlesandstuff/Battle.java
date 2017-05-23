package rhbattlesandstuff;

import java.util.ArrayList;

import guiPractice.components.Graphic;
import guiPractice.components.Visible;
import guiPractice.sampleGames.TextArea;

public class Battle{

	private static Graphic hud;
	private TextArea movesMenu;
	private TextArea status;
	private TextArea inventory;
	private TextArea floor;
	
	private ArrayList<String> moves;
	
	

	public Battle() {

	}

	public static void battle(Player a, Enemy b){
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

	public static void outcome(Player a, Enemy b) {		
		if(a.getStats()[0] > 0 && b.getStats()[0] <= 0){
			System.out.println("You've won!");
		}
		else{
			System.out.println("You're fucking trash");
		}
	}

	public static void dealDamageToEnemy(Moves m, Player a, Enemy b) {
		System.out.println("Javaman used " + "bodied" + "!");
		b.getStats()[0] -= 3;
		System.out.println("Enemy has " + b.getStats()[0] + " hp left");
	}

	public static void dealDamageToPlayer(Moves m, Enemy a, Player b) {
		System.out.println("Enemy used "  + "tackle" + "!");
		b.getStats()[0] -= 3;
		System.out.println("Javaman has " + b.getStats()[0] + " hp left");
	}

	public static Moves chooseMove(Player n){
		return null;

	}

	public static Moves chooseMove(Enemy n){
		return n.getAttacks().get(0);
	}

	//MR. NOCKLES FIELD
	static private Enemy enemy;
	static private Player player;
	static private boolean moveA;
	static private boolean computerTurn;

	public static void engage(Enemy b){
		enemy = b;
	}

	public static void setPlayer(Player a){
		player = a;
	}

	public static void doMoveA(){
		moveA = true;
	}

	public static void takeTurn(){
		computerTurn = true;
	}
	
	public static void runBattle() {
		if(enemy!= null){
			System.out.println("enemy is not null");
			while(enemy.getStats()[0] >0 && player.getStats()[0]>0){
				System.out.println("Enemy is DOOING THIIIIINGS!");
				computerTurn = false;
				while(!computerTurn){
					try {
						Thread.sleep(500);
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Computer is waiting for its turn.");
					if(moveA){
						System.out.println("YOOOOUU is DOOING THIIIIINGS!");
						moveA = false;
					computerTurn = true;
					}
				}
			}
			enemy = null;
		}
	}

}
