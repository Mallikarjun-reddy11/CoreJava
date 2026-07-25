package Inheritance;

public class Student {
	 String name;
	    int rollNo;

	    Student(String name, int rollNo) {
	        this.name = name;
	        this.rollNo = rollNo;
	    }

	    void displayStudent() {
	        System.out.println("Student Name : " + name);
	        System.out.println("Roll Number  : " + rollNo);
	    }
}
