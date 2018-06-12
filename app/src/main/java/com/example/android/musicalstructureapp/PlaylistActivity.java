package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ArrayList<Song> song = new ArrayList<>();
        song.add(new Song("California Rock", "", "by Musical Structure"));
        song.add(new Song("Workout Motivation", "", "by Spotify"));
        song.add(new Song("Vacation Vibes", "", "by James"));
        song.add(new Song("Lovin' it", "", "by McDonald's"));
        song.add(new Song("Squad Anthem", "", "by Team5"));
        song.add(new Song("Never Stop", "", "by Musical Structure"));
        song.add(new Song("Princess songs", "", "by Disney"));
        song.add(new Song("Love songs", "", "by Mom"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, song, R.color.colorBlack);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

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
                Intent intent = new Intent(PlaylistActivity.this, SongsActivity.class);

                startActivity(intent);
            }
        });

        // Find the view that shows the menu button and add clickListener to it
        ImageButton menu = (ImageButton) findViewById(R.id.menu_button);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlaylistActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        // Find the view that shows the album button and add clickListener to it
        ImageButton album = (ImageButton) findViewById(R.id.album_button);

        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlaylistActivity.this, AlbumActivity.class);

                startActivity(intent);
            }
        });

        // Find the view that shows the artist button and add clickListener to it
        ImageButton artist = (ImageButton) findViewById(R.id.artist_button);

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlaylistActivity.this, ArtistActivity.class);

                startActivity(intent);
            }
        });
    }
}
