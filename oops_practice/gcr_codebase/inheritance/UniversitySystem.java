package oops_practice.gcr_codebase.inheritance;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Age = " + age;
    }
}

class Student extends Person {
    private final int studentId;
    private double gpa;

    public Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Student ID = " + studentId
                + ", GPA = " + gpa;
    }
}

class GradStudent extends Student {
    private String thesis;

    public GradStudent(String name, int age,
                       int studentId,
                       double gpa,
                       String thesis) {

        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Thesis = " + thesis;
    }
}

public class UniversitySystem {

    public static void main(String[] args) {

        GradStudent gradStudent =
                new GradStudent(
                        "Akash",
                        22,
                        101,
                        8.9,
                        "Artificial Intelligence");

        System.out.println(gradStudent);

        System.out.println("\nIS-A Relationship:");

        System.out.println(
                "GradStudent IS-A Student: "
                        + (gradStudent instanceof Student));

        System.out.println(
                "GradStudent IS-A Person: "
                        + (gradStudent instanceof Person));
    }
}