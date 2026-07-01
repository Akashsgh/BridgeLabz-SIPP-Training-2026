package oops_practice.gcr_codebase.inheritance;

interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Reportable {

    void generateReport();
}

interface Notifiable {

    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    String userName;

    FitnessDevice(String userName) {
        this.userName = userName;
    }

    public void logActivity() {
        System.out.println(userName + " completed today's workout.");
    }

    public void generateReport() {
        System.out.println("Fitness report generated for " + userName);
    }

    public void sendAlert() {
        System.out.println("Reminder sent to " + userName);
    }
}

public class FitnessTracker {

    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice("Akash");

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();

        System.out.println("\nJava supports multiple inheritance using interfaces only.");
    }
}