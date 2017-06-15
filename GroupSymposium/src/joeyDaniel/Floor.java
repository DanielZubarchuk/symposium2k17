package joeyDaniel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import rhbattlesandstuff.BasicMonster;
import rhbattlesandstuff.Character;
import rhbattlesandstuff.Monster;

public abstract class Floor extends FullFunctionScreen implements KeyListener, Runnable{
	protected Character player;
	protected Graphic[][] layout;
	protected int[] playerCoordinate;
	//	left = 37
	//	up = 38
	//	right = 39
	//	down = 40
	private int up;
	private int right;

	public void setLayout(Graphic[][] layout){
		this.layout = layout;
	}

	public Graphic[][] getFloorLayout() {
		return layout;
	}

	public int[] getPlayerCoordinate() {
		return playerCoordinate;
	}

	public Floor() {
		super(716,738);
		Thread characterManager = new Thread(this);
		characterManager.start();
	}

	public void run(){
		while(true){
			try {
				Thread.sleep(150);
				if(up > 0){
					moveCharacter("up");
				}
				if(up < 0){
					moveCharacter("down");
				}
				if(right > 0){
					moveCharacter("right");
				}
				if(right < 0){
					moveCharacter("left");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void keyPressed(KeyEvent b) {
		// TODO Auto-generated method stub
		if(b.getKeyCode() == 38){
			//			System.out.println("Up");
			//			moveCharacter("up");
			up = 1;



		}else if(b.getKeyCode() == 40){
			//			System.out.println("Down");
			//			moveCharacter("down");
			up = -1;


		}else if(b.getKeyCode() == 37){
			//			System.out.println("Left");
			//			moveCharacter("left");
			right = -1;


		}else if(b.getKeyCode() == 39){
			//			System.out.println("Right");
			//			moveCharacter("right");
			right = 1;


		}
	}

	public void monsterMove() {
		// TODO Auto-generated method stub
		for(int row = 0; row<layout.length; row++){
			for(int col = 0; col<layout[row].length; col++){
				if(layout[row][col] instanceof BasicMonster){
					Monster m = (Monster) layout[row][col];
					if(m.isDead == true){

					}
					else{
						if(nextToPlayer(row,col)){
							//						
						}else
							if(((Monster)layout[row][col]).canMove){
								if(playerCoordinate[0] < row){
									if(!(layout[row-1][col] instanceof Obstruction || layout[row-1][col] instanceof Staircase)){
										((Monster)layout[row][col]).canMove = false;
										layout[row-1][col] = layout[row][col];
										layout[row][col] = null;
									}else if(playerCoordinate[1] < col){
										if(!(layout[row][col-1] instanceof Obstruction || layout[row][col-1] instanceof Staircase)){
											((Monster)layout[row][col]).canMove = false;
											layout[row][col-1] = layout[row][col];
											layout[row][col] = null;
										}
									}else if(playerCoordinate[1] > col){
										if(!(layout[row][col+1] instanceof Obstruction || layout[row][col+1] instanceof Staircase)){
											((Monster)layout[row][col]).canMove = false;
											layout[row][col+1] = layout[row][col];
											layout[row][col] = null;
										}
									}
								}else if(playerCoordinate[0] > row){
									if(!(layout[row+1][col] instanceof Obstruction || layout[row+1][col] instanceof Staircase)){
										((Monster)layout[row][col]).canMove = false;
										layout[row+1][col] = layout[row][col];
										layout[row][col] = null;
									}else if(playerCoordinate[1] < col){
										if(!(layout[row][col-1] instanceof Obstruction || layout[row][col-1] instanceof Staircase)){
											((Monster)layout[row][col]).canMove = false;
											layout[row][col-1] = layout[row][col];
											layout[row][col] = null;
										}
									}else if(playerCoordinate[1] > col){
										if(!(layout[row][col+1] instanceof Obstruction || layout[row][col+1] instanceof Staircase)){
											((Monster)layout[row][col]).canMove = false;
											layout[row][col+1] = layout[row][col];
											layout[row][col] = null;
										}
									}
								}else{
									if(playerCoordinate[1] < col){
										if(!(layout[row][col-1] instanceof Obstruction || layout[row][col-1] instanceof Staircase)){
											((Monster)layout[row][col]).canMove = false;
											layout[row][col-1] = layout[row][col];
											layout[row][col] = null;
										}
									}else if(playerCoordinate[1] > col){
										if(!(layout[row][col+1] instanceof Obstruction || layout[row][col+1] instanceof Staircase)){
											((Monster)layout[row][col]).canMove = false;
											layout[row][col+1] = layout[row][col];
											layout[row][col] = null;
										}
									}
								}
							}
					}
				}
			}
		}
		for(int row = 0; row<layout.length; row++){
			for(int col = 0; col<layout[row].length; col++){
				if(layout[row][col] instanceof BasicMonster){
					((Monster)layout[row][col]).canMove = true;
				}
			}
		}
	}


	private boolean nextToPlayer(int row, int col) {
		// TODO Auto-generated method stub
		if(playerCoordinate[0] == row && (playerCoordinate[1] == col-1 || playerCoordinate[1] == col+1)){
			return true;
		}
		if(playerCoordinate[1] == col && (playerCoordinate[0] == row-1 || playerCoordinate[0] == row+1)){
			return true;
		}
		return false;

	}
	public void setChar(Character x) {
		// TODO Auto-generated method stub
		player = x;
		getFloorLayout()[3][14] = player;
		updateScreen(viewObjects);
		update();
	}


	public abstract void moveCharacter(String direction);
	public abstract void updateScreen(List<Visible> viewObjects);

	@Override
	public void keyReleased(KeyEvent b) {
		if(b.getKeyCode() == 37 || b.getKeyCode() == 39){
			right = 0;
		}
		if(b.getKeyCode() == 38 || b.getKeyCode() == 40){
			up = 0;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	public KeyListener getKeyListener(){
		return this;
	}

	public void removeMonster( Monster m, int i, int j) {
		// TODO Auto-generated method stub

	}

}
