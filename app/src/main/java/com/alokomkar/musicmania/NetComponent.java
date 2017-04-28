package com.alokomkar.musicmania;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Alok on 28/04/17.
 */
@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface NetComponent {
    Retrofit getRetrofit();
}
