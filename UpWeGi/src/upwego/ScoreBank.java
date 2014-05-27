package upwego;

public class ScoreBank {
	private int points;

	public ScoreBank(int p) {
		points = p;
	}


	public void changeBankValue(int c) {
		points += c;
	}

	public int getBankValue() {
		return points;
	}
}
