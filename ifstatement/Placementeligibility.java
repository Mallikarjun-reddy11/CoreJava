package ifstatement;
import java.util.Scanner;
public class Placementeligibility {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter cgpa:");
	float c=sc.nextFloat();
	System.out.println("enter backlogs");
	int b=sc.nextInt();
	System.out.println("enter communication score:");
	int s=sc.nextInt();
	System.out.println("enter apititude score:");
	int a=sc.nextInt();
	if(b>=1) {
			System.out.println("not eligible");
	}else if(b==0) {
		if(c>=7.5) {
			if(s>=10&&a>=20)
			System.out.println("Eligible for placements");
		}
		
	}else {
		System.out.println("Eligible for Written test");
	}
}
}
