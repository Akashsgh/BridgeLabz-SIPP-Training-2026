package core_java_practice.gcr_codebase.ExceptionScanerio;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void processPayment(double bill, double payment)
            throws InsufficientFundsException {

        if (payment < bill) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds.");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        try {
            int totalBill = 1000;
            int items = 0;

            System.out.println(totalBill / items);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        }

        try {
            int[] patients = {101, 102, 103};

            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index.");
        }

        try {
            Integer.parseInt("ABC");

        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }

        try {
            processPayment(5000, 3000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}