package com.alokomkar.musicmania;

/**
 * Created by Alok on 26/04/17.
 */

public interface MusicManiaContract {

    //View interface only interacts with android activity/fragment
    interface MusicView {
        void showProgressDialog();
        void dismissProgressDialog();
        void showError(String error);
        void populateMusicVideos( MusicVideoModel musicVideoModel );
        void showEmptyView();
    }

    //Presenter interface implemented by presenter class : include all
    //methods to be implemented by MusicPresenter here
    interface Presenter {
        void initNetworkCall( String searchString );
        void onDestroy();
    }


}
