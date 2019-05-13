import java.util.ArrayList;
import java.util.Scanner;
/**
 * Catagory.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Catagory
{
    private ArrayList<Question> catagory;
    private String name;
    
    public Catagory(String theName)
    {
        catagory = new ArrayList<Question>();
        Scanner sc = new Scanner(System.in);
        name = theName;
        //for(int i = 100; i <= 500; i+= 100)
        //{
            //System.out.println("What would you like the " + i + " question to be?");
            //String tempQuestion = sc.nextLine();
            //System.out.println("What would you like the answer of that question to be?");
            //String tempAnswer = sc.nextLine();
            //catagory.add(new Question(tempQuestion, tempAnswer, i*2));
        //}
    }
    
   public int getSize()
   {
       return catagory.size();
   }
   
   public String toString()
   {
       String temp = "";
       for(int i = 0; i < this.getSize(); i++)
       {
           temp+= catagory.get(i).toString();
       }
       return "The name of the catagory is " + name + " " + temp;
   }
   
   public String getName()
   {
       return name;
   }
}
