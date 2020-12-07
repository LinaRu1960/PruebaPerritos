package cl.eme.pruebaperritos.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import cl.eme.pruebaperritos.data.RetrofitClient;
import cl.eme.pruebaperritos.presenter.PresenterBreed;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {

    private PresenterBreed presenterViewList;
    private static final String TAG ="InfoLog";

    public void setPresenterViewList(PresenterBreed presenterViewList) {
        this.presenterViewList = presenterViewList;
    }

    public void loadBreedList() {
        RetrofitClient.getRetrofitInstance().getAllBreeds().enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {

            }

            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {

            }
        });
        
    }

    public void setPresenterBreed(PresenterBreed presenterBreed) {
    }
}
