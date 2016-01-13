package futbol.futbolapp;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import adapters.LeaguesAdapter;
import api.FootballApiClient;
import pojos.League;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayList<League> leagues;
    private LeaguesAdapter adapter;


    public MainActivityFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        //obteniendo el listView del xml y seteandolo al view principal
        ListView lvMovies = (ListView) rootView.findViewById(R.id.lvLeagues);

        leagues = new ArrayList<>();

        adapter = new LeaguesAdapter(
                getContext(),
                R.layout.league_row,
                leagues
        );

        lvMovies.setAdapter(adapter);

        return rootView;
    }


//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        super.onCreateOptionsMenu(menu, inflater);
//        inflater.inflate(R.menu., menu);//agregando items al menu
//    }


    @Override
    public void onStart() {
        super.onStart();
        refresh();

    }

    private void refresh() {
        FootballApiClient apiClient = new FootballApiClient();
        apiClient.getAllLeagues(adapter);
    }
}
