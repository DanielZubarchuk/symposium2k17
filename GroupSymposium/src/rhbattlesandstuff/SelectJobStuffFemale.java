package rhbattlesandstuff;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class SelectJobStuffFemale extends FullFunctionScreen{

	private ClickableGraphic warrior;
	private ClickableGraphic mage;
	private ClickableGraphic rogue;
	private Graphic box;
	private Button confirm;
	private TextArea confirmBox;
	
	private Character a;
	
	private int[][] allStats = {{1, 1, 1, 1, 1},{2, 2, 2, 2, 2},{3, 3, 3, 3, 3}};
	private String[] job = {"warrior", "mage", "rogue"};
	private boolean selection;
	private int select = -1;
	
	public SelectJobStuffFemale(int width, int height) {
		// TODO Auto-generated constructor stub
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		warrior = new ClickableGraphic(20,20,.25,"src/resources/warrior2.png");
		warrior.setAction(new Action(){
			public void act(){
				
			}
		});
		mage = new ClickableGraphic(250,20,.25,"src/resources/mage2.png");
		mage.setAction(new Action(){
			public void act(){
				
			}
		});
		
		rogue = new ClickableGraphic(480,20,.25,"src/resources/rogue2.png");
		rogue.setAction(new Action(){
			public void act(){
				
			}
		});
		
//		box = new Graphic(50,500,"");
		
		confirm = new Button(600,600,100,50,"Confirm", Color.BLUE, new Action(){
			public void act(){
			//	showBox(viewObjects);
//				System.out.println(CreateNameScreenStuff.realPlayer.getName());
				NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen1);
			}
		});
		
		confirmBox = new TextArea(100,500,500,100,"FEMALE");
		
		viewObjects.add(warrior);
		viewObjects.add(mage);
		viewObjects.add(rogue);
		
//		viewObjects.add(box);
		
		viewObjects.add(confirm);
		
		viewObjects.add(confirmBox);
	}
	
	public void keyPressed(KeyEvent k) {
		if (k.getKeyCode() == KeyEvent.VK_LEFT ){
			System.out.println("LEFT");
			select = 0;
			selection = true;
		}
		else if(k.getKeyCode() == KeyEvent.VK_DOWN){
			System.out.println("DOWN");
			select = 1;
			selection = true;
		}
		else if(k.getKeyCode() == KeyEvent.VK_RIGHT){
			System.out.println("RIGHT");
			select = 2;
			selection = true;
		}
		if(selection && k.getKeyCode() == KeyEvent.VK_Z){
			//The following line does't work
			System.out.println(getName());
			///////////////////////////////////////
			CreateNameScreenStuff.realPlayer.setStats(allStats[select]);
			System.out.println("You have selected " + job[select] + ".");
			System.out.println(CreateNameScreenStuff.realPlayer.getName() + ", has this stats: " + Arrays.toString(CreateNameScreenStuff.realPlayer.getStats()));
		}
	}

}
