package Unit5.Step7;
public class Team
{
    // Static Variables
    public static int totalTeams;

    public static int minTeams;

    // Public Methods
    public Team(int minTeams, int totalTeams)
    {
        Team.minTeams = minTeams;
        Team.totalTeams = totalTeams;
    }




    // Static Methods
    public static boolean tournamentReady()
    {
        return minTeams == totalTeams;
    }
    // ...
}