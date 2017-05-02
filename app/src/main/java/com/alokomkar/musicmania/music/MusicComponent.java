package com.alokomkar.musicmania.music;

import com.alokomkar.musicmania.CustomScope;
import com.alokomkar.musicmania.NetComponent;

import dagger.Component;

/**
 * Created by Alok on 02/05/17.
 */
@CustomScope
@Component(dependencies = NetComponent.class, modules = MusicModule.class)
public interface MusicComponent {
    void inject(MainActivity activity);
}
