package unit3.step3;

public class Test1 {

    public static void main(String[] args) {
        String message1 = "This is a test";
        String message2 = "Hello Class!";
        System.out.println(message1.length());
        System.out.println(message2.length());

        System.out.println(message1.substring(0,3));
        System.out.println(message2.substring(2,3));
        System.out.println(message1.substring(5));

        System.out.println(
                message1.indexOf("is"));
        System.out.println(message1.indexOf("Hello"));
        System.out.println(message1.indexOf("Hello"));

        System.out.println(message2.toLowerCase());
        System.out.println(message2.toUpperCase());
    }
}
