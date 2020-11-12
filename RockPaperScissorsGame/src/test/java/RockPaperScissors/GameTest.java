package RockPaperScissors;
import static org.mockito.Mockito.*;

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
		assertEquals(0,game.getWinsPlayer1());
		assertEquals(0,game.getWinsPlayer2());
	}
	
	

	public void testaddPlayer() {
		Game game=new Game(100);
		Player p1=new RockPlayer();
		Player p2=new RandomPlayer();
		Player p3=new RockPlayer();
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
		Game game=new Game(100);
		Player p1=new RockPlayer();
		Player p2=mock(RandomPlayer.class);
		when(p2.play()).thenReturn(Handsign.PAPER);
		game.addPlayer(p1);
	    game.addPlayer(p2);
	    game.startGame();
	    assertEquals(1,game.getWinsPlayer2());
	    
		
	}
	
	public void testStartGamePlayerNumber() {
		Game game=new Game(100);
		Player p1=new RockPlayer();
		game.addPlayer(p1);
	    game.startGame();
	    assertEquals(1,game.getWinsPlayer2());
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
		Player p1=new RockPlayer();
		Player p2=new RockPlayer();
		game.addPlayer(p1);
	    game.addPlayer(p2);
	    game.startGame();
	    assertEquals(100,game.getDraws());
	    
		
	}

}
