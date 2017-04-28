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


    }

    public static MusicManiaApplication getInstance() {
        return instance;
    }

    public NetComponent getmNetComponent() {
        return mNetComponent;
    }
}

