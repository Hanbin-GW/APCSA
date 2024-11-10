package Unit4.step1;
public class SumOddNumbers {
    public static int sumOddNumbers(int n)
    {
        int number = 0;
        for(int i = 1; i <= n; i += 2 )
        {
            number += i;
        }
        return number;
    }
    public static void main(String[]args)
    {
        System.out.println(sumOddNumbers(11));
    }
}