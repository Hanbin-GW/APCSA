package Unit5.Step2;
import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";

    public static void getWinner(String user, String computer)
    {
        return;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String choice;
        while (true)
        {
            System.out.println("Enter your choice (rock, paper, or scissors): ");
            choice = scanner.nextLine();
            if(choice == "")
            {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}