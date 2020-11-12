package RockPaperScissors;
import static org.mockito.Mockito.*;

import RockPaperScissors.playerStrategies.Player;
import RockPaperScissors.playerStrategies.RandomPlayer;
import RockPaperScissors.playerStrategies.RockPlayer;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GameTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public static Test suite()
    {
        return new TestSuite( GameTest.class );
    }

	public void testGame() {
		Game game=new Game(1);
		assertEquals(0,game.getDraws());
		assertEquals(0,game.getWins()[0]);
		assertEquals(0,game.getWins()[1]);
	}
	
	

	public void testaddPlayer() {
		Game game=new Game(100);
		Player p1=new RockPlayer("P1");
		Player p2=new RandomPlayer("P2");
		Player p3=new RockPlayer("P3");
		try {
		    game.addPlayer(p1);
		    game.addPlayer(p2);
		    game.addPlayer(p2);
		    fail("Expected an Exception to be thrown");
		  } catch (Exception e) {
		    assertEquals(e.getMessage(),"Only two players can participate");
		  }
	}

	public void testStartGame() {
		Game game=new Game(1);
		Player p1=new RockPlayer("P1");
		Player p2=mock(RandomPlayer.class);
		when(p2.play()).thenReturn(Handsign.PAPER);
		try {
			game.addPlayer(p1);
			game.addPlayer(p2);
			game.startGame();
		} catch (Exception e) {}
	    
	    assertEquals(1,game.getWins(p2));
	    
		
	}
	
	public void testStartGamePlayerNumber() {
		Game game=new Game(100);
		Player p1=new RockPlayer("P1");
	    try {
	    	game.addPlayer(p1);
		    game.startGame();
		    fail("Expected an Exception to be thrown");
		  } catch (Exception e) {
		    assertEquals(e.getMessage(),"Not enough Players");
		  }
		
	}
	
	public void testStartGameRock() {
		Game game=new Game(100);
		Player p1=new RockPlayer("P1");
		Player p2=new RockPlayer("P2");
		try {
			game.addPlayer(p1);
			game.addPlayer(p2);
		    game.startGame();
		} catch (Exception e) {}
	    
	    assertEquals(100,game.getDraws());
	    
		
	}

}
