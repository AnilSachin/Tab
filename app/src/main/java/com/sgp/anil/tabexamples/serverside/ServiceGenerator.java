package com.sgp.anil.tabexamples.serverside;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Anil on 09-06-2016.
 */
public class ServiceGenerator {
    public static final String BASE_URL = "http://microblogging.wingnity.com/";

    public static final OkHttpClient.Builder httpclient = new OkHttpClient.Builder();

    public static final Retrofit.Builder rb1 = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create());

    public static <S> S create(Class<S> s) {

        Retrofit retrofit = rb1.client(httpclient.connectTimeout(200, TimeUnit.SECONDS).readTimeout(200, TimeUnit.SECONDS).build()).build();
        return retrofit.create(s);
    }

}
