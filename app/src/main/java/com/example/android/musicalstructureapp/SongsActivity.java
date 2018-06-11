package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> song = new ArrayList<>();
        song.add(new Song("Sorcererz","Sorcererz","Gorillaz"));
        song.add(new Song("Hail Mary","The Don Killuminati: The 7 Day Theory","2Pac"));
        song.add(new Song("DNA.","DAMN.","Kendrick Lamar"));
        song.add(new Song("Feel Good Inc","Demon Days","Gorillaz"));
        song.add(new Song("Squa","Cyborg","Nekfeu"));
        song.add(new Song("Zone (feat. Nekfeu & Dizzee Rascal)","La fête est finie","Orelsan, Nekfeu, Dizzee Rascal"));
        song.add(new Song("Dani California","Stadium Arcadium","Red Hot Chili Peppers"));
        song.add(new Song("Snow (hey oh)","Stadium Arcadium","Red Hot Chili Peppers"));

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
