package oops_practice.gcr_codebase.collection_framework;

import java.util.*;

public class SmartClassroomAttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public static void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println("Duplicate attendance not allowed for " + student);
        }
    }

    public static void displayAttendance() {

        System.out.println();

        for (String subject : attendance.keySet()) {

            System.out.println("Subject : " + subject);

            ArrayList<String> students = attendance.get(subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Students : " + students.size());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Akash");
        markAttendance("Java", "Rahul");
        markAttendance("Java", "Akash");

        markAttendance("DSA", "Akash");
        markAttendance("DSA", "Aman");
        markAttendance("Web Development", "Rohit");

        displayAttendance();
    }
}