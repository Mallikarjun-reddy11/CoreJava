package OOPsconcepts;

public class Studentdetails {
int id;
String name;
static String instituteName="codegnan";
int age;
public static void main(String[] args) {
Studentdetails std1=new Studentdetails();
std1.id=101;
std1.name="arjun";
std1.age=23;
Studentdetails std2=new Studentdetails();
std2.id=102;
std2.name="sai";
std2.age=23;
System.out.println(std1.id+" "+std1.name+" "+std1.age+" "+instituteName);
System.out.println(std2.id+" "+std2.name+" "+std2.age);
}
}
