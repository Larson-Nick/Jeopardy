
/**
 * GameTester.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class GameTester
{
    public static void main(String[] args)
    {
        Board b = new Board("test");
        Game game = new Game();
        game.start(b);
    }
}
