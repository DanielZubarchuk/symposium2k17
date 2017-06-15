package rhbattlesandstuff;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import guiTeacher.userInterfaces.Screen;
import joeyDaniel.Floor;
import joeyDaniel.Game;

public class SelectJobStuffMale extends FullFunctionScreen {

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
	
	public SelectJobStuffMale(int width, int height) {
		// TODO Auto-generated constructor stub
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		warrior = new ClickableGraphic(20,20,.25,"src/resources/warrior.png");
		warrior.setAction(new Action(){
			public void act(){
				
			}
		});
		mage = new ClickableGraphic(250,20,.25,"src/resources/mage.png");
		mage.setAction(new Action(){
			public void act(){
				
			}
		});
		
		rogue = new ClickableGraphic(480,20,.25,"src/resources/rogue.png");
		rogue.setAction(new Action(){
			public void act(){
				
			}
		});
		
//		box = new Graphic(50,500,"");
		
		confirm = new Button(600,600,100,50,"Confirm", Color.BLUE, new Action(){
			public void act(){
			//	showBox(viewObjects);
//				System.out.println(CreateNameScreenStuff.realPlayer.getName());
				if(selection == false){
					
				}
				if(selection == true){
					if(select == 0){
						CreateNameScreenStuff.realPlayer.setImage(.5,"src/resources/Character/warriorMale.png");		
						System.out.println("setting image");
					}
					if(select == 1){
						CreateNameScreenStuff.realPlayer.setImage(.125,"src/resources/mage.png");		
						System.out.println("setting image");
					}
					if(select == 2){
						CreateNameScreenStuff.realPlayer.setImage(.5,"src/resources/Character/rogueMale.png");		
						System.out.println("setting image");
					}
					NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.setScreen(NotPokemonDungeonFinalFantasyCrossOverGame.screen1);
					NotPokemonDungeonFinalFantasyCrossOverGame.screen1.setChar((Character) CreateNameScreenStuff.realPlayer);
					Thread checkForFight = new Thread(new Runnable() {
						
						@Override
						public void run() {
							Battle.setPlayer(CreateNameScreenStuff.realPlayer);
							while(true){
								try {
									Thread.sleep(100);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								Screen currentScreen = NotPokemonDungeonFinalFantasyCrossOverGame.pmdffcog.getScreen(); 
								if(currentScreen instanceof Floor){
									Floor currentFloor = (Floor)currentScreen;
									Graphic[][] sprites = currentFloor.getFloorLayout();
									Battle.setCurretLayout(sprites);
									while(currentFloor == currentScreen){
										try {
											Thread.sleep(100);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										int[] playerCoordiantes = currentFloor.getPlayerCoordinate();
										int r = playerCoordiantes[0];
										int c = playerCoordiantes[1];
										for(int i=r-1; i < r+2; i++){
											for(int j = c-1; j<c+2; j++){
//											System.out.println("Is there a monster right next to you at this very instant?");
//											if (!(sprites[i][j] instanceof Monster)){
//												System.out.println("No.");
//											}
												if(sprites[i][j] != null && sprites[i][j] instanceof Monster){
													Monster m = (Monster)sprites[i][j];
													if(!m.isInFight()){
														
														Battle.engage(m);
														Battle.runBattle();
														System.out.println("battle ended");
														currentFloor.removeMonster(m,i, j);
													}
													

													Battle.engage(m);
													Battle.runBattle();
													System.out.println("battle ended");
													System.out.println("You've gained 50 exp!");
													CreateNameScreenStuff.realPlayer.setStats(CreateNameScreenStuff.realPlayer.getStats(), 4, 50);
													System.out.println("You have " + CreateNameScreenStuff.realPlayer.getStats()[4] + " exp");
													if (((CreateNameScreenStuff.realPlayer.getStats()[4] % 100) == 0) && (CreateNameScreenStuff.realPlayer.getStats()[4] != 0)){
														System.out.println("You have leveled up!");
														CreateNameScreenStuff.realPlayer.incrementStats();
														System.out.println(CreateNameScreenStuff.realPlayer.getStats()[0]);
														System.out.println(CreateNameScreenStuff.realPlayer.getStats()[1]);
														System.out.println(CreateNameScreenStuff.realPlayer.getStats()[2]);
														System.out.println(CreateNameScreenStuff.realPlayer.getStats()[3]);
													}
													currentFloor.removeMonster(m,i, j);

												}
											}
										}
									}
								}
							}
						}
					});
					checkForFight.start();
				}
				}
		});
		
		confirmBox = new TextArea(100,500,500,100,"MALE");
		
		viewObjects.add(warrior);
		viewObjects.add(mage);
		viewObjects.add(rogue);
		
//		viewObjects.add(box);
		
		viewObjects.add(confirm);
		
		viewObjects.add(confirmBox);
		update();
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
			System.out.println(getName());
			CreateNameScreenStuff.realPlayer.setStats(allStats[select]);
			System.out.println("You have selected " + job[select] + ".");
			System.out.println(CreateNameScreenStuff.realPlayer.getName() + ", has this stats: " + Arrays.toString(CreateNameScreenStuff.realPlayer.getStats()));
		}
	}
	
//	public void showBox(List<Visible> viewObjects){
//		viewObjects.add(box);
//	}

}