package ifstatement;
import java.util.Scanner;
public class Security {
public static void main(String[] args) {
	int sec=1234;
	Scanner sc=new Scanner(System.in);
	boolean finger=sc.nextBoolean();
	boolean face=sc.nextBoolean();
	int s=sc.nextInt();
	if(finger) {
		if(face) {
			if(sec==s) {
				System.out.println("Accessed");
			}else {
				System.out.println("Invalid pin");
			}
		}else {
			System.out.println("invalid face");
		}
	}else {
		System.out.println("invalid finger");
	}
}
}