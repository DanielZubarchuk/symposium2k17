package rhbattlesandstuff;

import guiTeacher.GUIApplication;
import joeyDaniel.Floor1;
import joeyDaniel.Floor2;
import joeyDaniel.Floor3;
import joeyDaniel.Floor4;
import joeyDaniel.Floor5;
import joeyDaniel.Floor6;
import joeyDaniel.Floor7;
import joeyDaniel.Game;

public class NotPokemonDungeonFinalFantasyCrossOverGame extends GUIApplication{

	public NotPokemonDungeonFinalFantasyCrossOverGame(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	public static Character x;
	public static Floor1 screen1;
	public static Floor2 screen2;
	public static Floor3 screen3;
	public static Floor4 screen4;
	public static Floor5 screen5;
	public static Floor6 screen6;
	public static Floor7 screen7;
	public static NotPokemonDungeonFinalFantasyCrossOverGame pmdffcog;
	public static PressAnyWhereToContinueScreen patcScreen;
	public static CreateNameScreenStuff cnssScreen;
	public static GenderScreenStuff gssScreen;
	public static SelectJobStuffMale sjsmScreen;
	public static SelectJobStuffFemale sjsfScreen;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pmdffcog = new NotPokemonDungeonFinalFantasyCrossOverGame(716,738);
		pmdffcog.setVisible(true);
		Thread app = new Thread(pmdffcog);
		app.start();
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		screen1 = new Floor1();
		screen2 = new Floor2();
		screen3 = new Floor3();
		screen4 = new Floor4();
		screen5 = new Floor5();
		screen6 = new Floor6();
		screen7 = new Floor7();
		patcScreen = new PressAnyWhereToContinueScreen(1100, 700);
		gssScreen = new GenderScreenStuff(1100,700);
		cnssScreen = new CreateNameScreenStuff(1100,700);
		sjsmScreen = new SelectJobStuffMale(1100, 700);
		sjsfScreen = new SelectJobStuffFemale(1100, 700);
		setScreen(patcScreen);
	}

}
