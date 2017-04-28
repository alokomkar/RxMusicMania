package com.alokomkar.musicmania;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Alok on 28/04/17.
 */

public interface GetMusicVideoAPI {
    //https://itunes.apple.com/search?term=jack+johnson&entity=musicVideo
    @GET("search/")
    Observable<MusicVideoModel> getMusicVideos(@Query("term") String searchTerm, @Query("entity") String entity);
}
