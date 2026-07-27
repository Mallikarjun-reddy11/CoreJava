package Comination;

 public class  CustomerBot extends Chatbot {
public CustomerBot(int id,String name,String version,String dpname,String apikey) {
	super(id,name,version,dpname,apikey);
	
}
@Override

void display() {
	System.out.println("Customer Bot : Resolves customer related quaries");
}
}
