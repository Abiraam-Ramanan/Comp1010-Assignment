public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void setScore(int homeScore, int awayScore) {
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        updatePoints();
    }

    private void updatePoints() {
        if (homeScore > awayScore) {
            homeTeam.addPoints(3); // Home team wins
        } else if (homeScore < awayScore) {
            awayTeam.addPoints(3); // Away team wins
        } else {
            homeTeam.addPoints(1); // Draw
            awayTeam.addPoints(1);
        }
    }

    public String getMatchResult() {
        return homeTeam.getName() + " " + homeScore + " - " + awayScore + " " + awayTeam.getName();
    }
}
