package Unit4.step1;
import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter a number or 0 to quit: ");
        number = scanner.nextInt();
        while(number != 0)
        {
            System.out.println("Enter a number or 0 to quit: ");
            number = scanner.nextInt();
            if(number == 0)
                break;
        }
    }
}
