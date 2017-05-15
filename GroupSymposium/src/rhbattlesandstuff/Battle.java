package rhbattlesandstuff;

import java.util.ArrayList;

public class Battle extends Character{
	
	private ArrayList<String> moves;
	
	public Battle() {
		
	}
	
	public void battle(Player a, Enemy b){
		while (a.getStats()[0] > 0 || b.getStats()[0] > 0){
			if (a.getStats()[3] > b.getStats()[3]){
				dealDamage(chooseMove(a),a,b);
				if (b.getStats()[0] > 0){
					dealDamage(chooseMove(b),b,a);
				}
			}
			else if (b.getStats()[3] > a.getStats()[3]){
				dealDamage(chooseMove(b),b,a);
				if (a.getStats()[0] > 0){
					dealDamage(chooseMove(a),a,b);
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
	
	public void gameOver() {
		
		
	}
	
	public void outcome() {
		// TODO Auto-generated method stub
		
	}

	public void dealDamage(Moves m, Player a, Enemy b) {
		
	}
	
	public void dealDamage(Moves m, Enemy a, Player b) {
		// TODO Auto-generated method stub
		
	}

	public Moves chooseMove(Player n){
		return null;
		
	}
	
	public Moves chooseMove(Enemy n){
		return n.getAttacks().get((int) ((Math.random() * 2) + 1));
	}

}
