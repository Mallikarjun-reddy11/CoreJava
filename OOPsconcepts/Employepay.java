package OOPsconcepts;

public class Employepay {
int empId;
String empName;
String Department;
int salary;
public Employepay(int eid,String ename,String edepartment,int esalary) {
empId=eid;
empName=ename;
Department=edepartment;
salary=esalary;
}
public void display() {
	System.out.println("Employee ID: "+empId+"\n"+"Name: "+empName+"\n"+"Departement: "+Department+"\n"+"Salary: "+salary);
	System.out.println();
}
public static void main(String[] args) {
	Employepay e1=new Employepay(101,"Ravi","HR",35000);
	e1.display();
	Employepay e2=new Employepay(102,"Priya","Developer",55000);
	e2.display();
	Employepay e3=new Employepay(103,"Kiran","Testing",42000);
	e3.display();
}
}
