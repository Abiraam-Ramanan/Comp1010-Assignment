import java.util.ArrayList;
import java.util.List;

public class Tornament {
    private String name;
    private List<Team> teams;
    private List<Match> matches;

    public Tornament (String name) {
        this.name = name;
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public void addTeam(Team team) {
        this.teams.add(team);
    }

    public void scheduleMatch(Team homeTeam, Team awayTeam, int homeGoals, int awayGoals) {
        Match match = new Match(homeTeam, awayTeam, homeGoals, awayGoals);
        this.matches.add(match);
    }

    public List<Match> getMatches() {
        return matches;
    }

    public List<Team> getTeams() {
        return teams;
    }
}
