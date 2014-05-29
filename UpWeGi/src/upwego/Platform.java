package upwego;

import upwego.UpWeGo;
import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.BoundaryRemovalListener;
import jgame.listener.FrameListener;
import jgame.listener.TimerListener;

public class Platform extends GSprite implements Floor {
	int framefall = 0; 
	public Platform() {
		
	super(new GSprite(ImageCache.forClass(UpWeGo.class).get(
			"wholeplatform.png")));
	this.setSize(285, 57);
	setAnchorCenter();
	
	TimerListener timeplat = new TimerListener(30){

		@Override
		public void invoke(GObject target, Context context) {
			// TODO Auto-generated method stub
			framefall++;
			
		}
		
	};
	
	FrameListener platformmovement = new FrameListener() {

		@Override
		public void invoke(GObject target, Context context) {
			// TODO Auto-generated method stub
			target.setLocation(target.getX(), target.getY() - getFirstAncestorOf(GameView.class).protmove.getvy()/4 + framefall);
		}
		
	};
	
	addListener(timeplat);
	addListener(platformmovement);
	BoundaryRemovalListener brl = new BoundaryRemovalListener();
	addListener(brl);

		
	
	
	}
	
}
