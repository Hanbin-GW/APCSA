package unit3.step3;

import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        // Start by making comments to outline the logic of your program
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if(number < 223)
        {
            System.out.println("are you sure?");
        }
        else {
            System.out.println("Right on! Keep running!");
        }
    }
}

