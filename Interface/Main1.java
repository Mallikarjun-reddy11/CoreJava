package Interface;

import java.util.ArrayList;
import java.util.Collections;

public class Main1 {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(103, "Rahul"));
        list.add(new Employee(101, "Akhil"));
        list.add(new Employee(102, "Kiran"));

        Collections.sort(list);

        System.out.println(list);
    }
}

