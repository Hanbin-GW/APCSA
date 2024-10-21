package Unit4.step3;
import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        System.out.println(passwordCheck(password));
    }

    public static boolean passwordCheck(String password)
    {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters
        // and numbers.
        int count = 0;
        for (int i = 0; i < password.length(); i++)
        {
            if(password.charAt(i) >= '0' && password.charAt(i) <= '9' || password.charAt(i) >= 'a' && password.charAt(i) <= 'z' || password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
            {
                count++;
            }
        }
        return password.length() >= 8 && count == password.length();
    }
}