package core_java_practice.gcr_codebase.string;

import java.util.Scanner;

public class SubstringDemo {

    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter text: ");
            String text = sc.next();

            System.out.print("Enter start index: ");
            int start = sc.nextInt();

            System.out.print("Enter end index: ");
            int end = sc.nextInt();

            if (start < 0 || end > text.length() || start > end) {
                System.out.println("Invalid indexes!");
                return;
            }

            String customSubstring = createSubstring(text, start, end);
            String builtInSubstring = text.substring(start, end);

            System.out.println("Custom Substring: " + customSubstring);
            System.out.println("Built-in Substring: " + builtInSubstring);

            boolean result = compareStrings(customSubstring, builtInSubstring);

            System.out.println("Are both substrings equal? " + result);

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}