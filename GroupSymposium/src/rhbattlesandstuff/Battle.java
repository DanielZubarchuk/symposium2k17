package rhbattlesandstuff;

import java.util.ArrayList;

public class Battle extends Character{
	
	private ArrayList<String> moves;
	
	public Battle() {
		
	}
	
	public static void battle(Player a, Enemy b){
		while (a.getStats()[0] > 0 || b.getStats()[0] > 0){
			if (a.getStats()[3] > b.getStats()[3]){
				dealDamageToEnemy(chooseMove(a),a,b);
				if (b.getStats()[0] > 0){
					dealDamageToPlayer(chooseMove(b),b,a);
				}
			}
			else if (b.getStats()[3] > a.getStats()[3]){
				dealDamageToPlayer(chooseMove(b),b,a);
				if (a.getStats()[0] > 0){
					dealDamageToEnemy(chooseMove(a),a,b);
				}
			}	
		}
		if (a.getStats()[0] != 0){
			outcome();
		}
		else {
			gameOver();
		}
	}
	
	public static void gameOver() {
		
		
	}
	
	public static void outcome() {
		// TODO Auto-generated method stub
		
	}

	public static void dealDamageToEnemy(Moves m, Player a, Enemy b) {
		System.out.println("Javaman uses" + m.getAttName() + "!");
	}
	
	public static void dealDamageToPlayer(Moves m, Enemy a, Player b) {
		System.out.println("Enemy uses"  + m.getAttName() + "!");
	}

	public static Moves chooseMove(Player n){
		return null;
		
	}
	
	public static Moves chooseMove(Enemy n){
		return n.getAttacks().get(0);
	}

}
