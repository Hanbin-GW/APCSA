package unit3.step3;

import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask how many hours were you parked
        System.out.println("How many hours were you parked?");

        // Compute cost - $4.25
        int hours = scanner.nextInt();
        double cost = 4.25;
        cost *= hours;

        // If parked for more than 3 hours, apply 25% discount
        if(hours > 3)
        {

            cost *= 0.75;
        }

        if(cost < 7)
        {
            cost = 7;
        }
        // If cost is under $7, set cost to $7
        System.out.println("You owe $" + cost);
        // Display the final cost

    }
}



