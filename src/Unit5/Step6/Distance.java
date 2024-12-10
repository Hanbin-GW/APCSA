package Unit5.Step6;
public class Distance
{
    private double kilometers;
    public Distance(double kilometers)
    {
        this.kilometers = kilometers;
    }

    public double toMiles()
    {
        return kilometers / 1.609;
    }

    public double toLeagues()
    {
        return kilometers /  5.556;
    }

    public double doubleMiles()
    {
        double miles = toMiles();
        return miles * 2;
    }

    public double getKilometers()
    {
        return kilometers;
    }
}