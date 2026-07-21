package OOPsconcepts;

public class Employee {
static {
	System.out.println("ABC technologies");
}
static {
	System.out.println("Company information loaded");
}
{
	System.out.println("Employee object created");
}
int id;
String name;
float salary;
public static void main(String[] args) {
	Employee emp1=new Employee();
	emp1.id=101;
	emp1.name="Rahul";
	emp1.salary=45000;
	Employee emp2=new Employee();
	emp2.id=102;
	emp2.name="Sneha";
	emp2.salary=52000;
	Employee emp3=new Employee();
	emp3.id=103;
	emp3.name="Arjun";
	emp3.salary=60000;
	System.out.println("ID:"+emp1.id+"\n"+"Name:"+emp1.name+"\n"+"Salary:"+emp1.salary);
	System.out.println("ID:"+emp2.id+"\n"+"Name:"+emp2.name+"\n"+"Salary:"+emp1.salary);
	System.out.println("ID:"+emp3.id+"\n"+"Name:"+emp3.name+"\n"+"Salary:"+emp3.salary);
}
}
