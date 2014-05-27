package upwego;

import java.awt.Color;
import java.awt.Font;

import jgame.Context;
import jgame.GContainer;
import jgame.GMessage;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.FrameListener;

public class InfoAria extends GContainer {

	private GMessage ScoreValue = new GMessage();

	private ScoreBank Score;


	public void InfoArea(ScoreBank score) {
		this.Score = score;

		setSize(300, 150);


		ScoreValue.setAnchorCenter();

		addAt(ScoreValue,91,90);
		ScoreValue.setColor(Color.RED);
		ScoreValue.setFontSize(18);
		ScoreValue.setFontStyle(Font.BOLD | Font.ITALIC);
        
    
        FrameListener updateListener = new FrameListener() {

			@Override
			public void invoke(GObject target, Context context) {

				setMoneyBankValue(Score.getBankValue());

			}
		};
		addListener(updateListener);
	}

	public void setMoneyBankValue(int bv) {
		ScoreValue.setText("Score: " + Integer.toString(bv));
	}





}
