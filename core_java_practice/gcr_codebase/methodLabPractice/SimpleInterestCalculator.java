package core_java_practice.gcr_codebase.methodLabPractice;
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal
                + ", Rate of Interest " + rate + " and Time " + time);

        scanner.close();
    }
}
