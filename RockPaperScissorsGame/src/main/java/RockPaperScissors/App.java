package RockPaperScissors;

public class App 
{
    public static void main( String[] args )
    {
    	Game game = new Game(100);
		Player player1 = new RockPlayer("Rock");
		Player player2 = new RandomPlayer("Random");
		try {
			game.addPlayer(player1);
			game.addPlayer(player2);
			game.startGame();
		} catch (Exception e) {
			System.out.println(e);
		}
    }
}
