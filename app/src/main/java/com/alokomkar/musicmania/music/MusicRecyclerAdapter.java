package com.alokomkar.musicmania.music;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alokomkar.musicmania.R;
import com.alokomkar.musicmania.music.model.MusicVideoModel;

import java.util.List;

/**
 * Created by Alok on 28/04/17.
 */

public class MusicRecyclerAdapter extends RecyclerView.Adapter<MusicRecyclerAdapter.ViewHolder> {

    private Context mContext;
    private List<MusicVideoModel.Result> mResults;

    public MusicRecyclerAdapter(Context context, List<MusicVideoModel.Result> results) {
        this.mContext = context;
        this.mResults = results;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater
                        .from(mContext)
                        .inflate(R.layout.item_music_video, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MusicVideoModel.Result result = mResults.get(position);
        holder.artistNameTextView.setText(result.getArtistName());
        holder.trackTextView.setText(result.getTrackName());
    }

    @Override
    public int getItemCount() {
        return mResults.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView artistNameTextView;
        TextView trackTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            artistNameTextView = (TextView) itemView.findViewById(R.id.artistNameTextView);
            trackTextView = (TextView) itemView.findViewById(R.id.trackNameTextView);
        }
    }
}
