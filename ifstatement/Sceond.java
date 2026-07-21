package ifstatement;
import java.util.Scanner;
public class Sceond {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Sceond largest number is :");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>b&&a<c) {
		System.out.println(" a is the second largest num");
	}else if (b>a&&b<c) {
		System.out.println("b is the second largset num ");
	}else{
		System.out.println("c is the largest num");
	}
	sc.close();
}
}