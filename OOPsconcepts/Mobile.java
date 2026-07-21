package OOPsconcepts;

public class Mobile {
	static String brand="Samsung";
	String model;
	int price;
	String color;
static {
	System.out.println("Mobile stored opened");
}
{
	System.out.println("Mobile object created");	
}
public static void main(String[] args) {
Mobile m1=new Mobile();
m1.model="Galaxy A55";
m1.price=35000;
m1.color="Black";
Mobile m2=new Mobile();
m2.model="Galaxy S24";
m2.price=75000;
m2.color="Blue";
System.out.println("brand : "+brand+"\n"+"mobile 1"+"\n"+"Model : "+m1.model+"\n"+"Price : "+m1.price+"\n"+"Color : "+m1.color);
System.out.println("mobile 2"+"\n"+"Model : "+m2.model+"\n"+"Price : "+m2.price+"\n"+"Color : "+m2.color);
}


}
