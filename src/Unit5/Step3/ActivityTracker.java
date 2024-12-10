package Unit5.Step3;
/**
 * The ActivityTracker program keeps track of activity logs.
 * It records and manages miles (distance) and hours (time).
 */
public class ActivityTracker
{
    public static void main(String[] args)
    {
        // Create an ActivityLog object to manage activity data
        ActivityLog mylog = new ActivityLog();
        // Record the first day's activity: 5 miles and 1 hour
        mylog.addMiles(5);
        mylog.addHours(1);
        // Print the total distance covered
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        // Store the total hours recorded so far in a variable
        double hoursToday = mylog.getHours();
        // Record additional activity hours for the second and third days
        mylog.addHours(1.5); // Activity for the second day
        mylog.addHours(3);   // Activity for the third day
        // Calculate how much the total activity hours increased since the first day
        double increase = mylog.getHours() - hoursToday;
        // Print the increase in activity hours
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}