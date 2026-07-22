package Collection_DSA.Heap;

import java.util.PriorityQueue;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class EmergencyRoomTriage {

    private PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> b.severity - a.severity);

    public void addPatient(Patient p) {
        triageQueue.offer(p);
    }

    public Patient treatNext() {
        return triageQueue.poll();
    }

    public static void main(String[] args) {
        EmergencyRoomTriage er = new EmergencyRoomTriage();

        er.addPatient(new Patient("Akash", 4));
        er.addPatient(new Patient("Rahul", 9));
        er.addPatient(new Patient("Amit", 6));
        er.addPatient(new Patient("Riya", 10));

        while (!er.triageQueue.isEmpty()) {
            Patient p = er.treatNext();
            System.out.println(p.name + " " + p.severity);
        }
    }
}