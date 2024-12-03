package Unit5.Step2;
public class Dog
{
    private String name;
    private String breed;
    private boolean hasShots;

    // Add your constructors here
    public Dog(String name, String breed, boolean hasShots)
    {
        this.name = name;
        this.breed = breed;
        this.hasShots = hasShots;
    }

    public String toString(){
        String output = "Name: " + name;
        output += "\nBreed: " + breed;

        if(hasShots)
        {
            output += "\nUp to date on shots!";
        }
        else
        {
            output += "\nMissing shots";
        }

        return output;
    }
}