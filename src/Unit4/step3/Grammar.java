package Unit4.step3;
import java.util.Scanner;

public class Grammar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        String text = input.nextLine();
        System.out.println(useProperGrammar(text));
        // Call the method useProperGrammar to process the string according to
        // the directions.
    }

    public static String useProperGrammar(String theText)
    {
        int count = 0;
        String newText = theText;
        while(newText.contains("2"))
        {
            newText = newText.replaceFirst("2","to");
            ++count;
        }
        System.out.println("Fixed " + count +" grammatical errors:");
        return newText;
    }
}
