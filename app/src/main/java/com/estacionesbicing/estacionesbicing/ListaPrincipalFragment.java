package com.estacionesbicing.estacionesbicing;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * A placeholder fragment containing a simple view.
 */
public class ListaPrincipalFragment extends Fragment {

    //web: http://wservice.viabicing.cat/v2/stations
    Retrofit retrofit;
    public String API_URL = "http://wservice.viabicing.cat/v2/stations";
    BicingService bicingService;
    private ArrayList<Station> items;


    public ListaPrincipalFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainActivityFragment =  inflater.inflate(com.estacionesbicing.estacionesbicing.R.layout.fragment_lista_principal, container, false);
        //return inflater.inflate(R.layout.fragment_lista_principal, container, false);
        crearRetrofit();
        //new descargarEstaciones();
        ListView listView = (ListView) mainActivityFragment.findViewById(R.id.idListaEstaciones);
        items = new ArrayList<>();
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, item);


        return mainActivityFragment;
    }
    public void crearRetrofit(){
        retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //bicingService =retrofit.create(BicingService.class);

    }

    public void estacionesBici(){
        bicingService = retrofit.create(BicingService.class);
        final Call<ObjetoEstacion> llamada = (Call<ObjetoEstacion>) bicingService.getStations();

        llamada.enqueue(new Callback<ObjetoEstacion>() {
            @Override
            public void onResponse(Response<ObjetoEstacion> response, Retrofit retrofit) {
                ObjetoEstacion listaEstaciones = response.body();
                for (int iterador = 0; iterador<listaEstaciones.getStations().size(); iterador++){

                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }

    public interface BicingService{
        retrofit.Call<ObjetoEstacion> getStations();
    }
    class descargarEstaciones extends AsyncTask{

        @Override
        protected Object doInBackground(Object[] params) {
            estacionesBici();
            return null;
        }
    }
}
