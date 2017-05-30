package rhbattlesandstuff;

import guiTeacher.GUIApplication;

public class NotPokemonDungeonFinalFantasyCrossOverGame extends GUIApplication{

	public NotPokemonDungeonFinalFantasyCrossOverGame(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public static NotPokemonDungeonFinalFantasyCrossOverGame pmdffcog;
	public static PressAnyWhereToContinueScreen patcScreen;
	public static CreateNameScreenStuff cnssScreen;
	public static GenderScreenStuff gssScreen;
	public static SelectJobStuffMale sjsmScreen;
	public static SelectJobStuffFemale sjsfScreen;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pmdffcog = new NotPokemonDungeonFinalFantasyCrossOverGame(1100,700);
		pmdffcog.setVisible(true);
		Thread app = new Thread(pmdffcog);
		app.start();
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		patcScreen = new PressAnyWhereToContinueScreen(1100, 700);
		gssScreen = new GenderScreenStuff(1100,700);
		cnssScreen = new CreateNameScreenStuff(1100,700);
		sjsmScreen = new SelectJobStuffMale(1100, 700);
		sjsfScreen = new SelectJobStuffFemale(1100, 700);
		setScreen(patcScreen);
	}

}
