package ifstatement;
import java.util.Scanner;
public class Gradeswitch {
public static void main(String[] args) {
	System.out.println("Enter the grade");
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	switch(ch) {
	case'A':System.out.println("Excellent");
	break;
	case 'B':System.out.println("Very good");
	break;
	case 'C':System.out.println("Good");
	break;
	case 'D':System.out.println("needs improvement");
	break;
	case 'F':System.out.println("fail");
	break;
	case 'g':System.out.println("Invalid grade");
	}
}
}
