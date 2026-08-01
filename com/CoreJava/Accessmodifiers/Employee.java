package com.CoreJava.Accessmodifiers;

public class Employee {
	public String employeeName;

    // Private variable
    private double salary;

    // Protected variable
    protected String department;

    // Default variable
    int employeeId;

    // Public method
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method
    public double getSalary() {
        return salary;
    }

    // Protected method
    protected void showDepartment() {
        System.out.println("Department: " + department);
    }

    // Default method
    void showEmployeeId() {
        System.out.println("Employee ID: " + employeeId);
    }

    // Private method
    private double calculateBonus() {
        return salary * 0.10;
    }


    public void displayBonus() {
        System.out.println("Bonus: " + calculateBonus());
    }
}

