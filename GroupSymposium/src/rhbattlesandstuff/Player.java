package rhbattlesandstuff;

import java.util.ArrayList;

public interface Player {

	public int[] getStats();

	public void setStats(int[] stats);

	public ArrayList<Moves> getAttacks();

	public void setAttacks(ArrayList<Moves> attacks);

	public String getName();
	
	public void setName(String name);

	public ArrayList<String> getItems();
	
	public int getDamage();
	
	public String getDesc();

	public void incrementStats();

	public void addAttacks();
	
	public ArrayList<Moves> getMoves();
}
