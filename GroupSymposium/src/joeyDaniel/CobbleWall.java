package joeyDaniel;

import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
public class CobbleWall extends Graphic implements Wall {

	public CobbleWall(int x, int y) {
		super(x, y, 0.1953125, "src/resources/dungeonwall.jpg");
		// TODO Auto-generated constructor stub
	}
	
	public CobbleWall() {
		super(0, 0, 0.1953125, "src/resources/dungeonwall.jpg");
		// TODO Auto-generated constructor stub
	}
}
