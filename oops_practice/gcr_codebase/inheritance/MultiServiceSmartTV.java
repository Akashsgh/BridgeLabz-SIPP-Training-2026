package oops_practice.gcr_codebase.inheritance;

interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    public void streamMovie() {
        System.out.println("Streaming Movie...");
    }

    public void playGame() {
        System.out.println("Playing Game...");
    }

    @Override
    public void showSubscriptionDetails() {

        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class MultiServiceSmartTV {

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        String[] movies = {
                "Avengers",
                "Interstellar",
                "Avatar"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "PUBG"
        };

        tv.showSubscriptionDetails();

        System.out.println("\nMovies:");

        for (String movie : movies)
            System.out.println(movie);

        System.out.println("\nGames:");

        for (String game : games)
            System.out.println(game);

        tv.streamMovie();
        tv.playGame();
    }
}