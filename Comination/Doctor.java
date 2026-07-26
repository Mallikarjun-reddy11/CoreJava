package Comination;

public class Doctor {
private int id;
private String name;
private String specialisation;
Doctor(int id,String name,String specialisation){
	this.id=id;
	this.name=name;
	this.specialisation=specialisation;
	
}
public int getid() {
	return id;
	
}
public String getname() {
	return name;
	
}
public String getspecialisation() {
	return specialisation;
}
public void setid(int id) {
	this.id=id;
}
public void setname(String name) {
	this.name=name;
}
public void setspecialisation(String specialisation) {
	this.specialisation=specialisation;
}
void display() {
	System.out.println("Doctor ID     : "+id);
	System.out.println("Doctor name   : "+name);
	System.out.println("Specialisation: "+specialisation);
}
}
