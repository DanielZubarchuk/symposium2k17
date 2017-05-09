package rhbattlesandstuff;

import java.util.ArrayList;

public interface Player {

	public int[] getStats();

	public void setStats(int[] stats);

	public ArrayList<String> getAttacks();

	public void setAttacks(ArrayList<String> attacks);

	public String getName();

	public ArrayList<String> getItems();
}
