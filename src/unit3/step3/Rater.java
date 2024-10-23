package unit3.step3;

public class Rater
{
    private String name; // name of company
    private double rating; // number rating (1 - 5)


    public Rater(String company, double initialRating)
    {
        name = company;
        rating = initialRating;
    }

    // Set rating to newRating as long as
    // the new rating is no more than 5
    public void setRating(double newRating)
    {
        if(!(newRating > 5))
        {
            rating = newRating;
        }
    }

    // Returns the rating of the company
    public double getRating()
    {
        return rating;
    }

    // Returns a string representation of the company
    // based on their ratings
    public String toString()
    {
        // remember, once a return statement is
        if(rating < 2)
        {
            return "Not Recommended Company " + name;
        } else if (rating > 3.5) {
            return "Gold Star Company " + name;
        }else {
            return "Well Rated Company " + name;
        }
        // executed, the program LEAVES the method.
        // Nothing after the executed return statement is executed.
    }
}
