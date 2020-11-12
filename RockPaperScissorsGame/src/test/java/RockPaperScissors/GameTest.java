package RockPaperScissors;
import static org.mockito.Mockito.*;
import junit.framework.TestCase;

public class GameTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testGame() {
		Game game=new Game(1);
		assertEquals(game.getDraws(),0);
		assertEquals(game.getWinsPlayer1(),0);
		assertEquals(game.getWinsPlayer2(),0);
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
	    assertEquals(game.getWinsPlayer2(),1);
	    
		
	}
	
	public void testStartGameRock() {
		Game game=new Game(100);
		Player p1=new RockPlayer();
		Player p2=new RockPlayer();
		game.addPlayer(p1);
	    game.addPlayer(p2);
	    game.startGame();
	    assertEquals(game.getDraws(),100);
	    
		
	}

}
