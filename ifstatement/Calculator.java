package ifstatement;
import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first num:");
	int a=sc.nextInt();
	System.out.println("enter the second number:");
	int b=sc.nextInt();
	System.out.println("enter the operations to be performed:(+,-,*,/,%");
	char ch=sc.next().charAt(0);
	switch(ch) {
	case '+':
		int sum=a+b;
		System.out.println("Addition of first and second number is:"+ sum);
		break;
	case'-':
		int sub=a-b;
		System.out.println("subtraction of firt and second number is:"+sub);
		break;
	case '*':
		float mul=a*b;
		System.out.println("multiplication of first and second number is:"+mul);
		break;
	case '/':
		float div=a/b;
		System.out.println("division of first and second number is :"+div);
		break;
	case'%':
		double mod=a%b;
		System.out.println("modulo of the first and second number is :"+mod);
	}
}
}
