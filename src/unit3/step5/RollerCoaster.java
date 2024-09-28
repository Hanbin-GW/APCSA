package unit3.step5;

import java.util.Scanner;

public class RollerCoaster
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your tall: ");
        int tall = input.nextInt();
        if(age >= 9 && tall >= 42)
        {
            System.out.println("Welcome aboard!");
        }
        else{
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}