package RockPaperScissors;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
	private List<Player> players;
	private int rounds;
	private int numberParticipants;
	private int winsPlayer1;
	private int winsPlayer2;
	private int draws;

	public int getWinsPlayer1() {
		return winsPlayer1;
	}

	public int getWinsPlayer2() {
		return winsPlayer2;
	}

	public int getDraws() {
		return draws;
	}

	public Game(int rounds) {
		this.rounds = rounds;
		this.players = new ArrayList<Player>();
		this.winsPlayer1 = 0;
		this.winsPlayer2 = 0;
		this.draws = 0;
		this.numberParticipants=2;
	}

	public void addPlayer(Player player) throws Exception {
		if (this.players.size() < numberParticipants) {
			this.players.add(player);
		} else
			throw new Exception("Only two players can participate");
	}
	
	private void evaluate(Handsign hand1, Handsign hand2){
		if (hand1 == hand2) {
			this.draws++;
		} else if ((hand1 == Handsign.ROCK && hand2 == Handsign.SCISSOR)
				|| (hand1 == Handsign.SCISSOR && hand2 == Handsign.PAPER)
				|| (hand1 == Handsign.PAPER && hand2 == Handsign.ROCK)) {
			this.winsPlayer1++;
		} else {
			this.winsPlayer2++;
		}
	}
	
	private void playRound() {
		evaluate(this.players.get(0).play(), this.players.get(1).play());
	}
	
	public void startGame() throws Exception {
		if (this.players.size() != numberParticipants)
			throw new Exception("Not enough Players");
		else {
			for (int i = 0; i < this.rounds; i++) {
				playRound();
			}
		}
	}
}
