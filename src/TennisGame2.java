import java.lang.Math;

public class TennisGame2 implements TennisGame {
	public int P1point = 0;
	public int P2point = 0;

	public String P1res = "";
	public String P2res = "";
	private String player1Name;
	private String player2Name;

	public TennisGame2(String player1Name, String player2Name) {
		this.player1Name = player1Name;
		this.player2Name = player2Name;
	}

	public String getScore() {
		String score = "";
		setPlayersResult();
		if (P1point == P2point && P1point < 3) {
			return getResult(P1point) + "-All";
		}
		if (P1point == P2point && P1point > 2)
			return "Deuce";
		score = getPlayersScore();
		return score;
	}

	private String getResult(final int points) {
		switch (points) {
		case 0:
			return "Love";
		case 1:
			return "Fifteen";
		case 2:
			return "Thirty";
		case 3:
			return "Forty";
		}
		return null;
	}

	public void SetP1Score(int number) {
		for (int i = 0; i < number; i++) {
			P1Score();
		}
	}

	public void SetP2Score(int number) {

		for (int i = 0; i < number; i++) {
			P2Score();
		}

	}

	private String getPlayersScore() {
		if (P1point > 3 || P2point > 3) {
			if (Math.abs(P1point - P2point) > 1) {
				return getWinner();
			}
			return getPlayerWithAdvantage();
		}
		if (P1point > 2 || P2point > 2) {
			if (P1point == P2point) {
				return "Deuce";
			}
		}
		return P1res + "-" + P2res;
	}

	private void setPlayersResult() {
		P1res = getResult(P1point);
		P2res = getResult(P2point);
	}

	public void P1Score() {
		P1point++;
	}

	public void P2Score() {
		P2point++;
	}

	public void wonPoint(String player) {
		if (player == player1Name)
			P1Score();
		else
			P2Score();
	}

	private String getPlayerNameWithMorePoints() {
		if (P1point > P2point) {
			return player1Name;
		}
		if (P2point > P1point) {
			return player2Name;
		}
		return null;
	}

	private String getWinner() {
		return "Win for " + getPlayerNameWithMorePoints();
	}

	private String getPlayerWithAdvantage() {
		return "Advantage " + getPlayerNameWithMorePoints();
	}

}