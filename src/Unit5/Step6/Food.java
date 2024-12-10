package Unit5.Step6;
public class Food
{
    //Declare instance variables
    private String name;
    private int calories;

    //Create Food Constructor
    public Food(String name, int calories)
    {
        this.name = name;
        this.calories = calories;
    }

    //Add getter and setter methods for calories
    public int getCalories()
    {
        return calories;
    }
    public int setCalories(int calories)
    {
        this.calories = calories;
        return calories;
    }

    //Add getter and setter methods for name
    public String getName()
    {
        return name;
    }

    public String setName()
    {
        this.name = name;
        return name;
    }

    //Add toString method
    @Override
    public String toString()
    {
        return name + " have " + calories + " calories.";
    }

}