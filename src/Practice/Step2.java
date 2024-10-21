package Practice;

public class Step2 {
    public static void main(String[] args) {
        String s1 = "Sorry", s2 = "sorry", s3 = "shelves";
        boolean answer1 = s1.compareTo(s2) == 0;
        boolean answer2 = !(s1.compareTo(s3) < 0);
        boolean answer3 = !(s1.substring(2,3).equals(s2.substring(3,4)));
        boolean answer4 = !(s2.length() < s3.indexOf("e"));
        boolean answer5 = (s1.length()-2 == s3.substring(2).indexOf("v"));

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
        System.out.println(answer5);
        /*
        • false
        • false
        • false
        • true
        • false
         */
    }
}
