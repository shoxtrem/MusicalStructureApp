package com.example.android.musicalstructureapp;

import android.content.Intent;

import java.lang.String;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
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

        // Find the view that shows the back button and add clickListener to it
        ImageButton back = (ImageButton) findViewById(R.id.back_button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // Find the view that shows the songs button and add clickListener to it
        ImageButton songs = (ImageButton) findViewById(R.id.song_button);

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NowPlayingActivity.this, SongsActivity.class);

                startActivity(intent);
            }
        });

        // Find the view that shows the menu button and add clickListener to it
        ImageButton menu = (ImageButton) findViewById(R.id.menu_button);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NowPlayingActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        // Find the view that shows the album button and add clickListener to it
        ImageButton album = (ImageButton) findViewById(R.id.album_button);

        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NowPlayingActivity.this, AlbumActivity.class);

                startActivity(intent);
            }
        });

        // Find the view that shows the artist button and add clickListener to it
        ImageButton artist = (ImageButton) findViewById(R.id.artist_button);

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NowPlayingActivity.this, ArtistActivity.class);

                startActivity(intent);
            }
        });

        // Find the view that shows the playlist button and add clickListener to it
        ImageButton playlist = (ImageButton) findViewById(R.id.playlist_button);

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NowPlayingActivity.this, PlaylistActivity.class);

                startActivity(intent);
            }
        });

    }

}
