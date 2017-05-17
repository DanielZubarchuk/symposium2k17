package joeyDaniel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Visible;

public abstract class Floor extends Screen implements KeyListener{
	//	left = 37
	//	up = 38
	//	right = 39
	//	down = 40

	public Floor() {
		super(716,738);
	}

	@Override
	public void keyPressed(KeyEvent b) {
		// TODO Auto-generated method stub
		if(b.getKeyCode() == 38){
//			System.out.println("Up");
			if(Map.x.getLocation()[0]-->=3){
				Map.x.setLocation(Map.x.getLocation()[0]--, Map.x.getLocation()[1]);
			}
			
			
			
		}else if(b.getKeyCode() == 40){
//			System.out.println("Down");
			if(Map.x.getLocation()[0]++>=3){
				Map.x.setLocation(Map.x.getLocation()[0]--, Map.x.getLocation()[1]);
			}
			
			
		}else if(b.getKeyCode() == 37){
//			System.out.println("Left");
			
			
			
		}else if(b.getKeyCode() == 39){
//			System.out.println("Right");
			
			
			
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	public KeyListener getKeyListener(){
		return this;
	}

}
