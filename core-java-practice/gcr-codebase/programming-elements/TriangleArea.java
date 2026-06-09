import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double baseInCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightInCm = input.nextDouble();

        double areaInSquareCm = 0.5 * baseInCm * heightInCm;
        double centimetersPerInch = 2.54;
        double areaInSquareInches = areaInSquareCm / (centimetersPerInch * centimetersPerInch);

        System.out.println("The Area of the triangle in sq in is "
                + areaInSquareInches + " and sq cm is " + areaInSquareCm);

        input.close();
    }
}
