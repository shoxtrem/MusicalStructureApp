package com.example.android.musicalstructureapp;

import android.content.Intent;

import java.lang.String;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Get bundle from previous activity and check if it's not empty
        // if so, get the data and write it on screen
        Bundle songData = getIntent().getExtras();
        if (songData != null) {

            String songName = songData.getString("nowPlayingSongName");
            String songArtist = songData.getString("nowPlayingSongArtist");
            String songAlbum = songData.getString("nowPlayingSongAlbum");

            TextView song = (TextView) findViewById(R.id.song_name_text_view);
            song.setText(songName);

            TextView artist = (TextView) findViewById(R.id.artist_text_view);
            artist.setText(songArtist);

            TextView album = (TextView) findViewById(R.id.album_text_view);
            album.setText(songAlbum);
        }

    }

}
