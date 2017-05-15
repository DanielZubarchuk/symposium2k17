package rhbattlesandstuff;

import java.util.ArrayList;

public class Monster implements Enemy{

	private int[] stats = {4, 1, 1, 1, 1};
	private String name = "slime";
	private ArrayList<Moves> monMoves;
	private ArrayList<Items> items;
	private int getFloor = 2;
	
	public Monster() {
		monMoves = new ArrayList<Moves>();
	}

	@Override
	public int[] getStats() {
		// TODO Auto-generated method stub
		return stats;
	}

	public void setStats() {
		
	}
	
	public void scaleWFloor() {
		//getFloor()
		for (int i = 1; i <= getFloor; i++){
			stats[0] += (int)((Math.random() * 7) + 1);
			stats[1] += (int)((Math.random() * 3) + 1);
			stats[2] += (int)((Math.random() * 3) + 1);
			stats[3] += (int)((Math.random() * 2) + 1);
			stats[4] ++;
		}
	}
	
	@Override
	public ArrayList<Moves> getAttacks() {
		// TODO Auto-generated method stub
		return monMoves;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public ArrayList<Items> getItems() {
		// TODO Auto-generated method stub
		return items;
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
