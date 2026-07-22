package Encapsulation;

public class Bank {
int accnumber;
String name;
double withdraw;
double deposit;
double avlbalance;

public int  getacc() {
	return accnumber;
	
}
public String getname1() {
	return name;
}
public double getwithdraw1() {
	return withdraw;
}
public double getdeposit1() {
	return deposit;
}
public double getavlbalance() {
	return avlbalance=avlbalance+getdeposit1();
}
public void  setacc(int accnumber) {
this.accnumber=accnumber;
}
public void  setname1(String name) {
this.name=name;
}
public void setwithdraw1(double withdraw) {
	if(withdraw<= avlbalance) {
this.withdraw=withdraw;
this.avlbalance-=withdraw;
}else {
	System.out.println("In sufficeint balance");
}}
public void  setdeposit1(double deposit) {
this.deposit=deposit;
this.avlbalance+=deposit;
}

public void setavlbalance(double avlbalance) {
this.avlbalance=avlbalance;
}}
