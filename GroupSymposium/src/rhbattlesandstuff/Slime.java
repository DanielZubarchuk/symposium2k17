package rhbattlesandstuff;

public class Slime extends Monster {

	public Slime() {
		super(1.96078431372549, "src/resources/Monster/slimeSingle.png");
		int x = (int)(Math.random()*5);
		if(x==1){
			setImage(1.96078431372549, "src/resources/Monster/slimeSingleblue.png");
		}else if(x ==2){
			setImage(1.96078431372549, "src/resources/Monster/slimeSinglegold.png");
		}else if(x ==3){
			setImage(1.96078431372549, "src/resources/Monster/slimeSinglered.png");
		}else if(x ==4){
			setImage(1.96078431372549, "src/resources/Monster/slimeSinglesky.png");
		}
	}
}
