package RockPaperScissors;

import junit.framework.TestCase;

public class RockPlayerTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testPlay() {
		Player p=new RockPlayer();
		assertEquals(p.play(),Handsign.ROCK);
	}

}
