package OOPsconcepts;

public class Parameterised {
	int age;
	String name;
	public Parameterised(int sage,String sname) {
		age=sage;
		name=sname;
	}
	public void display() {
		System.out.println("age: "+age);
		System.out.println("Name: "+name);
	
	}
	public static void main(String[] args) {
		Parameterised p1=new Parameterised(23,"ram");
		Parameterised p2=new Parameterised(24,"sham");
		System.out.println("p1 object created");
		p1.display();
		System.out.println("p2 object created");
		p2.display();

	}
}
