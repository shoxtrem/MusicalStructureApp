package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ArrayList<Song> song = new ArrayList<>();
        song.add(new Song("California Rock","","by Musical Structure"));
        song.add(new Song("Workout Motivation","","by Spotify"));
        song.add(new Song("Vacation Vibes.","","by James"));
        song.add(new Song("Lovin' it","","by McDonald's"));
        song.add(new Song("Squad Anthem","","by Team5"));
        song.add(new Song("Never Stop","","by Musical Structure"));
        song.add(new Song("Princess songs","","by Disney"));
        song.add(new Song("Love songs","","by Mom"));

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
    }
}
