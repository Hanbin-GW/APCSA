package Unit2.step7;
import java.awt.Color;


public class StringMistakes {
    public static void main(String[] args) {
        String str1 = "HELLO";

        System.out.println("The first letter in " + str1 + ":" + str1.substring(0,1));
        System.out.println("The last chat in " + str1 + ":" + str1.substring(3,4));
        str1 = str1.toLowerCase();
        System.out.println("In lowercase: " + str1);
    }
}
