package rhbattlesandstuff;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.ClickableScreen;
import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Visible;

public class PressAnyWhereToContinueScreen extends ClickableScreen implements MouseMotionListener, MouseListener{

	private ClickableGraphic bsod;
	private Player b = new Character();
	private int[] test = b.getStats(); 
	
	public PressAnyWhereToContinueScreen(int width, int height) {
		
		super(width, height);
	}
	
	

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseClicked(MouseEvent e){
		System.out.println("click");
		if(bsod.isHovered(e.getX(), e.getY())){
			bsod.act();
		  }
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		bsod = new ClickableGraphic(0,0,"src/resources/bluescreenofdeath.png");
		bsod.setAction(new Action(){
			public void act(){
				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.cyocawScreen);
			}
		});
		viewObjects.add(bsod);
		// TODO Auto-generated method stub

	}
	
	@Override
	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub\
		if(k.getKeyCode() == KeyEvent.VK_0){
			System.out.println(test[0]);
			b.incrementStats();
//			b.setAttacks(testing);
			b.addAttacks();
			System.out.println(b.getMoves().get(0).getDmg());
		}
		else {
			NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.cyocawScreen);
		}
	}
}
