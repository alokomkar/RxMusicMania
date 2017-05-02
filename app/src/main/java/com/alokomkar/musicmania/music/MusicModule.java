package com.alokomkar.musicmania.music;

import com.alokomkar.musicmania.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Alok on 02/05/17.
 */

@Module
public class MusicModule {
    MusicManiaContract.MusicView musicView;

    public MusicModule(MusicManiaContract.MusicView view){
        musicView = view;
    }

    @Provides
    @CustomScope
    MusicManiaContract.MusicView providesMusicView(){
        return musicView;
    }
}
