package org.maktab.market.data.retrofit;



import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {

        retrofit = new Retrofit.Builder()
                .baseUrl("https://woocommerce.maktabsharif.ir/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

}