package This;

public class Ott {
int id;
String name;
String platformname;
String subplan;
double monthprice;
int numofmonths;
public Ott(int id,String name,String platformname,String subplan,double monthprice,int numofmonths) {
	this.id=id;
	this.name=name;
	this.platformname=platformname;
	this.subplan=subplan;
	this.monthprice=monthprice;
	this.numofmonths=numofmonths;
	
}
 double subamount() {
	 return monthprice*numofmonths;
		  
	 }
 double discount(double amount) {
	 if(numofmonths==12) {
		 return amount*0.20;
	 }
	 return 0;
 }
 double GST(double amount) {
	 return amount*0.18;
 }

public void display() {
	double amount=subamount();
	double discount=discount(amount);
	double afterdiscount=amount-discount;
	double gst=GST(afterdiscount);
	double finalamount=afterdiscount+gst;
	 System.out.println("User ID : " + id);
     System.out.println("User Name : " + name);
     System.out.println("Platform : " + platformname);
     System.out.println("Plan : " + subplan);
     System.out.println("Monthly Price : " + monthprice);
     System.out.println("Months : " +numofmonths);
     System.out.println("Amount : " + amount);
     System.out.println("Discount : " + discount);
     System.out.println("GST : " + gst);
     System.out.println("Final Amount : " + finalamount);
     System.out.println();
}
public static void main(String[] args) {
	Ott t1=new Ott(101, "Ravi", "Netflix", "Premium", 500, 12);
	Ott t2=new Ott(102, "Anu", "Prime", "Basic", 300, 6);
	Ott t3=new Ott(103, "Rahul", "Hotstar", "VIP", 400, 12);
	t1.display();
	t2.display();
	t3.display();
}
}
