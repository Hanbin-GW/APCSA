package Unit5.Step7;
import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";

    public static String getWinner(String user, String computer)
    {
        if(user.equals("rock") && computer.equals("scissors"))
            return COMPUTER_PLAYER;
        if(user.equals("paper") && computer.equals("scissors"))
            return COMPUTER_PLAYER;
        if(user.equals("scissors") && computer.equals("rock"))
            return COMPUTER_PLAYER;
        if(user.equals("scissors") && computer.equals("paper"))
            return USER_PLAYER;
        if(user.equals("paper") && computer.equals("rock"))
            return USER_PLAYER;
        if(user.equals("rock") && computer.equals("scissors"))
            return USER_PLAYER;
        if(user.equals("rock") && computer.equals("rock"))
            return TIE;
        if(user.equals("paper") && computer.equals("paper"))
            return TIE;
        if(user.equals("scissors") && computer.equals("scissors"))
            return TIE;
        return TIE;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String user = "";
        int computerChoice = Randomizer.nextInt(1, 3);
        String computer = "";

        while (true)
        {
            System.out.println("Enter your choice (rock, paper, or scissors): ");
            user = scanner.nextLine();
            if(computerChoice == 1)
            {
                computer = "rock";
            }
            if(computerChoice == 2)
            {
                computer = "paper";
            }
            if(computerChoice == 3)
            {
                computer = "scissors";
            }
            if(user == "")
            {
                System.out.println("Thanks for playing!");
                break;
            }
            System.out.println("User: " + user);
            System.out.println("Computer: " + computer);
            System.out.println("Winner: " + getWinner(user, computer));
        }
    }
}