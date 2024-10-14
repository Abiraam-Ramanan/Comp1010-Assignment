public class Match {
    private Team hometeam;
    private Team awayteam;
    private  int homegoals;
    private  int awaygoals;
    public  Match(Team hometeam, Team awayteam, int homegoals, int awaygoals) {
        this.hometeam = hometeam;
        this.awayteam = awayteam;
        this.homegoals = homegoals;
        this.awaygoals = awaygoals;
        hometeam.addMatch(this);
        awayteam.addMatch(this);
}

}
