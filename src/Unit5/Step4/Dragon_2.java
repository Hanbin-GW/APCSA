package Unit5.Step4;
public class Dragon_2
{
    private String name;
    private int level;
    private boolean canBreatheFire;

    // Write the constructor here!
    public Dragon_2(String name, int level)
    {
        this.name = name;
        this.level = level;
        this.canBreatheFire = level >= 70;
    }
    // Put getters here
    public String getName()
    {
        return name;
    }

    public int getLevel()
    {
        return level;
    }

    public boolean isFireBreather()
    {
        return canBreatheFire;
    }
    // Put other methods here

    public void gainExperience()
    {
        level += 10;
        canBreatheFire = level >= 70;
    }

    public void attack()
    {
        if(canBreatheFire)
        {
            System.out.println(">>>>>>>>>>");
            System.out.println(">>>>>>>>>>>>>>");
            System.out.println(">>>>>>>>>>>>>>");
            System.out.println(">>>>>>>>>>");
        }
        else {
            System.out.println("~ ~ ~");
        }
    }


    // String representation of the object
    @Override
    public String toString()
    {
        return "Dragon " + name + " is at level " + level;
    }
}
