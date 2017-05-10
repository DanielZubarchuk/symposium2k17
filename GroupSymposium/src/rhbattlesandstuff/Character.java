package rhbattlesandstuff;

import java.util.ArrayList;

public class Character implements Player, Enemy{

	private int[] stats = {10, 2, 1, 2, 1};
	private String name = "Javaman";
	
	public Character() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int[] getStats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStats(int[] stats) {
		//HP, Attack, Defense, Speed, Level
		
		//base stats
			//HP = 10 
			//Attack = 2
			//Defense = 1
			//Speed = 2
			//Level = 1
		stats[0] += (int)(Math.random() * 10) + 1;
		stats[1] += (int)(Math.random() * 3) + 1;
		stats[2] += (int)(Math.random() * 3) + 1;
		stats[3] += (int)(Math.random() * 2) + 1;
				
		//upon level up
		//gains random stats
		
		//HP gain =  (int)(Math.random() * 10)  + 1
		//Attack gain - (int)(Math.random() * 3) + 1
		//Defense = (int)(Math.random() * 3) + 1
		//Speed = (int)(Math.random() * 2) + 1
		//Level++
		
		
	}

	@Override
	public ArrayList<String> getAttacks() {
		// TODO Auto-generated method stub
		//bodied
		return null;
	}

	@Override
	public void setAttacks(ArrayList<String> attacks) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	@Override
	public ArrayList<String> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
