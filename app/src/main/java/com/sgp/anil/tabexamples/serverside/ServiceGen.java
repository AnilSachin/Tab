package com.sgp.anil.tabexamples.serverside;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Anil on 07-06-2016.
 */
public class ServiceGen {

    public static final String BASE_URL = "http://anilandroid.orgfree.com/";


    public static final OkHttpClient.Builder httpclient = new OkHttpClient.Builder();

    public static final Retrofit.Builder rb = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create());


    public static <S> S createservice(Class<S> ser) {

        Retrofit r = rb.client(httpclient.connectTimeout(200, TimeUnit.SECONDS).readTimeout(200, TimeUnit.SECONDS).build()).build();
        return r.create(ser);
    }


}
