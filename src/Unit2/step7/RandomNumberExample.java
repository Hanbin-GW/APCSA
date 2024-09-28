package Unit2.step7;

public class RandomNumberExample {
    public static void main(String[] args) {
        int min = 5;
        int max = 25;
        int range = max - min + 1;

        for(int i = 0; i < 10; i++) { // 10번 랜덤 숫자 생성
            int randomNum = (int)(Math.random() * range) + min;
            System.out.println("랜덤 숫자 " + (i+1) + ": " + randomNum);

        }
        String s1 = new String("hi there");
        int pos = s1.indexOf("e");
        System.out.println(pos);
        String s2 = s1.substring(0,pos);
        System.out.println(s2);

    }
}

