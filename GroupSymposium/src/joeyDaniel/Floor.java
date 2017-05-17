package joeyDaniel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Visible;

public abstract class Floor extends Screen implements KeyListener{

	
	
	public Floor() {
		super(716,738);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Key Pressed");
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Key Released");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Key Typed");
	}
	
	public KeyListener getKeyListener(){
		return this;
	}

}
