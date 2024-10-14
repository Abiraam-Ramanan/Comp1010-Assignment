public class Match {
    private Team hometeam;
    private Team awayteam;
    public  Match(Team hometeam, Team awayteam, int homegoals, int awaygoals) {
        this.hometeam = hometeam;
        this.awayteam = awayteam;
        hometeam.addMatch(this);
        awayteam.addMatch(this);
}

}
