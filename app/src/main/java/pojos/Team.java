
package pojos;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private String code;
    private String shortName;
    private String squadMarketValue;
    private String crestUrl;
    private String urlFixtures;
    private String urlPlayers;
    private List<Player> players = new ArrayList<>();
    private Integer totalPlayers;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public String getSquadMarketValue() {
        return squadMarketValue;
    }
    public void setSquadMarketValue(String squadMarketValue) {
        this.squadMarketValue = squadMarketValue;
    }
    public String getCrestUrl() {
        return crestUrl;
    }
    public void setCrestUrl(String crestUrl) {
        this.crestUrl = crestUrl;
    }
    public String getUrlFixtures() {
        return urlFixtures;
    }
    public void setUrlFixtures(String urlFixtures) {
        this.urlFixtures = urlFixtures;
    }
    public String getUrlPlayers() {
        return urlPlayers;
    }
    public void setUrlPlayers(String urlPlayers) {
        this.urlPlayers = urlPlayers;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public Integer getTotalPlayers() {
        return totalPlayers;
    }
    public void setTotalPlayers(Integer totalPlayers) {
        this.totalPlayers = totalPlayers;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", shortName='" + shortName + '\'' +
                ", squadMarketValue='" + squadMarketValue + '\'' +
                ", crestUrl='" + crestUrl + '\'' +
                ", urlFixtures='" + urlFixtures + '\'' +
                ", urlPlayers='" + urlPlayers + '\'' +
                ", players=" + players +
                ", totalPlayers=" + totalPlayers +
                '}';
    }
}
