package Encapsulation;
public class Food {
int id;
String customername;
double amount;
String orderstatus;

public int getid() {
	return id;
}
public String getcustomername() {
	return customername;
}
public double getamount() {
	return amount;
}
public String getorderstatus() {
	return orderstatus;
}
public void setid(int id) {
	this.id=id;
}
public void setcustomername(String customername) {
	this.customername=customername;
}
public void setamount(double amount) {
	this.amount=amount;
}
public void setorderstatus(String orderstatus) {
	if(orderstatus.equals("pending")||
			orderstatus.equals("Preparing")||
			orderstatus.equals("Delivered")||
			orderstatus.equals("Cancelled")) {
		this.orderstatus=orderstatus;
	}else {
		System.out.println("Invalid status");
	}
}
}
