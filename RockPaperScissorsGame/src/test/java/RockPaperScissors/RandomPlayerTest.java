package RockPaperScissors;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RandomPlayerTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public static Test suite()
    {
        return new TestSuite( RandomPlayerTest.class );
    }
	
	public void testPlay() {
		Player p=new RandomPlayer();
		assertTrue((p.play()==Handsign.ROCK || p.play()==Handsign.PAPER || p.play()==Handsign.SCISSOR));
	}

}
