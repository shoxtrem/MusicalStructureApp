package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
    }
}
