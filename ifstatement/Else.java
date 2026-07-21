package ifstatement;
import java.util.Scanner;

public class Else {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks:");
		int marks=sc.nextInt();
		char res;
		if(marks>=85) {
			res='A';
		}else if(marks>=75) {
				res='B';
		}else if(marks>=35) {
			res='c';
		}
		else {
			res='f';
		}
		System.out.println(res);
		sc.close();
		
	}
}
