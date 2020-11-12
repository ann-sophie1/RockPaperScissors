package RockPaperScissors.playerStrategies;

import RockPaperScissors.Handsign;

public abstract class Player {

	private final String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return {@link Handsign} that is chosen by the player
	 */
	public abstract Handsign play();
}
