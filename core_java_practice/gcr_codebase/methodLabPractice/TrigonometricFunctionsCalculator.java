package core_java_practice.gcr_codebase.methodLabPractice;
import java.util.Scanner;

public class TrigonometricFunctionsCalculator {
    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double angleRadians = Math.toRadians(angleDegrees);
        double sine = Math.sin(angleRadians);
        double cosine = Math.cos(angleRadians);
        double tangent = Math.tan(angleRadians);
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angleDegrees = scanner.nextDouble();

        double[] result = calculateTrigonometricFunctions(angleDegrees);

        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);

        scanner.close();
    }
}
