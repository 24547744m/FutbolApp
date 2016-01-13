package api;

import android.util.Log;
import android.widget.ArrayAdapter;
import java.util.List;
import pojos.League;
import pojos.LeaguesData;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by damuser on 11/01/16.
 */
public class FootballApiClient {

    private static final String API_KEY = "80de3add6e7b46c7b899bce6741692ea";
    private static final String BASE_URL = "http://api.football-data.org/";
    private Retrofit retrofit;
    private FootballInterface serviceInterface;
    private List<League> leagues;



    public FootballApiClient(){
        retrofit =  new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public void getAllLeagues(final ArrayAdapter<League> adapter){
        serviceInterface = retrofit.create(FootballInterface.class);//Creación del servicio
        Call<List<League>> call = serviceInterface.getAllLeagues();
        leaguesProcessCall(adapter, call);

    }

    private void leaguesProcessCall(final ArrayAdapter<League> adapter, Call<List<League>> call){

        Log.d("Responseeeeeeeeeeeeeeee", "");

        call.enqueue(new Callback<List<League>>() {
            @Override
            public void onResponse(Response<List<League>> response, Retrofit retrofit) {


                if (response.isSuccess()){
                    leagues = response.body();
                    adapter.clear();

                    Log.d("resultados...", String.valueOf(leagues.size()));

                    for (League league : leagues){
                        adapter.add(league);
                        Log.d("liga: ", league.toString());
                    }
                }else {
                    Log.e("no resultss..", response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }



    public interface FootballInterface{
        @GET("soccerseasons")
        Call<List<League>> getAllLeagues();

//        @GET("movie/")
//        Call<League> getTeams(@Query("api_key") String apiKey);

    }

}
