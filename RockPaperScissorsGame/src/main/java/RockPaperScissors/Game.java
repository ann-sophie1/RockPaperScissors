package RockPaperScissors;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
	List<Player> players;
	private int rounds;
	private int numberParticipants;
	private int winsPlayer1;
	private int winsPlayer2;
	private int draws;

	public Game(int rounds) {
		this.rounds = rounds;
		this.players = new ArrayList<Player>();
		this.winsPlayer1 = 0;
		this.winsPlayer2 = 0;
		this.draws = 0;
		this.numberParticipants=2;
	}

	public void registerToGame(Player player) {
		
	}
	
	public void evaluate(Handsign h1, Handsign h2){
		
	}
	
	public void round() {
		
	}
	
	public void startGame() {
		
	}
}
