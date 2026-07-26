package Comination;

public class Surgeon extends Doctor{
private String surgerytype;
 private int  experience;
Surgeon(int id,String name,String specialisation,String surgerytype,int experience){

super(id,name,specialisation);
this.surgerytype=surgerytype;
this.experience=experience;
}
@Override
public void display() {
	super.display();
	System.out.println("Surgery Type: "+surgerytype);
	System.out.println("Experience  : "+experience);
}
}