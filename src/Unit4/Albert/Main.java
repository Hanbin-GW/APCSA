package Unit4.Albert;

public class Main {
    public static void main(String[] args) {
        stringDelete("greatness",2);
    }
    public static String stringDelete(String str, int pos)
    {
        if(str.length() > 0)
            return str.substring(0, pos) + str.substring(pos + 1);
        return str;
    }

}
