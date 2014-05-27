package upwego;

import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.HitTestListener;

public class HealthBar extends GSprite {
	public HealthBar() {
		super(new GSprite(ImageCache.forClass(UpWeGo.class).get(
				"heart.png")));
		this.setSize(40,37);
		setAnchorTopLeft();
		
	}

}
