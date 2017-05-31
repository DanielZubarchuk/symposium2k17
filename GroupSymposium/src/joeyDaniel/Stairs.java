package joeyDaniel;

import guiTeacher.components.Graphic;

public class Stairs extends Graphic implements Staircase{

	public Stairs(int x, int y) {
		super(x, y,.125 ,"src/resources/stair.png");
		// TODO Auto-generated constructor stub
	}

	public Stairs() {
		super(0, 0, .125 ,"src/resources/stair.png");
		// TODO Auto-generated constructor stub
	}
}
