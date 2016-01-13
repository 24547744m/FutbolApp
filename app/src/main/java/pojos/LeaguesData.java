package pojos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by damuser on 13/01/16.
 */
public class LeaguesData {

    private List<League> leagues = new ArrayList<>();


    public List<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<League> leagues) {
        this.leagues = leagues;
    }
}
