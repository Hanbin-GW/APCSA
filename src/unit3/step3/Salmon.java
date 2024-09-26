package unit3.step3;

import java.util.Scanner;

public class Salmon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Ask user for month of year as an integer
        System.out.println("Number of eggs");
        int numEggs = input.nextInt();
        // Use if/else if/else statement to determine if it is spawning season
        if(numEggs >= 3 && numEggs <= 6)
        {
            System.out.println("Spring spawning season");
        } else if (numEggs >= 9 && numEggs <= 11) {
            System.out.println("Fall spawning season");
        }
        else {
            System.out.println("Not spawning season");
        }

    }
}

