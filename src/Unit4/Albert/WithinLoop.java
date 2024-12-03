package Unit4.Albert;

public class WithinLoop {
    public static void main(String[] args) {
        String str1 = "rat";
        String str2 = "";

        for(int i = str1.length()-1;i >= 0;i--) {
            str2 += str1.substring(i,i+1);
            System.out.print(str2);
        }
        if(str1 == str2)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}
