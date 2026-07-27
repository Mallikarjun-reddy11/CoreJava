package Comination;

public class Main2 {
public static void main(String[] args) {
	
	
		CustomerBot c=new CustomerBot(101,"Customer AI","1.0","openAI","API123");
		

		c.display();
		c.display1();
		CodeBot c1=new CodeBot(102,"Code Related AI","1.20","OpenAI","API432");
		c1.display();
		c1.display1();
		HealthcareBot h=new HealthcareBot(103,"Healthcare AI","1.30","OpenAI","API434");
		h.display();
		h.display1();
		
	
}
}
