package com.alokomkar.musicmania;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Alok on 26/04/17.
 */

public class NetworkRepository {

    private static final String API_URL = "https://itunes.apple.com";

    private static Retrofit mRetrofitInstance;
    private static GetMusicVideosAPI mGetMusicVideosAPI;

    public interface GetMusicVideosAPI {
        //https://itunes.apple.com/search?term=jack+johnson&entity=musicVideo
        @GET("search/")
        Observable<MusicVideoModel> getMusicVideos(@Query("term") String searchTerm, @Query("entity") String entity);
    }

    private static Retrofit getRetrofit() {
        if( mRetrofitInstance == null ) {
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .create();
            mRetrofitInstance = new Retrofit.Builder()
                    .baseUrl(API_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return mRetrofitInstance;
    }

    public static GetMusicVideosAPI getMusicVideosAPI() {
        if( mGetMusicVideosAPI == null ) {
            mGetMusicVideosAPI = getRetrofit().create(GetMusicVideosAPI.class);
        }
        return mGetMusicVideosAPI;
    }

}
