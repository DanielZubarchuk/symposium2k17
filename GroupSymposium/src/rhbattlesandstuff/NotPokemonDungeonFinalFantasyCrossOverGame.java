package rhbattlesandstuff;

import guiTeacher.GUIApplication;
import guiTeacher.components.Graphic;
import guiTeacher.userInterfaces.Screen;
import joeyDaniel.Floor;
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
	//monster
	//http://spritedatabase.net/game/2306
	//hero
	//http://spritedatabase.net/game/2209
	//http://spritedatabase.net/game/11
	//http://spritedatabase.net/file/11749

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
		pmdffcog = new NotPokemonDungeonFinalFantasyCrossOverGame(716,938);
		pmdffcog.setVisible(true);
		Thread app = new Thread(pmdffcog);
		app.start();
	}
	public Screen getScreen(){
		return currentScreen;
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
		patcScreen = new PressAnyWhereToContinueScreen(716,938);
		gssScreen = new GenderScreenStuff(716,938);
		cnssScreen = new CreateNameScreenStuff(716,938);
		sjsmScreen = new SelectJobStuffMale(716,938);
		sjsfScreen = new SelectJobStuffFemale(716,938);
		setScreen(patcScreen);

	}

}
