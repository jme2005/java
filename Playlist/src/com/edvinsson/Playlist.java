package com.edvinsson;
import java.util.LinkedList;
import java.util.ListIterator;
/**
 * Created by edvinj on 3/17/16.
 */
public class Playlist {
    private String name;
    private LinkedList<Song> playlist = new LinkedList<Song>();

    public Playlist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSong(Song song){
        this.playlist.add(song);
    }
    public void addSong(int position, Song song){
        if(position > this.playlist.size()){
            this.playlist.add(song);
        }else{
            this.playlist.add(position,song);
        }
    }
    public ListIterator<Song> getIterator(){
        return this.playlist.listIterator();
    }
    public void printSongs(){
        ListIterator<Song> itr = this.playlist.listIterator();
        double total = 0.0;
        int i = 1;
        while(itr.hasNext()){
            Song s = itr.next();
            System.out.println(i + ". " + s.getTitle() + " " + s.getDuration());
            total += s.getDuration();
            i++;
        }
        System.out.println("Total Playing Time: " + total);
    }


}
