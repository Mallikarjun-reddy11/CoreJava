package com.CoreJava.Accessmodifiers;

public class Main {

    public static void main(String[] args) {

        Manager m = new Manager();

        // Public variable
        m.employeeName = "Mallikarjun";

        // Default variable
        m.employeeId = 101;

        // Protected variable
        m.department = "AI & ML";

        // Private variable through setter
        m.setSalary(50000);

        m.displayDetails();

        // Uncomment to see compilation errors
        // System.out.println(m.salary);      // Private variable
        // m.calculateBonus();               // Private method
    }
}
