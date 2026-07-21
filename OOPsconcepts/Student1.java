package OOPsconcepts;

public class Student1 {
int age;
String name;
public Student1() {
	age=23;
	name="ram";
}
public void display() {
	System.out.println("age: "+age);
	System.out.println("Name: "+name);
}
public static void main(String[] args) {
	Student1 s1=new Student1();
	System.out.println("s1 object created");
	s1.display();
	Student1 s2=new Student1();
	System.out.println("s2 object created");
	s2.display();
	Student1 s3=new Student1();
	System.out.println("s3 object created");
	s3.display();
}
}
