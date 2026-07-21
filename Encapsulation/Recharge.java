package Encapsulation;

public class Recharge {
public static void main(String[] args) {
	Mobile m1=new Mobile();
	m1.setmnumber1("9000780041");
	m1.setopname1("Arjun");
	m1.setramount1(100);
	System.out.println("mobile number:"+ m1.getmnumber1()+"\n"+"Name: "+m1.getopname1()+"\n"+"Amount of recharge: "+m1.getramount1());
}
}
