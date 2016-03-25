package com.edvinsson;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ListIterator;
/**
 * Created by edvinj on 3/18/16.
 */
public class Player {
    private Library library = new Library();
    private ArrayList<Playlist> playlists = new ArrayList<Playlist>();
    private Scanner scanner = new Scanner(System.in);

    public void createPlaylist(String name){
        Playlist newPlaylist = new Playlist(name);
        this.playlists.add(newPlaylist);
    }
    public void addAlbumtoLibrary(Album album) {
        this.library.addAlbum(album);
    }
    public void addSongtoPlaylist(String playlist, String album, String song ){
        Playlist playlist1 = getPlaylist(playlist);
        if(playlist1 != null){
            Album album1 = this.library.findAlbum(album);
            if(album1 != null){
                Song song1 = album1.getSong(song);
                if(song1 != null){
                    playlist1.addSong(song1);
                }else{
                    System.out.println("Song not found!");
                }
            }else{
                System.out.println("Album not found!");
            }
        }else{
            System.out.println("Playlist not found!");
        }
    }
    public void addSongtoPlaylist(String playlist, String album, String song, int position ){
        Playlist playlist1 = getPlaylist(playlist);
        if(playlist1 != null){
            Album album1 = this.library.findAlbum(album);
            if(album1 != null){
                Song song1 = album1.getSong(song);
                if(song1 != null){
                    playlist1.addSong(position, song1);
                }else{
                    System.out.println("Song not found!");
                }
            }else{
                System.out.println("Album not found!");
            }
        }else{
            System.out.println("Playlist not found!");
        }
    }
    public Playlist getPlaylist(String name) {
        for (Playlist p : this.playlists) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }
    public void printSongs(String name){
            Album album = this.library.findAlbum(name);
            if(album != null){
                album.printSongList();
            }else{
                System.out.println("Album not found");
            }
        }
    public void printPlaylist(String name){
        Playlist p = getPlaylist(name);
        if(p != null){
            p.printSongs();
        }else{
            System.out.println("Playlist not found");
        }
    }
    public void play(String name){
        Playlist p = getPlaylist(name);
        printMenu();
        if(p != null){
            ListIterator<Song>  itr = p.getIterator();
            boolean done = false;
            boolean goingForward = true;
            printCurrentSong(itr.next());
            while(!done){
                int n = scanner.nextInt();
                switch(n){
                    case 1:
                        done = true;
                        break;
                    case 2:
                        if (!goingForward && itr.hasNext()) {
                            itr.next();
                            goingForward = true;
                        }
                        if(itr.hasNext()) {
                            printCurrentSong(itr.next());
                        }else{
                            System.out.println("You have reached the end of the playlist.");
                        }
                        break;
                    case 3:
                        if(goingForward && itr.hasPrevious()){
                            itr.previous();
                            goingForward = false;
                        }
                        if(itr.hasPrevious()){
                            printCurrentSong(itr.previous());
                        }else{
                            System.out.println("You have reached the start of the playlist.");
                        }
                        break;
                    case 4:
                        if(goingForward){
                            printCurrentSong(itr.previous());
                            goingForward = false;
                        }else{
                            printCurrentSong(itr.next());
                            goingForward = true;
                        }
                        break;
                }
            }
        }
    }
    private void printCurrentSong(Song song){
        System.out.println("Now playing: " + song.getTitle());
    }
    public void printMenu(){
        System.out.println("1. Exit\n" +
                "2. Skip Forward\n" +
                "3. Skip Backward\n" +
                "4. Replay Song\n");
    }
}



