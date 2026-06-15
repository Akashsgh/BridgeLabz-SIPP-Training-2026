import java.util.Scanner;

public class MaxHandshakesCalculator {
    public static long calculateMaxHandshakes(int numberOfStudents) {
        return (long) numberOfStudents * (numberOfStudents - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        long maxHandshakes = calculateMaxHandshakes(numberOfStudents);

        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);

        scanner.close();
    }
}
