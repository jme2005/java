package com.edvinsson;
import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    Player myPlayer = new Player();
        Album okcomp = new Album("OK Computer", "Radiohead");
        okcomp.addSong("Paranoid Android", 300);
        okcomp.addSong("Karma Police", 240);
        okcomp.addSong("Let Down", 278);
        Album hisandhers = new Album("His and Hers", "Pulp");
        hisandhers.addSong("Babies",234);
        hisandhers.addSong("Do you remember the first time", 123);
        hisandhers.addSong("Lipgloss", 213);
        myPlayer.addAlbumtoLibrary(okcomp);
        myPlayer.addAlbumtoLibrary(hisandhers);
        myPlayer.printSongs("OK Computer");
        System.out.println();
        myPlayer.createPlaylist("playlist1");
        myPlayer.addSongtoPlaylist("playlist1","OK Computer","Paranoid Android");
        myPlayer.addSongtoPlaylist("playlist1","OK Computer","Karma Police");
        myPlayer.addSongtoPlaylist("playlist1","His and Hers", "Babies");
        myPlayer.addSongtoPlaylist("playlist1","His and Hers", "Do you remember the first time", 0);
        myPlayer.printPlaylist("playlist1");
        myPlayer.play("playlist1");


    }
}
