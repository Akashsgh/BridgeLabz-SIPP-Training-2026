import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double yardsPerMile = 1760;
        double feetPerYard = 3;
        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;

        System.out.println("The distance in yards is " + distanceInYards
                + " while the distance in miles is " + distanceInMiles);

        input.close();
    }
}
