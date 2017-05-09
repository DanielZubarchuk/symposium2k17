package rhbattlesandstuff;

import java.util.ArrayList;

public class Player {
	private int[] stats;
	private ArrayList<String> attacks;
	private String name;
	private ArrayList<String> items;
	
	public Player(int[] stats, ArrayList<String> attacks, String name, ArrayList<String> items){
		this.stats = stats;
		this.attacks = attacks;
		this.name = name;
		this.items = items;
	}

	public int[] getStats() {
		return stats;
	}

	public void setStats(int[] stats) {
		this.stats = stats;
	}

	public ArrayList<String> getAttacks() {
		return attacks;
	}

	public void setAttacks(ArrayList<String> attacks) {
		this.attacks = attacks;
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getItems() {
		return items;
	}
}
