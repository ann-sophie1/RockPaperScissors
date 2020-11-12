package RockPaperScissors.playerStrategies;

import java.util.Random;

import RockPaperScissors.Handsign;

public class RandomPlayer extends Player {

	private Random rand;

	public RandomPlayer(String name) {
		super(name);
		rand = new Random();
	}

	private int getRandomNumber() {
		return this.rand.nextInt(3);

	}

	@Override
	public Handsign play() {
		int randomNumber = getRandomNumber();
		Handsign hand;
		switch (randomNumber) {
		case 0:
			hand = Handsign.ROCK;
			break;
		case 1:
			hand = Handsign.SCISSOR;
			break;
		default:
			hand = Handsign.PAPER;
			break;
		}
		return hand;
	}

}
