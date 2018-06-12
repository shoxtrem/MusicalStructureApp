package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        ArrayList<Song> album = new ArrayList<>();
        album.add(new Song("Sorcererz", "", "by Gorillaz"));
        album.add(new Song("The Don Killuminati: The 7 Day Theory", "", "by 2Pac"));
        album.add(new Song("DAMN.", "", "by Kendrick Lamar"));
        album.add(new Song("Demon Days", "", "by Gorillaz"));
        album.add(new Song("Cyborg", "", "by Nekfeu"));
        album.add(new Song("La fête est fini", "", "by Orelsan"));
        album.add(new Song("Stadium Arcadium", "", "by Red Hot Chili Peppers"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, album, R.color.colorBlack);

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
                Intent intent = new Intent(AlbumActivity.this, SongsActivity.class);

                startActivity(intent);
            }
        });

        // Find the view that shows the menu button and add clickListener to it
        ImageButton menu = (ImageButton) findViewById(R.id.menu_button);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlbumActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        // Find the view that shows the playlist button and add clickListener to it
        ImageButton playlist = (ImageButton) findViewById(R.id.playlist_button);

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlbumActivity.this, PlaylistActivity.class);

                startActivity(intent);
            }
        });

        // Find the view that shows the artist button and add clickListener to it
        ImageButton artist = (ImageButton) findViewById(R.id.artist_button);

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlbumActivity.this, ArtistActivity.class);

                startActivity(intent);
            }
        });
    }
}
