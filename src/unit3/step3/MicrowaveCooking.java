package unit3.step3;

public class MicrowaveCooking
{
    public static void main(String[] args)
    {
        // Generate a random number of seconds
        int Sec = (int)(Math.random()*151)+90;
        // Print the number of seconds
        System.out.println("Microwaving for " + Sec +" seconds");
        // Use two if statements to print the temperature
        if(Sec > 120)
        {
            System.out.println("Rolls will be boiling hot!");
        }
        else {
            System.out.println("Rolls will be the right temperature!");
        }
    }
}
