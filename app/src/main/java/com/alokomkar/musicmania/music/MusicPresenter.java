package com.alokomkar.musicmania.music;

import com.alokomkar.musicmania.GetMusicVideoAPI;
import com.alokomkar.musicmania.music.model.MusicVideoModel;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by Alok on 26/04/17.
 */

public class MusicPresenter implements MusicManiaContract.Presenter {

    //Use 'm' prefix to indicate global variable
    private MusicManiaContract.MusicView mMusicView;
    private CompositeDisposable mCompositeDisposable;
    private Retrofit mRetrofit;

    @Inject
    public MusicPresenter( Retrofit retrofit, MusicManiaContract.MusicView musicView ) {
        this.mMusicView = musicView;
        this.mRetrofit = retrofit;
        this.mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    public void initNetworkCall( String searchString ) {

        Observable<MusicVideoModel> observable = mRetrofit
                .create(GetMusicVideoAPI.class)
                .getMusicVideos(searchString, "musicVideo");

        mMusicView.showProgressDialog();
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MusicVideoModel>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        mCompositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(@NonNull MusicVideoModel musicVideoModel) {
                        mMusicView.populateMusicVideos(musicVideoModel);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        mMusicView.showError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        mMusicView.dismissProgressDialog();
                    }
                });
    }

    @Override
    public void onDestroy() {
        if( mCompositeDisposable != null && mCompositeDisposable.isDisposed() ) {
            mCompositeDisposable.dispose();
        }
    }
}
