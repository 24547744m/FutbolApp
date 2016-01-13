
package pojos;


import java.util.ArrayList;
import java.util.List;

public class LeagueTable {

    private String leagueCaption;
    private Integer matchday;
    private List<TableTeam> tableTeams = new ArrayList<>();
    private String urlSoccerSeason;

    public String getLeagueCaption() {
        return leagueCaption;
    }

    public void setLeagueCaption(String leagueCaption) {
        this.leagueCaption = leagueCaption;
    }

    public Integer getMatchday() {
        return matchday;
    }

    public void setMatchday(Integer matchday) {
        this.matchday = matchday;
    }

    public List<TableTeam> getTableTeams() {
        return tableTeams;
    }

    public void setTableTeams(List<TableTeam> tableTeams) {
        this.tableTeams = tableTeams;
    }

    public String getUrlSoccerSeason() {
        return urlSoccerSeason;
    }

    public void setUrlSoccerSeason(String urlSoccerSeason) {
        this.urlSoccerSeason = urlSoccerSeason;
    }
}
