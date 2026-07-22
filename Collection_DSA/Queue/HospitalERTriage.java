package Collection_DSA.Queue;

import java.util.PriorityQueue;

class Patient {
    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class HospitalERTriage {

    private PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> a.priority - b.priority);

    public void admitPatient(Patient p) {
        triageQueue.offer(p);
    }

    public Patient callNextPatient() {
        return triageQueue.poll();
    }

    public static void main(String[] args) {
        HospitalERTriage hospital = new HospitalERTriage();

        hospital.admitPatient(new Patient(3, "Akash"));
        hospital.admitPatient(new Patient(1, "Rahul"));
        hospital.admitPatient(new Patient(5, "Amit"));
        hospital.admitPatient(new Patient(2, "Riya"));

        while (!hospital.triageQueue.isEmpty()) {
            Patient p = hospital.callNextPatient();
            System.out.println(p.name + " " + p.priority);
        }
    }
}