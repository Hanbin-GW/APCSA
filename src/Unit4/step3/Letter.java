package Unit4.step3;
import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        System.out.println("Enter a word");
        String word = scanner.nextLine();
        System.out.println("Enter the letter to be replaced: ");
        String replacement = scanner.nextLine();
        System.out.println("Enter the new letter: ");
        String newLetter = scanner.nextLine();
        System.out.println(replaceLetter(word,replacement,newLetter));
        // Call the method replaceLetter and pass all 3 of these items to it for
        // string processing.
    }

    // Modify this method so that it will take a third parameter from a user --
    // the String with which they want to replace letterToReplace
    //
    // This method should replace all BUT the first occurrence of letterToReplace
    // You may find .indexOf to be useful, though there are several ways to solve this problem.
    // This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace,String NewLetter)
    {
        int count = 0;
        String newWord = "";
        for(int i = 0; i < word.length(); i++)
        {
            if(word.substring(i, i+1).equals(letterToReplace))
            {
                if(count == 0)
                {
                    newWord += word.charAt(i);
                }
                else {
                    newWord += NewLetter;
                }
                count ++;
            }
            else {
                newWord += word.charAt(i);
            }
        }
        return newWord;
    }
}