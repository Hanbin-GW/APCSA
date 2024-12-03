package Unit4.Albert;

public class AnimalTest {
    public static void main(String[] args) {
        String animal = "Coyote";
        for (int i = 0; i < animal.length(); i++) {
            if(animal.substring(i,i+1).equals("o"))
            {
                System.out.println(animal.substring(i,i+1));
            }
            else {
                System.out.print(animal.substring(i,i+1));
            }
        }
    }
}
