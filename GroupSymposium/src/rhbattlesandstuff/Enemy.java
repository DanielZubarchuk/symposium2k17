package rhbattlesandstuff;

import java.util.ArrayList;

public interface Enemy {
	
	public int[] getStats();
	
	public ArrayList<String> getAttacks();

	public String getName();

	public ArrayList<String> getItems();
}
