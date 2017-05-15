package joeyDaniel;

import guiPractice.components.Graphic;

public class CobbleWall extends Graphic implements Obstruction {

	public CobbleWall(int x, int y) {
		super(x, y, .5, "src/resources/cobble.jpg");
		// TODO Auto-generated constructor stub
	}
	
	public CobbleWall() {
		super(0, 0, .5, "src/resources/cobble.jpg");
		// TODO Auto-generated constructor stub
	}
}
