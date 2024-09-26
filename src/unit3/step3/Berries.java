package unit3.step3;

import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Ask for a berry
        System.out.println("Enter the number of berries: ");

        // Remember the Scanner object will take whole strings
        String berries = scanner.nextLine();
        // Extract the first character using charAt
        char cha = berries.charAt(0);
        // Remember that characters can be compared using ==

        if(cha == 'E')
        {
            System.out.println("You ordered Elderberry");
        } else if (cha == 'G') {
            System.out.println("You ordered Gooseberry");
        } else if (cha == 'L') {
            System.out.println("You ordered Lingonberry");
        } else {
            System.out.println("Berry not recognized");
        }

        // Use comments to list the different
        // branches you will need before you write the code
    }
}

