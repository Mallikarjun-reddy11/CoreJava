package ifstatement;
import java.util.Scanner;
public class Scholarship {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float c=sc.nextFloat();
	int p=sc.nextInt();
	int i=sc.nextInt();
	if(c>=8.5) {
		if(p>=85) {
			if(i<300000) {
				System.out.println("Scholarship aearded");
			}else {
				System.out.println("high income");
				
			}
		}else {
			System.out.println("low attendence");
		}
	}else {
		System.out.println("low cgpa");
	}
}
}
