package Unit5.Step6;

public class DistanceTester {
    public static void main(String[] args) {
        Distance distance = new Distance(25.0);
        System.out.println(distance.toMiles());
        System.out.println(distance.doubleMiles());
        System.out.println(distance.toLeagues());
    }
}
