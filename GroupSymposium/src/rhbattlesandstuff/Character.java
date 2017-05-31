package rhbattlesandstuff;

import java.util.ArrayList;
import java.util.Arrays;

import guiTeacher.components.*;

public class Character extends Graphic implements Player{

	private int[] stats = {10, 2, 1, 1};
	private String gender;
	private String name = "Javaman";
	private ArrayList<Moves> moves; 
	private int[] location;
	private int thing = 0;
	
	public Character(){
		super(0,0,0.1182033096926714,"src/resources/char.png");
		moves = new ArrayList<Moves>();
		location = new int[2];
	}

	public void setLocation(int row, int col){
		location[0] = row;
		location[1] = col;
	}
	
	public int[] getLocation(){
		return location;
	}

	public ArrayList<Moves> getMoves(){
		return moves;
	}
	
	@Override
	public int[] getStats() {
		// TODO Auto-generated method stub
		return stats;
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
//		stats[0] += (int)(Math.random() * 10) + 1;
//		stats[1] += (int)(Math.random() * 3) + 1;
//		stats[2] += (int)(Math.random() * 3) + 1;
//		stats[3] += (int)(Math.random() * 2) + 1;
				
		//upon level up
		//gains random stats
		
		//HP gain =  (int)(Math.random() * 10)  + 1
		//Attack gain - (int)(Math.random() * 3) + 1
		//Defense = (int)(Math.random() * 3) + 1
		//Speed = (int)(Math.random() * 2) + 1
		//Level++
		this.stats = stats;
	}

	public void incrementStats(){
		stats[0] += (int)(Math.random() * 10) + 1;
		stats[1] += (int)(Math.random() * 3) + 1;
		stats[2] += (int)(Math.random() * 3) + 1;
		stats[3] ++;
		
	}
	
	public void addAttacks(String name, int dmg){
		if(moves.size() == 4){
			System.out.println("TOO MANY ATTACKS. NO MORE ADDING");
		}
		else{
			moves.add(new Moves(name, dmg));
		}
	}
	@Override
	public ArrayList<Moves> getAttacks() {
		// TODO Auto-generated method stub
		//bodied
		return moves;
	}

	@Override
	public void setAttacks(ArrayList<Moves> attacks) {
		// TODO Auto-generated method stub
		//bodied
		
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

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getLevel() {
		return stats[4];
	}

	public int getThing(){
		return thing;
	}
	
	public void setThing(int thing){
		this.thing = thing;
	}

}
