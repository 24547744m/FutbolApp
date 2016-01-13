
package pojos;

import java.util.ArrayList;
import java.util.List;

public class League {

    private String urlTeams;
    private String urlFixtures;
    private String urlLeagueTable;
    private Integer id;
    private String caption;
    private String league;
    private String year;
    private Integer currentMatchday;
    private Integer numberOfTeams;
    private Integer numberOfGames;
    private String lastUpdated;
    private List<Team> teams = new ArrayList<>();
    private Integer totalTeams;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public String getLeague() {
        return league;
    }
    public void setLeague(String league) {
        this.league = league;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public Integer getCurrentMatchday() {
        return currentMatchday;
    }
    public void setCurrentMatchday(Integer currentMatchday) {
        this.currentMatchday = currentMatchday;
    }
    public Integer getNumberOfTeams() {
        return numberOfTeams;
    }
    public void setNumberOfTeams(Integer numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }
    public Integer getNumberOfGames() {
        return numberOfGames;
    }
    public void setNumberOfGames(Integer numberOfGames) {
        this.numberOfGames = numberOfGames;
    }
    public String getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public String getUrlTeams() {
        return urlTeams;
    }
    public void setUrlTeams(String urlTeams) {
        this.urlTeams = urlTeams;
    }
    public String getUrlFixtures() {
        return urlFixtures;
    }
    public void setUrlFixtures(String urlFixtures) {
        this.urlFixtures = urlFixtures;
    }
    public String getUrlLeagueTable() {
        return urlLeagueTable;
    }
    public void setUrlLeagueTable(String urlLeagueTable) {
        this.urlLeagueTable = urlLeagueTable;
    }
    public List<Team> getTeams() {
        return teams;
    }
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
    public Integer getTotalTeams() {
        return totalTeams;
    }
    public void setTotalTeams(Integer totalTeams) {
        this.totalTeams = totalTeams;
    }

    @Override
    public String toString() {
        return "League{" +
                "urlTeams='" + urlTeams + '\'' +
                ", urlFixtures='" + urlFixtures + '\'' +
                ", urlLeagueTable='" + urlLeagueTable + '\'' +
                ", id=" + id +
                ", caption='" + caption + '\'' +
                ", league='" + league + '\'' +
                ", year='" + year + '\'' +
                ", currentMatchday=" + currentMatchday +
                ", numberOfTeams=" + numberOfTeams +
                ", numberOfGames=" + numberOfGames +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", teams=" + teams +
                ", totalTeams=" + totalTeams +
                '}';
    }
}
