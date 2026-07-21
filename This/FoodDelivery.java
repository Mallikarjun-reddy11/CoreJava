package This;

public class FoodDelivery {
int fid;
String fname;
String fitem;
String faddress;
public FoodDelivery(int fid) {
	this.fid=fid;
	System.out.println("Food order Started "+"\nOrder ID: "+fid);
}
public FoodDelivery(int fid,String fname) {
	this(fid);
	this.fname=fname;
	System.out.println("Restaurant: "+fname);
}
public FoodDelivery(int fid,String fname,String fitem) {
	this(fid,fname);
	this.fitem=fitem;
	System.out.println("Food Item: "+fitem);
}
public FoodDelivery(int fid,String fname,String fitem,String faddress) {
	this(fid,fname,fitem);
	this.faddress=faddress;
	System.out.println("Delivery Address: "+faddress);
}
public static void main(String[] args) {
	FoodDelivery f=new FoodDelivery(1001,"Paradise","Chicken Biryani","Hyderabad");
}
}
