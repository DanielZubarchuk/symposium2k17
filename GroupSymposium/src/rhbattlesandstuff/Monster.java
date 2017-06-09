package rhbattlesandstuff;

import java.util.ArrayList;

import guiTeacher.components.Graphic;

public class Monster extends Graphic implements BasicMonster{

	private int[] stats = {4, 1, 1, 1};
	private String name = "slime";
	private ArrayList<Moves> monMoves;
	private ArrayList<Items> items;
	private int currentFloor = 1;
	private String id;//id helps differentiate monster
	private int[] position;
	private int monNum = 0;
	ArrayList<BasicMonster> enemy = new ArrayList<BasicMonster>();
	
	//x,y
	//slime:
	//50,35 IDLE (ROW 1)
	//50,35 MOVE (ROW 2)
	//70,50 ATTACK (ROW 3)
	//50,50 DEATH (ROW 4)
	//headlessknight
	//118,100 IDLE (ROW 1)
	//118,100 MOVE (ROW 2)
	//,86
	
	public Monster(double scale, String image) {
		super(0, 0, scale, image);
		monMoves = new ArrayList<Moves>();
	}

	@Override
	public int[] getStats() {
		// TODO Auto-generated method stub
		return stats;
	}

	public void setStats(int[] stats) {
		this.stats = stats;
	}
	
	public void scaleWFloor() {
		//getFloor()
//		for (int i = 1; i <= getFloor; i++){
//			stats[0] += (int)((Math.random() * 7) + 1);
//			stats[1] += (int)((Math.random() * 3) + 1);
//			stats[2] += (int)((Math.random() * 3) + 1);
//			stats[3] ++;
//		}
		if(currentFloor == 2){
			for (int i = 0; i < 4; i++){
				stats[0] += (int)((Math.random() * 7) + 1);
				stats[1] += (int)((Math.random() * 3) + 1);
				stats[2] += (int)((Math.random() * 3) + 1);
				stats[3] ++;
			}
		}
		if(currentFloor == 3){
			for (int i = 0; i < 4; i++){
				stats[0] += (int)((Math.random() * 7) + 1);
				stats[1] += (int)((Math.random() * 3) + 1);
				stats[2] += (int)((Math.random() * 3) + 1);
				stats[3] ++;
			}
		}
		if(currentFloor == 4){
			for (int i = 0; i < 4; i++){
				stats[0] += (int)((Math.random() * 7) + 1);
				stats[1] += (int)((Math.random() * 3) + 1);
				stats[2] += (int)((Math.random() * 3) + 1);
				stats[3] ++;
			}
		}
		if(currentFloor == 5){
			for (int i = 0; i < 4; i++){
				stats[0] += (int)((Math.random() * 7) + 1);
				stats[1] += (int)((Math.random() * 3) + 1);
				stats[2] += (int)((Math.random() * 3) + 1);
				stats[3] ++;
			}
		}
		if(currentFloor == 6){
			for (int i = 0; i < 4; i++){
				stats[0] += (int)((Math.random() * 7) + 1);
				stats[1] += (int)((Math.random() * 3) + 1);
				stats[2] += (int)((Math.random() * 3) + 1);
				stats[3] ++;
			}
		}
		if(currentFloor == 7){
			for (int i = 0; i < 4; i++){
				stats[0] += (int)((Math.random() * 7) + 1);
				stats[1] += (int)((Math.random() * 3) + 1);
				stats[2] += (int)((Math.random() * 3) + 1);
				stats[3] ++;
			}
		}
	}
	
	@Override
	public ArrayList<Moves> getAttacks() {
		// TODO Auto-generated method stub
		return monMoves;
	}

	public void setAttacks(ArrayList<Moves> attacks) {
		monMoves.add(new Moves("tackle", 3));
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public String getAttName() {
		return null;
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

	@Override
	public void setId(String string) {
		id = string;
		
	}

	@Override
	public String getId() {
		return id;
	}

	public int[] getLocation() {
		return position;
	}
	
	public int getMonNum(){
		return monNum;
	}
	
	public void setMonNum(int monNum){
		this.monNum = monNum;
	}
	
	public ArrayList<BasicMonster> getEnemy(){
		return enemy;
	}
	
	public void setEnemy(ArrayList<BasicMonster> enemy){
		this.enemy = enemy;
	}
	
}
