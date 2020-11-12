package RockPaperScissors;

import junit.framework.TestCase;

public class RandomPlayerTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testPlay() {
		Player p=new RandomPlayer();
		assertTrue((p.play()==Handsign.ROCK || p.play()==Handsign.PAPER || p.play()==Handsign.SCISSOR));
	}

}
