import java.util.Scanner;

public class ChocolateDistributionCalculator {
    public static int[] distributeChocolates(int totalChocolates, int numberOfChildren) {
        int chocolatesEach = totalChocolates / numberOfChildren;
        int remainingChocolates = totalChocolates % numberOfChildren;
        return new int[] { chocolatesEach, remainingChocolates };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total chocolates: ");
        int totalChocolates = scanner.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = scanner.nextInt();

        int[] result = distributeChocolates(totalChocolates, numberOfChildren);

        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);

        scanner.close();
    }
}
