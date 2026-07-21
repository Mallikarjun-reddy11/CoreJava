package OOPsconcepts;

public class Student {
static {
	System.out.println("Student Management system started");
}
{
	System.out.println("Student object created");
}
int id;
String name;
String course;
public static void main(String[] args) {
	Student s1=new Student();
s1.id=101;
s1.name="Ravi";
s1.course="java";
Student s2=new Student();
s2.id=102;
s2.name="Priya";
s2.course="java full stack";
System.out.println("ID:"+s2.id+ "\n" +"Name:"+s2.name+"\n"+"course:"+s2.course);
System.out.println("ID:"+s1.id+ "\n" +"Name:"+s1.name+"\n"+"course:"+s1.course);
}}
