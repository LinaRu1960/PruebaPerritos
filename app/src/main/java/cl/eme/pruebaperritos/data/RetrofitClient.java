package cl.eme.pruebaperritos.data;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "https://dog.ceo/api/breeds/list";
    private static Retrofit retrofit = null;
    private RetrofitClient(){

    }
   public static ApiDogs getRetrofitInstance(){
       if (retrofit == null){
           retrofit = new retrofit2.Retrofit.Builder()
                   .baseUrl(BASE_URL)
                   .addConverterFactory(GsonConverterFactory.create())
                   .build();
       }
       return retrofit.create(ApiDogs.class);
   }

}
