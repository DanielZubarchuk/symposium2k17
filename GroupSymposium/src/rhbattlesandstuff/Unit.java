package rhbattlesandstuff;

public class Unit extends Character{
	
	public Unit() {
		
	}
	
	public void battle(Player a, Enemy b){
		while (a[0] > 0 || b[0] > 0){
			if (a[3] > b[3]){
				dealDamage(chooseMove(a),a,b);
				if (b[0] > 0){
					dealDamage(chooseMove(b),b,a);
				}
			}
			else if (b[3] > a[3]){
				dealDamage(chooseMove(b),b,a);
				if (a[0] > 0){
					dealDamage(chooseMove(a),a,b);
				}
			}	
		}
		if (a[0] != 0){
			outcome();
		}
		else {
			gameOver();
		}
	}
	
	public void gameOver() {
		
		
	}

	public String getName(){
		return name;
	}
	
	public void outcome() {
		// TODO Auto-generated method stub
		
	}

	public void dealDamage(String string, Player a, Enemy b) {
		// TODO Auto-generated method stub
		
	}
	
	public void dealDamage(String string, Enemy a, Player b) {
		// TODO Auto-generated method stub
		
	}

	public String chooseMove(Player n){
		return null;
		
	}
	
	public String chooseMove(Enemy n){
		return enemyMoveset.get((int)Math.random() * 4);
	}

}
