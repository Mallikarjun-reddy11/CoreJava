package OOPsconcepts;

public class Static {

static {
	System.out.println("Static block1");
}
static {
	System.out.println("Static block2");
}
{
	System.out.println("Instance block1");
}
{
	System.out.println("Instance block2");
}
int id;
String name;
static String instituteName="codegnan";
public static void main(String[] args) {
	Static emp1=new Static();
	emp1.id=101;
	emp1.name="arjun";
	System.out.println(emp1.id+" "+emp1.name+" "+instituteName);
	Static emp2=new Static();
	emp2.id=102;
	emp2.name="sai";
	System.out.println(emp2.id+" "+emp2.name+" "+instituteName);
}

}
