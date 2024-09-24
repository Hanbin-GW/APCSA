package unit3;

import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask for goal amount
        System.out.println("Enter your goal: ");
        int goal = input.nextInt();
        // Ask for actual amount
        System.out.println("Enter your actual amount: ");
        int actualAmount = input.nextInt();
        // Compare numbers by creating three booleans
        boolean exceededGoal = goal < actualAmount;
        boolean meetGoal = goal > actualAmount;
        boolean exactlyGoal = goal == actualAmount;
        // Display results as instructed
        System.out.println("Went over goal? " + exceededGoal);
        System.out.println("Did not meet goal? " + meetGoal);
        System.out.println("Met goal exactly? " + exactlyGoal);

    }
}

