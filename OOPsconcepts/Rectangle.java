package OOPsconcepts;

public class Rectangle {
	double length;
	double breadth;
	
	double area=length*breadth;
public static void main(String[] args) {
	Rectangle rect1=new Rectangle();
	rect1.length=20;
	rect1.breadth=30;
	Rectangle rect2=new Rectangle();
	rect2.length=10;
	rect2.breadth=20;
	System.out.println(rect1.area);
	System.out.println(rect2.length+" "+rect2.breadth);

	
}
}
