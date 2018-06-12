package com.example.android.musicalstructureapp;

public class Song {
    private String mSongName;

    private String mAlbumName;

    private String mArtistName;

    /**
     * Create a new Song object
     *
     * @param songName   is name of the song
     * @param albumName  is the name of the album
     * @param artistName is the name of the artist
     */
    public Song(String songName, String albumName, String artistName) {
        mSongName = songName;
        mAlbumName = albumName;
        mArtistName = artistName;
    }

    /**
     * @return the name of the song
     */
    public String getmSongName() {
        return mSongName;
    }

    /**
     * @return the name of the album
     */
    public String getmAlbumName() {
        return mAlbumName;
    }

    /**
     * @return the name of the artist
     */
    public String getmArtistName() {
        return mArtistName;
    }
}
