package unit3.step3;

import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to drink? ");
        String drink = input.nextLine();
        System.out.println("How many teaspoons of sugar do you want? ");
        int teaspoons = input.nextInt();
        boolean teaspoon = teaspoons > 0;
        System.out.println("\nConfirming your order. You wanted: ");
        if (teaspoon)
        {
            System.out.println(drink + " with sugar");
        }
        else {
            System.out.println(drink);
        }
    }
}

