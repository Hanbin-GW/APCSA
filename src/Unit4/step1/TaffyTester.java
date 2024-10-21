package Unit4.step1;
import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        int temperature = 0;
        System.out.println("Starting Taffy Timer...");
        System.out.print("Enter temperature: ");
        temperature = input.nextInt();
        while(true)
        {
            if(temperature < 270)
            {
                System.out.println("The mixture isn't ready yet.");
                System.out.print("Enter temperature: ");
                temperature = input.nextInt();
            }

            else
                break;
        }
        System.out.println("Your taffy is ready for the next step!");
    }
}
