package RockPaperScissors;

import RockPaperScissors.playerStrategies.Player;
import RockPaperScissors.playerStrategies.RandomPlayer;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RandomPlayerTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public static Test suite() {
		return new TestSuite(RandomPlayerTest.class);
	}

	public void testPlay() {
		Player p = new RandomPlayer("P1");
		Handsign h = p.play();
		assertTrue((h == Handsign.ROCK || h == Handsign.PAPER || h == Handsign.SCISSOR));
	}

}
