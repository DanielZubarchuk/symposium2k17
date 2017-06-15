package rhbattlesandstuff;

public class Slime extends Monster {
	
	private static boolean status = true;

	public Slime() {
		super(1.96078431372549, "src/resources/Monster/slimeSingle.png");
		// TODO Auto-generated constructor stub
		setStatus(true);
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
