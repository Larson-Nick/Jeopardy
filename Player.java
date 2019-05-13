
/**
 * Player.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Player
{
    private String name;
    private int balance;
    
    public Player(String theName)
    {
        name = theName;
        balance = 0;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    public void changeBalance(int add)
    {
        balance += add;
    }
    
    public String toString()
    {
        return "The players name is: " + name + " and their balance is " + balance;
    }
}
