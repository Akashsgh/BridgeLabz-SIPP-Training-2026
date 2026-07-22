package Collection_DSA.HashSet;

import java.util.HashSet;
import java.util.Set;

public class DuplicateSessionToken {

    public static boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();

        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] tokens = {
                "ABC123",
                "XYZ456",
                "LMN789",
                "ABC123",
                "PQR111"
        };

        System.out.println(hasDuplicateToken(tokens));
    }
}