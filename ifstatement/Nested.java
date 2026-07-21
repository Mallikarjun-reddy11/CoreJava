package ifstatement;
import java.util.Scanner;
public class Nested {
	public static void main(String[] args) {
		String name="mallikarjun";
		int password=4545;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username:");
		String uname=sc.next();
		System.out.println("enter password:");
		int upw=sc.nextInt();
		if(name.equals(uname)) {
			if(password==upw){
		System.out.println("login successfully");
		
	}
			else {
				System.out.println("login filed");
			}
			
		}else {
				System.out.println("invalid");
			}
		}
	}

