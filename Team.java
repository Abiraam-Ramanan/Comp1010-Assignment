import java.util.ArrayList;
import java.util.List;

public class Team {
    private  String name;
    private  String ground;
    private List<Match> matches = new ArrayList<Match>();
    public Team (String name, String ground) {
        this.name = name;
        this.ground = ground;
        this.matches = matches;
    }
    public void addMatch(Match match) {
        this.matches.add(match);
}
}