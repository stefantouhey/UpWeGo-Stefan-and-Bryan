package upwego;

import jgame.GSprite;
import jgame.ImageCache;

public class HealthBar extends GSprite {
	public HealthBar() {
		super(new GSprite(ImageCache.forClass(UpWeGo.class).get(
				"heart.png")));
		this.setSize(40,37);
		setAnchorTopLeft();
		
	}

}
