package Comination;

public class HealthcareBot extends Chatbot{
HealthcareBot(int id,String name,String version, String dpname,String apikey){
	super(id,name,version,dpname,apikey);
}
@Override

void display() {
	System.out.println("Helath care: Resolves health related quaries");
}
}
