package Unit4.Albert;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(sumNumbs(10,100));
    }

    public static int sumNumbs(int a, int b)
    {
        int c = 0;
        while(a <= b)
        {
            c += a;
            a ++;
        }
        return c;
    }
}
