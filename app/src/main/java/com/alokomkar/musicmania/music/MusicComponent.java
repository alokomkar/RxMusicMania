package com.alokomkar.musicmania.music;

import com.alokomkar.musicmania.AppModule;
import com.alokomkar.musicmania.CustomScope;
import com.alokomkar.musicmania.NetworkModule;

import dagger.Component;

/**
 * Created by Alok on 02/05/17.
 */
@CustomScope
@Component(dependencies = AppModule.class, modules = NetworkModule.class)
public interface MusicComponent {

    void inject(MainActivity activity);
}
