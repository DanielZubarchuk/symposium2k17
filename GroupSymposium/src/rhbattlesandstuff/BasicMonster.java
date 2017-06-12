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

	public int getMonNum();
	
	public void setMonNum(int monNum);

	public ArrayList<BasicMonster> getEnemy();
	
	public void setEnemy(ArrayList<BasicMonster> enemy);
	
	public int[] getLocation();
	

	public boolean isInFight();


	public void setInFight(boolean inFight);
}
