package ifstatement;
import java.util.Scanner;

public class Tax {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the amount");
	int i=sc.nextInt();
	if(i>=400000) {
		System.out.println("No tax");
	}else if(i<=800000){
		System.out.println("tax amount:"+i*(5.0/100.0));
	}else if(i<=1200000) {
		System.out.println("tax amount:"+i*(10.0/100.0));
	}else if(i<=2000000) {
		System.out.println("tax amount:"+i*(20.0/100.0));
	}else {
		System.out.println("tax amount:"+i*(30.0/100.0));
	}
}
}
