package cl.eme.pruebaperritos.data;

import java.util.List;


import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiDogs {

    @GET("list/all")
    Call<List<String>> getAllBreeds();
    @GET("breed/{breed}/images/")
    Call <ListImage> getImageBreeds();
}
