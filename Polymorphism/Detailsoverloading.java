package Polymorphism;

public class Detailsoverloading {
public static void main(String[] args) {
	Student s1=new Student("Mallikarjun");
	Student s2=new Student("Sarayu","Java Full stack");
	Student s3=new Student("Sai","Java Full Stack",40000);
	s1.display();
	s2.display();
	s3.display();
}
}
