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
    /**
     * Add the hours value of a given ActivityLog object.
     * Precondition: ActivityLog object must be initialized.
     * Post condition: Returns double numHours accessed from the ActivityLog object.
     * */
    public void addHours(double hours)
    {
        numHours += hours;
    }
    /**
     * Add the miles value of a given ActivityLog object.
     * Precondition: ActivityLog object must be initialized.
     * Post condition: Returns double numMiles accessed from the ActivityLog object.
     * */
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

    /**
     * Returns the double numHours of a given ActivityLog object.
     * Precondition: ActivityLog object must be initialized.
     * @return numHours - the name of ActivityLog object
     */
    public double getHours()
    {
        return numHours;
    }

}