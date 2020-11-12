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

	public void addPlayer(Player player) {
		
	}
	
	private void evaluate(Handsign h1, Handsign h2){
		
	}
	
	private void playRound() {
		
	}
	
	public void startGame() {
		
	}
}
