package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Song> song = new ArrayList<>();
        song.add(new Song("Sorcererz", "Sorcererz", "Gorillaz"));
        song.add(new Song("Hail Mary", "The Don Killuminati: The 7 Day Theory", "2Pac"));
        song.add(new Song("DNA.", "DAMN.", "Kendrick Lamar"));
        song.add(new Song("Feel Good Inc", "Demon Days", "Gorillaz"));
        song.add(new Song("Squa", "Cyborg", "Nekfeu"));
        song.add(new Song("Zone (feat. Nekfeu & Dizzee Rascal)", "La fête est finie", "Orelsan, Nekfeu, Dizzee Rascal"));
        song.add(new Song("Dani California", "Stadium Arcadium", "Red Hot Chili Peppers"));
        song.add(new Song("Snow (hey oh)", "Stadium Arcadium", "Red Hot Chili Peppers"));

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

        // Add a clickListener to each ListView element.
        // When clicked, get the values in the element, bundle them and
        // send them to {@link NowPlayingActivity}
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
                Intent intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                //Get the value of the item you clicked
                Song itemClicked = song.get(position);
                Bundle songData = new Bundle();
                songData.putString("nowPlayingSongName", itemClicked.getmSongName());
                songData.putString("nowPlayingSongArtist", itemClicked.getmArtistName());
                songData.putString("nowPlayingSongAlbum", itemClicked.getmAlbumName());
                intent.putExtras(songData);
                startActivity(intent);

            }
        });

        // Find the view that shows the back button and add clickListener to it
        ImageButton back = (ImageButton) findViewById(R.id.back_button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // Find the view that shows the playlist button and add clickListener to it
        ImageButton playlist = (ImageButton) findViewById(R.id.playlist_button);

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SongsActivity.this, PlaylistActivity.class);

                startActivity(intent);
            }
        });

        // Find the view that shows the menu button and add clickListener to it
        ImageButton menu = (ImageButton) findViewById(R.id.menu_button);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SongsActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        // Find the view that shows the album button and add clickListener to it
        ImageButton album = (ImageButton) findViewById(R.id.album_button);

        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SongsActivity.this, AlbumActivity.class);

                startActivity(intent);
            }
        });

        // Find the view that shows the artist button and add clickListener to it
        ImageButton artist = (ImageButton) findViewById(R.id.artist_button);

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SongsActivity.this, ArtistActivity.class);

                startActivity(intent);
            }
        });

    }


}
