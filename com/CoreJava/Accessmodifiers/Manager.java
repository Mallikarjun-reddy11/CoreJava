package com.CoreJava.Accessmodifiers;

class Manager extends Employee {

    public void displayDetails() {

        System.out.println("Employee Name: " + employeeName);

        // Accessing protected variable
        System.out.println("Department: " + department);

        // Calling protected method
        showDepartment();

        // Calling default method
        showEmployeeId();

        // Accessing salary using getter
        System.out.println("Salary: " + getSalary());

        // Calling public method
        displayBonus();
    }
}


