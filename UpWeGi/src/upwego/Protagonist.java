package upwego;

import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.HitTestListener;

public class Protagonist extends GSprite {
	private int maxBytes;
	public int currentBytes;

	public Protagonist(int maxBytes) {
		super(new GSprite(ImageCache.forClass(UpWeGo.class).get(
				"MAINCHARACTER.png")));
		this.setSize(35,58);
//		setAnchorPosition(1,116);
		setAnchorCenter();
		boolean healthStatus = false;
		this.currentBytes = 0;
		
		
		HitTestListener OnTop = new HitTestListener(Platform.class) {

			@Override
			public void invoke(GObject target, Context context) {
			
				target.setLocation(target.getX(),target.getY()+1);
			}
			
		};
//		addListener(OnTop);
		if(healthStatus =false){
			currentBytes--;
		}
		
	}
	
}
