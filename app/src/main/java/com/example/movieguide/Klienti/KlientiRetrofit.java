package com.example.movieguide.Klienti;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class KlientiRetrofit {

    private static final String baseUrl = "http://api.themoviedb.org/3/";

    private static Retrofit retrofit = null;

    public static Retrofit getClient(){

        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
