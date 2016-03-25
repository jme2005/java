package com.edvinsson;
import java.util.ArrayList;
/**
 * Created by edvinj on 3/17/16.
 */
public class Library {
    private ArrayList<Album> albums = new ArrayList<Album>();

    public void addAlbum(Album album){
        this.albums.add(album);
    }
    public Album findAlbum(String title){
        for(Album a : this.albums){
            if(a.getTitle().equals(title)){
                return a;
            }
        }
        return null;
    }
    public void printAlbums(){
        int i = 0;
        for(Album a : this.albums){
            System.out.println(i+". " + a.getArtist() + "\t" + a.getTitle());
        }
    }

}
