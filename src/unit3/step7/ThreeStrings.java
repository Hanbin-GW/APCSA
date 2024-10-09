package unit3.step7;
import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // The company's secret code
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password:  ");
        String password = scanner.nextLine();
        System.out.println("Enter the company's secret code: ");
        String Code = scanner.nextLine();
        // DO NOT change this value
        String companyCode = "1298";

        if(Code.equals(companyCode))
        {
            System.out.println("Access granted");
        }
        else {
            System.out.println(password + Code + " is denied");
        }



        // Use comments to organize your logic before you start coding
    }
}