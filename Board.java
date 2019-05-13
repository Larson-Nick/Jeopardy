import java.util.ArrayList;
import java.util.Scanner;
/**
 * Board.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Board
{
    private ArrayList<Catagory> board;
    private String name;
    
    public Board(String theName)
    {
        Scanner sc = new Scanner(System.in);
        board = new ArrayList<Catagory>();
        //for(int i = 0; i < 6; i++)
        //{
            //System.out.println("What would you like to name the new catagory?");
            //String temp = sc.nextLine();
            //board.add(new Catagory("temp"));
        //}
        name = theName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        String temp = "";
        for(int i = 0; i < board.size(); i++)
        {
            temp += board.get(i).toString();
        }
        
        return "The name of the board is: " + name + " " + temp;
    }
}
