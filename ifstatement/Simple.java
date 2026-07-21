package ifstatement;
import java.util.Scanner;
public class Simple {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your marks:");
		int marks=sc.nextInt();
		if(marks>=35) {
			System.out.println("res:pass");
		}else {
			System.out.println("res:fail");
		}
		System.out.println("completed my program");
	}

}
