package Encapsulation;

public class Mobile {
private String   mnumber;
 private String opname;
private int ramount;
public String   getmnumber1() {
	return mnumber;
	
}
public String getopname1() {
	return opname;
}
public int getramount1(){
	return ramount;
}
public void setmnumber1(String mnumber) {
	if(mnumber.length()==10) {
		this.mnumber=mnumber;
	}else {
		System.out.println("Invalid ");
	}}
	public void setopname1(String opname) {
		this.opname=opname;
	}
	public void setramount1(int ramount) {
		if(ramount>=10) {
			this.ramount=ramount;
		}else {
			System.out.println("The amount cannot be recharged");
		}
		
}
}
