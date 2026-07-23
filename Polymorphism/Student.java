package Polymorphism;

public class Student {
String name;
String course;
double feedetails;
Student(String name){
	this.name=name;
	}
Student (String name, String course){
	this(name);
	this.course=course;
}
Student (String name,String course,double feedetails){
	this(name,course);
	this.feedetails=feedetails;
}
public void  display() {
	System.out.println("Student name       : "+ name);
	System.out.println("Student course     : "+course);
	System.out.println("Student fee details: "+feedetails);
	System.out.println();
}
}
