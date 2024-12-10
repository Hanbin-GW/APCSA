package Unit5.Step6;
import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        Food food = new Food("Hamburgers",600);
        Food food2 = new Food("French Fries",350);
        Food food3 = new Food("Cake",200);
        System.out.println(food);
        System.out.println("How many would you like?");
        int input = scanner.nextInt();
        input *= food.getCalories();
        total += input;
        System.out.println(food2);
        System.out.println("How many would you like?");
        int input2 = scanner.nextInt();
        input2 *= food2.getCalories();
        total += input2;
        System.out.println(food3);
        System.out.println("How many would you like?");
        int input3 = scanner.nextInt();
        input3 *= food3.getCalories();
        total += input3;
        System.out.println("Your meal will have a total of " + total + " calories");

    }
}