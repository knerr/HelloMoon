package com.example.mattyice.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by Matty Ice on 3/22/2015.
 */
public class AudioPlayer {
    MediaPlayer mMediaPlayer;

    public void pause() {
        if (mMediaPlayer != null){
            mMediaPlayer.pause();
        }
    }

    public void stop() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    public void play(Context c){
        if (mMediaPlayer == null) {
            mMediaPlayer = MediaPlayer.create(c, R.raw.one_small_step);
            mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stop();
                }
            });
        }
        mMediaPlayer.start();
    }
}
