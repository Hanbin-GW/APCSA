package Unit4.Albert;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator
{
    /**
     * Returns the day of the week for the first day of the given year. * 0 = Sunday, 1 = Monday, ..., 6 = Saturday.
     */
    private static int firstDayOfYear(int year)
    {
        GregorianCalendar cal = new GregorianCalendar(year, 0, 1);
        return cal.get(Calendar.DAY_OF_WEEK) - 1;
    }
    /**
     * Returns the day of the year for a given date (month, day, year).
     * 1 = January 1, 2 = January 2, ..., 365 or 366 depending on leap year. */
    private static int dayOfYear(int month, int day, int year)
    {
        GregorianCalendar cal = new GregorianCalendar(year, month - 1, day);
        return cal.get(Calendar.DAY_OF_YEAR);
    }
    /**
     * Returns the day of the week for the given date. * 0 = Sunday, 1 = Monday, ..., 6 = Saturday.
     */
    public static int dayOfWeek(int month, int day, int year)
    {
        /* to be implemented in part (b) */
        int dayofyear = dayOfYear(month, day, year);
        int range = firstDayOfYear(year);//this is graded 1 points to count how many time to run this program
        int count = dayofyear % 7 - 1; //this is graded 1 points to get a number day less than 6;
        //System.out.println(count);
        for(int i = 0;i < range; ++i)
        {
            ++count;
        }
        return count;
    }
}