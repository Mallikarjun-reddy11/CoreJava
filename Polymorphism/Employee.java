package Polymorphism;

public class Employee {
double salary;
double bonus;
double overtime;
void sal(double salary) {
	double Total=salary;
	System.out.println("Salary :"+salary);
	System.out.println("Total  :"+Total);
	System.out.println();
}
void sal(double salary, double bonus) {
	double Total=salary+bonus;
	System.out.println("Salary :"+salary);
	System.out.println("Bonus  :"+bonus);
	System.out.println("Total  :"+Total);
	System.out.println();
}
void sal(double salary,double bonus,double tax) {
	double Total=salary+bonus+overtime;
	System.out.println("Salary  :"+salary);
	System.out.println("Bonus   :"+bonus);
	System.out.println("Total   :"+Total);
	
}
}
