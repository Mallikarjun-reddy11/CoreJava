package Interface;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	    public static void main(String[] args) {

	        ArrayList<Student> list = new ArrayList<>();

	        list.add(new Student(101, "Rahul", 80));
	        list.add(new Student(102, "Akhil", 65));
	        list.add(new Student(103, "Kiran", 90));

	        Collections.sort(list, new MarksComparator());

	        for (Student s : list) {
	            System.out.println(s);
	        }
	    }
	}


