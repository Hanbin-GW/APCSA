public class Main {
    public static void main(String[] args) {

        String str1 = "test";
        String str2 = "test";
        String str3 = new String("test");
        String str4 = new String("test");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str3==str4);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str3.equals(str4));
    }
}
