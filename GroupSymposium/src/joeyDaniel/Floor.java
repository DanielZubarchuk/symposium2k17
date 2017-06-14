package joeyDaniel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import guiTeacher.components.Graphic;
import guiTeacher.userInterfaces.FullFunctionScreen;
import rhbattlesandstuff.Character;

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
	
	

	public abstract void moveCharacter(String direction);
	public abstract void monsterMove();
	public abstract void setChar(Character x);

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

}
