package com.alokomkar.musicmania;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MusicManiaContract.MusicView {


    private ProgressDialog mProgressDialog;
    private MusicPresenter mMusicPresenter;
    private RecyclerView mArtistRecyclerView;

    private TextView mEmptyListTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mEmptyListTextView = (TextView) findViewById(R.id.emptyListTextView);
        mArtistRecyclerView = (RecyclerView) findViewById(R.id.artistRecyclerView);

        mMusicPresenter = new MusicPresenter( MusicManiaApplication.getInstance().getmNetComponent(), this );
        mMusicPresenter.initNetworkCall("Linkin Park");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showProgressDialog() {
        if( mProgressDialog == null ) {
            mProgressDialog = new ProgressDialog(MainActivity.this);
            mProgressDialog.setMessage("Loading");
            mProgressDialog.setIndeterminate(true);
            mProgressDialog.setCancelable(false);
        }
        mProgressDialog.show();
    }

    @Override
    public void dismissProgressDialog() {
        if( mProgressDialog != null ) {
            mProgressDialog.dismiss();
        }
    }

    @Override
    public void showError(String error) {
        dismissProgressDialog();
        Toast.makeText(MainActivity.this, error, Toast.LENGTH_LONG).show();
    }

    @Override
    public void populateMusicVideos( MusicVideoModel musicVideoModel ) {
        if( musicVideoModel != null && musicVideoModel.getResultCount() > 0 ) {
            mEmptyListTextView.setVisibility(View.GONE);
            mArtistRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
            mArtistRecyclerView.setAdapter(new MusicRecyclerAdapter(MainActivity.this, musicVideoModel.getResults()));
        }
        else {
            mEmptyListTextView.setVisibility(View.GONE);
        }


    }

    @Override
    public void showEmptyView() {
        mEmptyListTextView.setText(R.string.empty_list);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMusicPresenter.onDestroy();
    }
}
