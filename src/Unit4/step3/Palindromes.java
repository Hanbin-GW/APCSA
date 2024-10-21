package Unit4.step3;
import java.util.Scanner;
public class Palindromes
{
    /**
     * This program lets the user input some text and
     * prints out whether or not that text is a palindrome.
     */
    public static void main(String[] args)
    {
        // Create user input and let user know whether their word is a palindrome or not!
        System.out.println("Type in your text: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        isPalindrome(text);
        String ReversedText = reverse(text);
        //System.out.println(ReversedText);
        System.out.println(isPalindrome(text));
        if(isPalindrome(text) == true)
        {
            System.out.println("Your word is a palindrome!");
        }
        else {
            System.out.println("Not a palindrome :(");
        }
    }

    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     *
     * @param text The text we want to determine if it is a palindrome.
     * @return A boolean of whether or not it was a palindrome.
     */
    public static boolean isPalindrome(String text)
    {
        // Your code goes here!
        String reversedText = reverse(text);
        return reversedText.equals(text);
    }

    /**
     * This method reverses a String.
     *
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    public static String reverse(String text)
    {
        // Your code goes here!
        String NewString = "";
        for(int i = text.length() - 1; i >= 0; i--)
        {
            String character = text.substring(i, i + 1);
            NewString += character;
        }
        return NewString;
    }

}