package ifstatement;
import java.util.Scanner;
public class Trancation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int b=sc.nextInt();
	int a=sc.nextInt();
	boolean s=sc.nextBoolean();
	if(s) {
		if(b>=a) {
			System.out.println("transaction successfull");
		}
		else {
			System.out.println("indufficient balance");
		}
	}else {
		System.out.println("account blocked");
		sc.close();
	}
}
}
