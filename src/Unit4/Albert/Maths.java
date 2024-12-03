package Unit4.Albert;

import java.util.ArrayList;

public class Maths {
    public static int mathString(ArrayList<String> words)
    {
        int num = 0;
        for (int i = 0; i < words.size(); i++) {
            String a = words.get(i).substring(0,1);
            String b = words.get(i).substring(words.get(i).length()-1);

            if(a.compareTo(b) < 0)
            {
                num -= words.get(i).length();
            }
            else if(a.compareTo(b) > 0)
                {
                    num += words.get(i).length();
                }
        }
        return num;
    }
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("dragon");
        words.add("snakes");
        words.add("snakes");
        words.add("worm");
        words.add("pup");
        words.add("antelope");
        words.add("toad");
        System.out.println(mathString(words));
    }
}

