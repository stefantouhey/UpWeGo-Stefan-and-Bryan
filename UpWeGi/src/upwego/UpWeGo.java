  package upwego;

import java.awt.Color;

import jgame.GRootContainer;
import jgame.Game;
import jgame.ImageCache;
import jgame.SoundManager;
 
public class UpWeGo extends Game {

	public static void main(String[] args) {

		UpWeGo TDGame = new UpWeGo();
		TDGame.startGame("UpWeGo");

	}

	public UpWeGo() {
		ImageCache.create(UpWeGo.class, "/rsc/");
		SoundManager.create(UpWeGo.class, "/rsc/");

		GRootContainer root = new GRootContainer(Color.GREEN);
		setRootContainer(root);
		
		StartMenu startMenu = new StartMenu();
		root.addView(View.START, startMenu);
		
		GameView gameView = new GameView();
		root.addView(View.GAME, gameView);

		

	//	StartMenuAnimation startmenuAnimation = new StartMenuAnimation();
	//	root.addView(View.STARTANIM, startmenuAnimation);

		GameOverView gameOverView = new GameOverView();
		root.addView(View.GAME_OVER, gameOverView);
	}

	public enum View {
		START, STARTANIM, GAME, GAME_OVER;
	}
}
