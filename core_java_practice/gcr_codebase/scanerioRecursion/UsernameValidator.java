package core_java_practice.gcr_codebase.scanerioRecursion;

public class UsernameValidator {
    public static boolean isValid(String str, int i) {
        if (i == str.length()) {
            return true;
        }

        char ch = str.charAt(i);

        if (ch < 'a' || ch > 'z') {
            return false;
        }

        return isValid(str, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(isValid("abcdxyz", 0));
        System.out.println(isValid("abcD123", 0));
    }
    
}
