package joeyDaniel;

import guiTeacher.GUIApplication;
import rhbattlesandstuff.Character;
import rhbattlesandstuff.CreateNameScreenStuff;
import rhbattlesandstuff.GenderScreenStuff;
import rhbattlesandstuff.SelectJobStuffFemale;
import rhbattlesandstuff.SelectJobStuffMale;

public class Game extends GUIApplication{
	
	public static Game game;
	public static Character x;
	public static Floor1 screen1;
	public static Floor2 screen2;
	public static Floor3 screen3;
	public static Floor4 screen4;
	public static Floor5 screen5;
	public static Floor6 screen6;
	public static Floor7 screen7;
	public static CreateNameScreenStuff createScreen;
	public static GenderScreenStuff gender;
	public static SelectJobStuffFemale female;
	public static SelectJobStuffMale male;
	
	public Game(){
		super(716, 738);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game = new Game();
		Thread app = new Thread(game);
		app.start();
		
	}
	
	
	
	@Override
	public void initScreen() {
		createScreen = new CreateNameScreenStuff(716,738);
		gender = new GenderScreenStuff(716, 738);
		female = new SelectJobStuffFemale(716, 738);
		male = new SelectJobStuffMale(716, 738);
		screen1 = new Floor1();
		screen2 = new Floor2();
		screen3 = new Floor3();
		screen4 = new Floor4();
		screen5 = new Floor5();
		screen6 = new Floor6();
		screen7 = new Floor7();
		setScreen(createScreen);
	}
	
	
	
	
	
}
