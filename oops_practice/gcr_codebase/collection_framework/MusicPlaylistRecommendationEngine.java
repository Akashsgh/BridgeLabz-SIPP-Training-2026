package oops_practice.gcr_codebase.collection_framework;

import java.util.LinkedList;

public class MusicPlaylistRecommendationEngine {

    LinkedList<String> list = new LinkedList<>();

    public void playSong(String song) {
        list.addFirst(song);

        if (list.size() > 10) {
            list.removeLast();
        }
    }

    public void searchSong(String song) {
        if (list.contains(song)) {
            System.out.println(song + " is present in recently played list.");
        } else {
            System.out.println(song + " is not present.");
        }
    }

    public void displayHistory() {
        System.out.println("Recently Played Songs:");
        for (String song : list) {
            System.out.println(song);
        }
    }

    public static void main(String[] args) {

        MusicPlaylistRecommendationEngine playlist =
                new MusicPlaylistRecommendationEngine();

        playlist.playSong("Shape of You");
        playlist.playSong("Believer");
        playlist.playSong("Perfect");
        playlist.playSong("Senorita");
        playlist.playSong("Despacito");
        playlist.playSong("Closer");
        playlist.playSong("Faded");
        playlist.playSong("Havana");
        playlist.playSong("Thunder");
        playlist.playSong("Attention");
    

        playlist.displayHistory();

        playlist.searchSong("Believer");
        playlist.searchSong("Baby");
    }
}