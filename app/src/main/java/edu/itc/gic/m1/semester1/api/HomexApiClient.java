package edu.itc.gic.m1.semester1.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Singleton class
 *
 * @autor MAO Hieng 3/4/2020
 */
public class HomexApiClient {

    private static HomexApiClient INSTANCE;

    public static HomexApiClient getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HomexApiClient();
        }

        return INSTANCE;
    }

    public final Retrofit retrofit;

    private HomexApiClient() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                .create();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://homex-cambodia.appspot.com/_ah/api/homex/v1/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public HomexService getHomexService() {
        return retrofit.create(HomexService.class);
    }

}
