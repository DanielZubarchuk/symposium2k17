package rhbattlesandstuff;

import guiPractice.GUIApplication;

public class NotPokemonDungeonFinalFantasyCrossOverGame extends GUIApplication{

	public static NotPokemonDungeonFinalFantasyCrossOverGame pmdffcog;
	public static PressAnyWhereToContinueScreen patcScreen;
	public static GenderScreenStuff cyocawScreen;
	public static CreateNameScreenStuff cnssScreen;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pmdffcog = new NotPokemonDungeonFinalFantasyCrossOverGame();
		Thread app = new Thread(pmdffcog);
		app.start();
	}

	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		patcScreen = new PressAnyWhereToContinueScreen(1100, 700);
		cyocawScreen = new GenderScreenStuff(1100,700);
		cnssScreen = new CreateNameScreenStuff(1100,700);
		setScreen(patcScreen);
	}

}
