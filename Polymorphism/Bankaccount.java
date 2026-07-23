package Polymorphism;

public class Bankaccount {
String name;
String accounttype;
double initialdeposit;
Bankaccount(String name){
	this.name=name;
}
Bankaccount(String name,String accounttype){
	this(name);
	this.accounttype=accounttype;
}
Bankaccount(String name,String accounttype,double initialdeposit){
	this(name,accounttype);
	this.initialdeposit=initialdeposit;
}
void display() {
	System.out.println("Account name   : "+name);
	System.out.println("Account type   : "+accounttype);
	System.out.println("Initial deposit: "+initialdeposit);
	System.out.println();
}
}
