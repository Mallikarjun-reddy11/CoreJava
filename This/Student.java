package This;

public class Student {
int age;
String name;
public Student(int age, String name) {
	this.age=age;
	this.name=name;
	
}
void display() {
	System.out.println("Name: "+name+"\nAge: "+age);
	System.out.println();
}
public static void main(String[] args) {
	Student s1=new Student(23,"ram");
	s1.display();
	Student s2=new Student(25,"raju");
	s2.display();
}
}
