package rhbattlesandstuff;

import java.util.ArrayList;

import joeyDaniel.Obstruction;

public interface BasicMonster extends Obstruction{
	
	public int[] getStats();
	
	public ArrayList<Moves> getAttacks();

	public String getName();

	public ArrayList<Items> getItems();
	
	public int getDamage();

	public void scaleWFloor();

	public void setAttacks(ArrayList<Moves> att);

	public void setStats(int[] stats);

	public void setId(String string);

	public String getId();
}