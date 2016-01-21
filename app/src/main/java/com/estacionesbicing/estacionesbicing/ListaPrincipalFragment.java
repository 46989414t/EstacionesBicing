package com.estacionesbicing.estacionesbicing;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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

    public ListaPrincipalFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainActivityFragment =  inflater.inflate(com.estacionesbicing.estacionesbicing.R.layout.fragment_lista_principal, container, false);
        //return inflater.inflate(R.layout.fragment_lista_principal, container, false);
        crearRetrofit();
        descargarEstaciones();
        ListView listView = (ListView) mainActivityFragment.findViewById(R.id.idListaEstaciones);




        return mainActivityFragment;
    }
    public void crearRetrofit(){
        retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        bicingService =retrofit.create(BicingService.class);

    }
    public interface BicingService{
        retrofit.Call<ObjetoEstacion> getStations();
    }
    public void descargarEstaciones(){
        retrofit.Call<ObjetoEstacion> call = bicingService.getStations();
        call.enqueue(new Callback<ObjetoEstacion>() {
            @Override
            public void onResponse(Response<ObjetoEstacion> response, Retrofit retrofit) {
                ObjetoEstacion objetoEstacion = response.body();

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
