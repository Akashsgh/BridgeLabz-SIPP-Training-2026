package oops_practice.gcr_codebase.inheritance;

interface TextModeration {

    boolean checkOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {

        String text = post.toLowerCase();

        return text.contains("bad") ||
               text.contains("hate") ||
               text.contains("abuse");
    }
}

interface SpamDetection {

    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam messages are prohibited.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    public boolean checkOffensive(String post) {

        return TextModeration.containsRestrictedWords(post);
    }

    public boolean checkSpam(String post) {

        return post.toLowerCase().contains("buy now")
                || post.toLowerCase().contains("free")
                || post.toLowerCase().contains("offer");
    }

    @Override
    public void displayModerationPolicy() {

        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class AIBasedContentModerationPlatform {

    public static void main(String[] args) {

        String[] posts = {

                "Have a great day",
                "Buy now and get free gifts",
                "I hate this product",
                "Special offer available",
                "Welcome everyone"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            System.out.println("Post : " + post);

            if (moderator.checkSpam(post))
                System.out.println("Status : Spam Post");

            else if (moderator.checkOffensive(post))
                System.out.println("Status : Offensive Post");

            else
                System.out.println("Status : Valid Post");

            System.out.println();
        }
    }
}