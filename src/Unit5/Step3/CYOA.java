package Unit5.Step3;
import java.util.Objects;
import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which Server you want to buy?? ");
        String firstChoice = scanner.nextLine();
        System.out.print("how much bay you need??");
        String secondChoice = scanner.nextLine();
        int cost = 0;
        // Start here!
        //user Choose Server
        //list things to server list
        // DS9, DS8, DS9+, DS7, DS6
        // list of server bay
        // 4bay, 8bay
        // DS9+: 1000000+
        // DS9: 900000
        // DS8: 800000
        // DS7: 700000
        // DS6: 600000
        // 4bay: +400000
        // 8bay: +800000
        if(Objects.equals(firstChoice, "DS9+"))
        {
            cost += 1000000;
            if(Objects.equals(secondChoice, "4 bay"))
            {
                cost += 400000;
            } else if (Objects.equals(secondChoice, "8 bay")) {
                cost += 800000;
            }
        }
        if(Objects.equals(firstChoice, "DS9"))
        {
            cost += 900000;
            if(Objects.equals(secondChoice, "4 bay"))
            {
                cost += 400000;
            } else if (Objects.equals(secondChoice, "8 bay")) {
                cost += 800000;
            }
        }
        if(Objects.equals(firstChoice, "DS8"))
        {
            cost += 800000;
            if(Objects.equals(secondChoice, "4 bay"))
            {
                cost += 400000;
            } else if (Objects.equals(secondChoice, "8 bay")) {
                cost += 800000;
            }
        }
        if(Objects.equals(firstChoice, "DS7"))
        {
            cost += 700000;
            if(Objects.equals(secondChoice, "4 bay"))
            {
                cost += 400000;
            } else if (Objects.equals(secondChoice, "8 bay")) {
                cost += 800000;
            }
        }
        if(Objects.equals(firstChoice, "DS6"))
        {
            cost += 600000;
            if(Objects.equals(secondChoice, "4 bay"))
            {
                cost += 400000;
            } else if (Objects.equals(secondChoice, "8 bay")) {
                cost += 800000;
            }
        }
        System.out.println(cost);
    }
}