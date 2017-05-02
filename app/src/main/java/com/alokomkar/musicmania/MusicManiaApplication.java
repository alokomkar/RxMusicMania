package com.alokomkar.musicmania;

import android.app.Application;

/**
 * Created by Alok on 28/04/17.
 */

public class MusicManiaApplication extends Application {

    private NetComponent mNetComponent;
    private static MusicManiaApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        mNetComponent = DaggerNetComponent
                .builder()
                .appModule(new AppModule(MusicManiaApplication.this)) // This also corresponds to the name of your module: %component_name%Module
                .networkModule(new NetworkModule(MusicManiaApplication.this))
                .build();


    }

    public static MusicManiaApplication getInstance() {
        return instance;
    }

    public NetComponent getmNetComponent() {
        return mNetComponent;
    }
}

