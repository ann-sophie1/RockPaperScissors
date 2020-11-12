package RockPaperScissors;

import junit.framework.*;
import junit.framework.TestCase;

public class RandomPlayerTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testPlay() {
		Player p=new RockPlayer();
		assertTrue((p.play()==Handsign.ROCK || p.play()==Handsign.PAPER || p.play()==Handsign.SCISSOR));
	}

}
