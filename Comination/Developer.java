package Comination;

public class Developer extends Employee {
private String lang;
private String proname;
Developer(int id,String name,double salary,String lang,String proname){
	super(id,name,salary );
	this.lang=lang;
	this.proname=proname;
	
}
@Override
void display() {
	super.display();

	System.out.println("Programming Language: "+lang);
	System.out.println("Project name: "+proname);

}


}
