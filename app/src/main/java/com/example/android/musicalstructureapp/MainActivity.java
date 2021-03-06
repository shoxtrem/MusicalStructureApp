package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the view that shows the songs category and add clickListener to it
        TextView songs = (TextView) findViewById(R.id.song);

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                startActivity(songsIntent);
            }
        });

        // Find the view that shows the playlist category and add clickListener to it
        TextView playlist = (TextView) findViewById(R.id.playlist);

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                startActivity(playlistIntent);
            }
        });

        // Find the view that shows the artist category and add clickListener to it
        TextView artist = (TextView) findViewById(R.id.artist);

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ArtistActivity.class);

                startActivity(intent);
            }
        });

        // Find the view that shows the album category and add clickListener to it
        TextView album = (TextView) findViewById(R.id.album);

        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlbumActivity.class);

                startActivity(intent);
            }
        });

        // Find the view that shows the play button and add clickListener to it
        ImageButton play = (ImageButton) findViewById(R.id.play_image_button);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                startActivity(playIntent);
            }
        });

    }
}
