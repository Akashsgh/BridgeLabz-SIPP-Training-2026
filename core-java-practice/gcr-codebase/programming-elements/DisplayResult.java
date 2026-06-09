import java.util.Scanner;

public class DisplayResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = input.nextInt();

        System.out.print("Enter percent marks: ");
        double percentMarks = input.nextDouble();

        System.out.print("Enter result (P/F): ");
        char result = input.next().charAt(0);

        System.out.println("Displaying Result:\n" + name + " with Roll Number "
                + rollNumber + " has Scored " + percentMarks
                + "% Marks and Result is " + result);

        input.close();
    }
}
