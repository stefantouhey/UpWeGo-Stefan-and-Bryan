package upwego;

import jgame.ButtonState;
import jgame.GButton;
import jgame.GSprite;
import jgame.ImageCache;

public class StartButton extends GButton {

	public StartButton() {
		setSize(207, 130);
		GSprite sNone = ImageCache.getSprite("play_button.png");
		GSprite sHover = ImageCache.getSprite("play_button.png");
		GSprite sPressed = ImageCache.getSprite("play_button.png");

		setStateSprite(ButtonState.NONE, sNone);
		setStateSprite(ButtonState.HOVERED, sHover);
		setStateSprite(ButtonState.PRESSED, sPressed);

		// GSprite sIcon = new GSprite(image);
		// addAtCenter(sIcon);

	}
}
