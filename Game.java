import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
public class Game
{
   private ArrayList<Board> board;
   private Player player;
   
   public Game()
   {
       board = new ArrayList<Board>();
   }
   
   public void play(Board b)
   {
       start(b);
   }
   
   public Board getRandomBoard()
   {
       return board.get((int)(Math.random()*board.size()));
   }
   
   public void start(Board b)
   {
       
   }
   
   public void start()
   {
       UIManager UI = new UIManager();
        UI.put("OptionPane.background", Color.blue);
        UI.put("Panel.background", Color.blue);
        UI.put("OptionPane.messageForeground", new Color(255, 140, 0));
       String name = JOptionPane.showInputDialog(null, "Welcome to Jeopardy! Please enter your name:", "Jeopardy!", JOptionPane.PLAIN_MESSAGE);
       player = new Player(name);
   }
}
