package OOPsconcepts;

public class CopyCon {
String Brand;
String Model;
int price;
public CopyCon(String  cbrand,String cmodel,int cprice) {
	Brand=cbrand;
	Model=cmodel;
	price=cprice;
}
public CopyCon(CopyCon c1) {
	Brand=c1.Brand;
	Model=c1.Model;
	price=c1.price;
	
}
public void display() {
	System.out.println("Brand: "+Brand+"\n"+"Model: "+Model+"\n"+"price: "+price);
	System.out.println();
}
public static void main(String[] args) {
	CopyCon c1=new CopyCon("Dell","Inspiron 15",62000);
	System.out.println("laptop 1");

	c1.display();
	CopyCon c2=new CopyCon(c1);
	System.out.println("laptop 2");

	c2.display();
}
}
