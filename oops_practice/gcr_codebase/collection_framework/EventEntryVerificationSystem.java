package oops_practice.gcr_codebase.collection_framework;

import java.util.*;

public class EventEntryVerificationSystem {

    static HashSet<String> participants = new HashSet<>();

    public static void registerParticipant(String email) {

        if (participants.add(email)) {
            System.out.println("Registration Successful.");
        } else {
            System.out.println("Duplicate Registration Rejected.");
        }
    }

    public static void displayParticipants() {

        System.out.println("\nRegistered Participants:");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("Total Participants : " + participants.size());
    }

    public static void main(String[] args) {

        registerParticipant("akash@gmail.com");
        registerParticipant("rahul@gmail.com");
        registerParticipant("aman@gmail.com");
        registerParticipant("akash@gmail.com");

        displayParticipants();
    }
}