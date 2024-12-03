package Unit5.Step3;
public class ActivityLog
{
    private double numHours;
    private double numMiles;
    /**
     * Initializes a ActivityLog object.
     * Precondition: ActivityLog object must take a double numMiles and double numMiles
     * Post condition: Instance variables double numMiles and double numHours are initialize 0.  */
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }

    public void addHours(double hours)
    {
        numHours += hours;
    }

    public void addMiles(double miles)
    {
        numMiles += miles;
    }

    /**
     * Returns the double numMiles of a given ActivityLog object.
     * Precondition: ActivityLog object must be initialized.
     * @return numMiles - the name of ActivityLog object
     */
    public double getMiles()
    {
        return numMiles;
    }

    public double getHours()
    {
        return numHours;
    }

}