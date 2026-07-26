package Comination;

public class Tester extends Employee  {
	private String tool;
	private String type;
Tester(int id,String name,double salary ,String tool,String type){
	super(id,name,salary);
	this.tool=tool;
	this.type=type;
}
@Override
void display() {
	super.display();
	System.out.println("Testing tools: "+tool);
	System.out.println("Automation Type: "+type);
	System.out.println();
}
}
