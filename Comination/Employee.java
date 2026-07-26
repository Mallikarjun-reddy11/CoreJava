package Comination;

public class Employee {
private int id;
private String name;
private double salary;
Employee (int id,String name,double salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public int getid() {
	return id;
}
public String getname() {
	return name;
}
public double getslalry() {
	return salary;
}
public void setid(int id) {
	this.id=id;
	
}
public void setname(String name) {
	this.name=name;
}
public void setsalary(double salary) {
	this.salary=salary;
}
void display() {

	System.out.println("Employee ID: "+id);
	System.out.println("Employee name: "+name);
	System.out.println("Employee salary: "+salary);

}
}
