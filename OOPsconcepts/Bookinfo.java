package OOPsconcepts;

public class Bookinfo {
int id;
String Title;
String author;
int  price;
public Bookinfo() {
	 id=102;
	 Title="Java programming";
	 author="James Gosbling";
	 price =650;
}
public void display() {
	System.out.println("Book id: "+id+"\n"+"Title: "+Title+"\n"+"Autor: "+author+"\n"+"price: "+price);
}
public static void main(String[] args) {
	Bookinfo b1=new Bookinfo();
	b1.display();
}
}
