package Polymorphism;

public class ClaculatorMain {
public static void main(String[] args) {
	Calculator c1=new Calculator();
	int sum=c1.add( 4,5);
	System.out.println(sum);
	double sum1=c1.add(20.1, 20.9);
	System.out.println(sum1);
	int sum2=c1.add(2,3,4);
	System.out.println(sum2);
	c1.add(1, 20.7);
}
}
