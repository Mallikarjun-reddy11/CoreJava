package Polymorphism;

public class Calrmployee {
	public static void main(String[] args) {
Employee e1=new Employee() ;
System.out.println("Base salary ");
e1.sal(25000);
System.out.println("Salary including bonus ");
e1.sal(25000,2500);
System.out.println("Salary icluding bonus and over time  ");
e1.sal(25000,2500,2000);

	

}}
