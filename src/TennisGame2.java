import java.lang.Math;

/**
 * Universidad Catolica Boliviana "San Pablo".
 * 
 * @author Diego Orlando Mejia Salazar
 *
 */
public class TennisGame2 implements TennisGame {

	/**
	 * Amount of points for getting a love score.
	 */
	public final static int LOVE = 0;

	/**
	 * Amount of points for getting fifteen score.
	 */
	public final static int FIFTEEN = 1;

	/**
	 * Amount of points for getting thirty score.
	 */
	public final static int THIRTY = 2;

	/**
	 * Amount of points for getting forty score.
	 */
	public final static int FORTY = 3;

	/**
	 * Player 1 points
	 */
	public int P1point = 0;
	/**
	 * Player 2 points.
	 */
	public int P2point = 0;

	/**
	 * player 1 score.
	 */
	public String player1Score = "";
	/**
	 * player 2 score.
	 */
	public String player2Score = "";

	/**
	 * player 1 name.
	 */
	private String player1Name;

	/**
	 * player 2 name.
	 */
	private String player2Name;

	/**
	 * Constructor method.
	 * 
	 * @param player1Name is the name of player 1.
	 * @param player2Name is the name of player 2.
	 */
	public TennisGame2(String player1Name, String player2Name) {
		this.player1Name = player1Name;
		this.player2Name = player2Name;
	}

	/**
	 * Method that get the match result.
	 */
	public String getScore() {
		setPlayersResult();
		if (P1point == P2point && P1point < 3) {
			return getResult(P1point) + "-All";
		}
		if (P1point == P2point && P1point > 2)
			return "Deuce";
		return getPlayersScore();
	}

	/**
	 * Method that gets the score given the number of points.
	 * 
	 * @param points are the points of a player
	 * @return the score.
	 */
	private String getResult(final int points) {
		switch (points) {
		case LOVE:
			return "Love";
		case FIFTEEN:
			return "Fifteen";
		case THIRTY:
			return "Thirty";
		case FORTY:
			return "Forty";
		}
		return null;
	}

	/**
	 * sets player1 points
	 * 
	 * @param number the amount of points.
	 */
	public void SetP1Score(int number) {
		P1point = number;
	}

	/**
	 * sets player2 points.
	 * 
	 * @param number the amount of points.
	 */
	public void SetP2Score(int number) {
		P2point = number;

	}

	/**
	 * Method that gets the score of a match
	 * 
	 * @return the current score.
	 */
	private String getPlayersScore() {
		if (P1point > 3 || P2point > 3) {
			if (Math.abs(P1point - P2point) > 1) {
				return getWinner();
			}
			if (Math.abs(P1point - P2point) == 1) {
				return getPlayerWithAdvantage();
			}
		}
		if (P1point > 2 || P2point > 2) {
			if (P1point == P2point) {
				return "Deuce";
			}
		}
		return player1Score + "-" + player2Score;
	}

	/**
	 * Method that sets up the result for both players.
	 */
	private void setPlayersResult() {
		player1Score = getResult(P1point);
		player2Score = getResult(P2point);
	}

	/**
	 * Method that increments by one player1 score.
	 */
	public void P1Score() {
		P1point++;
	}

	/**
	 * Method that increments by one player2 score.
	 */
	public void P2Score() {
		P2point++;
	}

	/**
	 * Method that adds a point to a player.
	 * 
	 * @param player is the name of the player to add a point.
	 */
	public void wonPoint(String player) {
		if (player == player1Name)
			P1Score();
		else
			P2Score();
	}

	/**
	 * Method that give a player name.
	 * 
	 * @return the player name with highest points.
	 */
	private String getPlayerNameWithMorePoints() {
		if (P1point > P2point) {
			return player1Name;
		}
		if (P2point > P1point) {
			return player2Name;
		}
		return null;
	}

	/**
	 * Method that gives a win message result.
	 * 
	 * @return a message with the name of the player that won the match.
	 */
	private String getWinner() {
		return "Win for " + getPlayerNameWithMorePoints();
	}

	/**
	 * Method that gives the advantage message.
	 * 
	 * @return a message with the name of the player that is currently winning the
	 *         match.
	 */
	private String getPlayerWithAdvantage() {
		return "Advantage " + getPlayerNameWithMorePoints();
	}

}