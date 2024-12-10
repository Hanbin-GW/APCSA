package Unit5.Step6;
public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car car1 = new Car(20.0,15.0);
        //Fill up the gas tank
        car1.addGas();
        //Check the miles available
        System.out.println("Miles available: " + car1.milesAvailable());
        //Drive 100 miles
        car1.drive(100);
        //Check the miles available
        System.out.println("Miles available: " + car1.milesAvailable());
        //Add 2 gallons to the gas tank
        car1.addGas(7570.82);
        //Check the miles available
        System.out.println("Miles available: " + car1.milesAvailable());
        //Try driving more miles than available by driving 1000 miles

        //Drive 200 miles
        car1.drive(200);
        //Check how much gas you have left

        //Print total miles driven
        System.out.println("Total Miles Driven: " + car1.getTotalMilesDriven());

    }
}
