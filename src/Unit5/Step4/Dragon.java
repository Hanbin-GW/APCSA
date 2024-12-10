package Unit5.Step4;
public class Dragon
{
    private String attack;
    private int level;

    // Write the constructor here!
    public Dragon(String attack, int level)
    {
        this.attack = attack;
        this.level = level;
    }
    // Put getters here

    // Put other methods here
    public String fight()
    {
        String re = "";
        for(int i = 0; i < level; i++)
        {
            re += ">";
        }
        return re;
    }

    public int getLevel(){
        return level;
    }

    public String getAttack()
    {
        return attack;
    }


    // String representation of the object
    @Override
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}