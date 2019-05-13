
/**
 * QuestionTester.java 
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */

public class QuestionTester 
{
   public static void main(String[] args)
   {
       Question one = new Question("What is the capitol of Illinois?", "Springfield" , 300, true);
       System.out.println("The Question is: " + one.getQuestion());
       System.out.println("The Answer is: " + one.getAnswer());
       System.out.println("The value is " + one.getValue());
       System.out.println(one.toString());
   }
}
