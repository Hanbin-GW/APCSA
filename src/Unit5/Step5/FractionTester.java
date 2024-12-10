package Unit5.Step5;
public class FractionTester
{
    public static void main(String[] args)
    {
        // Implement the Fraction class in Fraction.java

        // Then add code here to test out your Fraction class!
        Fraction fraction = new Fraction(2,10);
        Fraction fraction2 = new Fraction(3,12);
        fraction.add(fraction2);
        fraction.multiply(fraction2);
        fraction.subtract(fraction2);
        System.out.println(fraction);
    }
}