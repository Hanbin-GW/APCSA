package unit3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        double pay = 1;
        if (score > 90.0) {
            pay *= 1.03;
        }
        else {
            pay *= 1.01;
        }

    }
}
