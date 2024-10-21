package Unit4.step3;

import java.util.Scanner;

public class TeenTester
{
    public static void main(String[] args)
    {
        // Create a new Teen object and print it out; see the Teen class file
        // to see how the constructor and toString method work.
        Scanner input = new Scanner(System.in);
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10);
        System.out.println(myFriend.toString());
        String in = input.nextLine();
        myFriend.teenTalk(in);

        // Ask the user to input a text message

        // Call teenTalk method to translate the message to teen talk
    }
}