package Loops;
import java.util.Scanner;
public class Negativebreak {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");

	while(true) {
		int n=sc.nextInt();
		if (n<0) break;
			System.out.println(n);
	}
	System.out.println("program ended");
}
}
