package com.edvinsson;
import java.util.ArrayList;
/**
 * Created by edvinj on 3/17/16.
 */
public class Album {
    private String title;
    private String artist;
    private ArrayList<Song> songs = new ArrayList<Song>();

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public void addSong(String name, double duration){
        Song newSong = new Song(name, duration);
        this.songs.add(newSong);
    }
    public Song getSong(String title){
        for(Song s : this.songs){
            if(s.getTitle().equals(title)){
                return s;
            }
        }
        return null;
    }
    public void printSongList(){
        int i = 1;
        for(Song s : this.songs){
            System.out.println(i +". " + s.getTitle() + "\t" + s.getDuration());
            i++;
        }
    }
}
