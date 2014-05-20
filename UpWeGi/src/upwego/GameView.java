package upwego;
import java.util.ArrayList;

import upwego.UpWeGo;
import jgame.Context;
import jgame.GContainer;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.FrameListener;
import jgame.listener.TimerListener;


public class GameView extends GContainer {
	
	public PlatformController protmove= new PlatformController(
			PlatformControlScheme.ARROWS_SPACE, 1, -30, 3);
	int platNumber=50;
	public ArrayList<Platform> bob = new ArrayList();
	int k = 2;
	
	public GameView() {
		

		super(new GSprite(ImageCache.forClass(UpWeGo.class).get(
				"blank.png")));
		setSize(640,640);
			

		
		final MovingBackground background = new MovingBackground();
		addAtCenter(background);
		FrameListener backgroundmovement = new FrameListener() {

			@Override
			public void invoke(GObject target, Context context) {
				// TODO Auto-generated method stub
				target.setLocation(0, target.getY() - protmove.getvy());
			}
			
		};
		
		FrameListener Respawn = new FrameListener() {

			@Override
			public void invoke(GObject target, Context context) {
				// TODO Auto-generated method stub
				if (target.getY()+(.5*target.getHeight())>640)
					context.setCurrentGameView(UpWeGo.View.GAME_OVER);
			}
			
		};
		
		background.addListener(backgroundmovement);
		
		

		for(int i=0; i<platNumber; i++)
			{
			bob.add(new Platform());

			}
			
			addAt((GObject) bob.get(0),320, 425);
			addAt((GObject) bob.get(1), 400,225);
			
			TimerListener platSpawn = new TimerListener(30) {

				@Override
				public void invoke(GObject target, Context context) {
					// TODO Auto-generated method stub
					addAt((GObject)bob.get(k), Math.random()*(640-141)+141,0);
					k++;
				}
				
			};


		
		Protagonist THEMAN = new Protagonist();
		addAtCenter(THEMAN);
		THEMAN.addController(protmove);
		THEMAN.addListener(Respawn);
		addListener(platSpawn);
		
		
	
		
		
		

	}

}
