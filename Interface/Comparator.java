package Interface;
import java.util.*;

class Student {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

class MarksComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.marks - s2.marks;
    }
}

