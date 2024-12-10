package Unit5.Step5;
public class Fraction
{
    // Create your instance variables and constructor here
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return numerator;
    }

    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return denominator;
    }

    public void setNumerator(int numerator) {
        // IMPLEMENT THIS METHOD
        this.numerator = numerator;
    }


    public void setDenominator(int denominator) {
        // IMPLEMENT THIS METHOD
        this.denominator = denominator;
    }

    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        numerator = numerator * other.denominator + other.numerator * denominator;
        denominator *= other.denominator;
    }

    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        numerator = numerator * other.denominator - other.numerator * denominator;
        denominator = denominator * other.denominator;
    }

    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        numerator = numerator * other.numerator;
        denominator = denominator * other.denominator;
    }

    public String toString() {
        // IMPLEMENT THIS METHOD
        return numerator + "/" + denominator;
    }
}