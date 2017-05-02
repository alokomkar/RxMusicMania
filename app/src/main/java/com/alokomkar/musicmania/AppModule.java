package com.alokomkar.musicmania;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Alok on 28/04/17.
 */

@Module
public class AppModule {

    MusicManiaApplication mApplication;

    public AppModule(MusicManiaApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    MusicManiaApplication providesApplication() {
        return mApplication;
    }

}
