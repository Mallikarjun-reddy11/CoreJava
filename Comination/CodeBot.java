package Comination;

public class CodeBot  extends Chatbot{
	CodeBot(int id, String name,String version,String dpname, String apikey){
		super(id,name,version,dpname,apikey);
		
	}
	@Override
	
	void display() {
		System.out.println("Code Assistant Bot: resolves the coding related quaries");
	}

}
