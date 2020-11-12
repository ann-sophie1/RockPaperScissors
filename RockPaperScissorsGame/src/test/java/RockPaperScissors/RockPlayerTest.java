package RockPaperScissors;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RockPlayerTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public static Test suite()
    {
        return new TestSuite( RockPlayerTest.class );
    }
	
	public void testPlay() {
		Player p=new RockPlayer("P1");
		assertEquals(Handsign.ROCK,p.play());
	}

}
