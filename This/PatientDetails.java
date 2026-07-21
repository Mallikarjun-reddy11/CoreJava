package This;

public class PatientDetails {
int pid;
String pname;
String pdisese;
double pamount;
public PatientDetails(int pid) {
	this.pid=pid;
	System.out.println("Patient Registration Started \nPatient ID: "+pid );
}
public PatientDetails(int pid,String pname) {
	this(pid);
	this.pname=pname;
	
	System.out.println("Patient Name: "+pname);
}
public PatientDetails(int pid,String pname,String pdisease) {
	this(pid,pname);
	System.out.println("Disease: "+pdisease);
}
public PatientDetails(int pid,String pname,String pdisease,double pamount) {
	this(pid,pname,pdisease);
	System.out.println("Bill Amount: "+pamount);
}
public static void main(String[] args) {
	PatientDetails p1=new PatientDetails(101,"Arjun","Fever",2500);
}
}
