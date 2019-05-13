
/**
 * Question.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Question
{
    private String answer;
    private String question;
    private int value;
    private boolean isDouble;

    public Question(String theQuestion, String theAnswer, int theValue, boolean dailyDouble)
{
    answer = theAnswer;
    question = theQuestion;
    value = theValue;
    isDouble = dailyDouble;
}

public String getQuestion()
{
    return question;
}

public String getAnswer()
{
    return answer;
}

public int getValue()
{
    return value;
}

public boolean isDailyDouble()
{
    return isDouble;
}

public String toString()
{
    return "The question is " + question + ", the answer is " + answer + " the value is " + value + " ";
}
}
