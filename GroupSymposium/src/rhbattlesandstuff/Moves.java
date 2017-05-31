package rhbattlesandstuff;

public class Moves {

	private String s;
	private int dmg;
	private String desc;
	
	public Moves(String s, int dmg) {
		// TODO Auto-generated constructor stub
		this.s = s;
		this.dmg = dmg;
	}

	public String getAttName() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

}
