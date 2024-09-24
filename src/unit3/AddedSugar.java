package unit3;

import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many grams of sugar have you eaten today? ");
        int sugar = input.nextInt();
        System.out.println("You can eat more sugar: " + (sugar < 30));
    }
}

