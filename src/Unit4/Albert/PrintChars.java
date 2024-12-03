package Unit4.Albert;

public class PrintChars {
    public static void printChars(String str, int num) {
        if(num % 2 == 0)
        {
            for (int i = 0; i < num; i++)
            {
                System.out.print(str + " ");
            }
            System.out.println("");;
            for (int i = 0; i < num; i++)
            {
                System.out.print(str + str.substring(0,1)+ " ");
            }
            System.out.println("");;
        }
        else{
            for(int i = 1;i<num;i++)
            {
                System.out.print(str + str.substring(0,1)+ " ");
            }
            System.out.println("");;
            for (int i = 1;i<num;i++)
            {
                System.out.print(str + str.substring(0,1)+ " ");
            }
            System.out.println("");;
        }
    }
    public static void main(String[] args) {
        printChars("XY",4);
    }
}
