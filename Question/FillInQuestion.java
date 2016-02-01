import java.util.Scanner;

/**
 * Write a description of class FillInQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FillInQuestion extends Question
{
    //override the setText method to extract the answer from the pervious question.
    /* For example:
     * text: The inventor of Java was ====
     */
    
    public void setText (String material)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter( "_");
        String question = parser.next();
        String answer = parser.next();
        question += "____" + parser.next();
        // we have to explicitly state that we want to invoke 
        this.setText(question);
        this.setAnswer(answer);
    }
}
