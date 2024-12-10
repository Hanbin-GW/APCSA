package Unit5.Step6;
public class Car {
    private double efficiency ;
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    // Start here
    public Car(double carEfficiency, double carTankCapacity)
    {
        efficiency = carEfficiency;
        tankCapacity = carTankCapacity;
    }

    public void addGas()
    {
        gas = tankCapacity;
        System.out.println("Filling up ...");
    }

    public void addGas(double amount)
    {
        System.out.println("Adding gas ...");
        gas += amount;
        if(gas > tankCapacity)
        {
            gas = tankCapacity;
        }

    }

    public double getTotalMilesDriven()
    {
        return totalMilesDriven;
    }

    public void drive(double distance)
    {
        if(canDrive(distance)) {
            totalMilesDriven += distance;
            gas -= distance/efficiency;
            System.out.println("Driving " + distance);
        }
        else {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    }

    public boolean canDrive (double distance)
    {
        return gas >= distance / efficiency;
    }

    public double milesAvailable()
    {
        return gas * efficiency;
    }

    public double getGas()
    {
        return gas;
    }

}