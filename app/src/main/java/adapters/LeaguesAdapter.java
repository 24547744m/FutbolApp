package adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import futbol.futbolapp.R;
import pojos.League;

/**
 * Created by damuser on 13/01/16.
 */
public class LeaguesAdapter extends ArrayAdapter<League> {


    public LeaguesAdapter(Context context, int resource, List<League> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        League league = getItem(position);
        Log.w("XXXXXXXX", league.toString());

        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.league_row, parent, false);
        }

        TextView tvLeagueName = (TextView) convertView.findViewById(R.id.tvLeagueName);
        TextView tvNumberOfTeams = (TextView) convertView.findViewById(R.id.tvNumberOfTeams);
        TextView tvNumberOfGames = (TextView) convertView.findViewById(R.id.tvNumberOfGames);

        tvLeagueName.setText(league.getCaption());
        tvNumberOfTeams.setText(league.getNumberOfTeams().toString());
        tvNumberOfGames.setText(league.getNumberOfGames().toString());

//        Picasso.with(getContext()).
//                load(movie.getPosterImage()).
//                resize(160, 0).
//                into(ivPoster);

        return convertView;
    }
}
