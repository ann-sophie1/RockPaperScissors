package RockPaperScissors;

public class RockPlayer extends Player {

	public RockPlayer(String name) {
		super(name);
	}

	@Override
	public Handsign play() {
		return Handsign.ROCK;
	}

}
