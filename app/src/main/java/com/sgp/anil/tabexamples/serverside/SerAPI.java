package com.sgp.anil.tabexamples.serverside;

import com.sgp.anil.tabexamples.Model.Datastore;
import com.sgp.anil.tabexamples.Model.Example;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Anil on 07-06-2016.
 */
public interface SerAPI {
    @FormUrlEncoded
    @POST("/Retrofit/insert.php")
        //  Call<ResponseBody> insert(@FieldMap Map<String, String> insert);
    Call<ResponseBody> insert1(@Field("fname") String fname, @Field("lname") String lname, @Field("age") String age, @Field("filepath") String path);

    @GET("/Retrofit/retrive.php")
    Call<List<Datastore>> alldata();

    @GET("/JSONParsingTutorial/jsonActors")
    Call<Example> getactorsdata();

}
