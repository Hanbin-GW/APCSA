public class Main {
    public static void main(String[] args) {
        System.out.println("Hello\nWorld");
        int sum = 0;
        for(int count = 0; count <= 6; count++)
        {
            count++;
            if (count % 2 == 0)
            {
                sum += count;
            }
        }
        System.out.println(sum);

        sum = 0;
        for(int i = 0; i <= 6; i += 2)
        {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for(int j = 7; j > 1; j--)
        {
            if (j % 2 == 0)
            {
                sum += j;
            }
        }
        System.out.println(sum);



    }
}
