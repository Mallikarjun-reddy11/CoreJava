package Inheritance;
public class EngineeringStudent extends Student {

    String branch;
    double cgpa;

    EngineeringStudent(String name, int rollNo, String branch, double cgpa) {
        super(name, rollNo);
        this.branch = branch;
        this.cgpa = cgpa;
    }

    void displayDetails() {
        System.out.println("Branch : " + branch);
        System.out.println("CGPA   : " + cgpa);
    }
}
