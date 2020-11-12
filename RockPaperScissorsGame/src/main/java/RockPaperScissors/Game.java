package RockPaperScissors;

import java.util.ArrayList;
import java.util.List;

import RockPaperScissors.playerStrategies.Player;

public class Game {

	private List<Player> players;
	private int rounds;
	private int numberParticipants;
	private int[] wins;
	private int draws;

	public int getWins(Player p) {
		int index = players.indexOf(p);
		return this.wins[index];
	}

	public int[] getWins() {
		return this.wins;
	}

	public int getDraws() {
		return draws;
	}

	public Game(int rounds) {
		this.rounds = rounds;
		this.players = new ArrayList<Player>();
		this.draws = 0;
		this.numberParticipants = 2;
		this.wins = new int[numberParticipants];
	}

	public void addPlayer(Player player) throws Exception {
		if (this.players.size() < numberParticipants) {
			this.players.add(player);
		} else
			throw new Exception("Only two players can participate");
	}
	
	private Result evaluateHandsigns(Handsign hand1, Handsign hand2) {
		if (hand1 == hand2) {
			return Result.DRAW;
		} else if ((hand1 == Handsign.ROCK && hand2 == Handsign.SCISSOR)
				|| (hand1 == Handsign.SCISSOR && hand2 == Handsign.PAPER)
				|| (hand1 == Handsign.PAPER && hand2 == Handsign.ROCK)) {
			return Result.WIN;
		} else {
			return Result.LOOSE;
		}
	}

	private void evaluateWinner(Handsign hand1, Handsign hand2) {
		Result resultP1 = evaluateHandsigns(hand1, hand2);
		
		switch (resultP1) {
		case WIN:
			this.wins[0]++;
			break;
		case LOOSE:
			this.wins[1]++;
			break;
		default:
			this.draws++;
			break;
		}
	}

	private void playRound() {
		evaluateWinner(this.players.get(0).play(), this.players.get(1).play());
	}

	public void startGame() throws Exception {
		if (this.players.size() != numberParticipants)
			throw new Exception("Not enough Players");
		else {
			for (int i = 0; i < this.rounds; i++) {
				playRound();
			}
		}
		printResults();
	}

	private void printResults() {
		System.out.println("Number of rounds: " + this.rounds);
		for (Player p : this.players) {
			System.out.println("Number of wins Player \"" + p.getName() + "\": " + this.getWins(p));
		}
		System.out.println("Number of draws: " + this.getDraws());

	}
}
