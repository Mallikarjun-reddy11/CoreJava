package ifstatement;
import java.util.Scanner;

public class Patient {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("enter the remp");
		int body=sc.nextInt();
		System.out.println("enter oxygen levels");
		int oxygen=sc.nextInt();
		if(oxygen<90) {
			System.out.println("Emergency");
		}else if(body>102&&age>60) {
			System.out.println("High priority");
		}else {
			System.out.println("normal priority");
		}
	}

}
