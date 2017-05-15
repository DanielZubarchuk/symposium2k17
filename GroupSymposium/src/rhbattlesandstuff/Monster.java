package rhbattlesandstuff;

import java.util.ArrayList;

public class Monster implements Enemy{

	private int[] stats = {4, 1, 1, 1, 1};
	private String slime;
	private ArrayList<Moves> monMoves;
	
	
	public Monster() {
		monMoves = new ArrayList<Moves>();
	}

	@Override
	public int[] getStats() {
		// TODO Auto-generated method stub
		return stats;
	}

	@Override
	public ArrayList<Moves> getAttacks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
