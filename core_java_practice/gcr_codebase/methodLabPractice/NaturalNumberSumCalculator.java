import java.util.Scanner;

public class NaturalNumberSumCalculator {
    public static int calculateSumOfNaturalNumbers(int number) {
        int sum = 0;
        for (int count = 1; count <= number; count++) {
            sum += count;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        int sum = calculateSumOfNaturalNumbers(number);

        System.out.println("The sum of natural numbers up to " + number + " is " + sum);

        scanner.close();
    }
}
