package upwego;

import jgame.Context;
import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.ButtonListener;


public class StartMenu extends GContainer {
	public StartMenu() {
		super(new GSprite(ImageCache.forClass(UpWeGo.class).get(
				"StartMenu.png")));
		
		final StartButton start = new StartButton();
		addAtCenter(start);

		start.addListener(new ButtonListener() {
			@Override
			public void mouseDown(Context context) {
				//context.setCurrentGameView(MalwareTD.View.STARTANIM);
				 context.setCurrentGameView(UpWeGo.View.GAME);
			}
		});
	}

}
