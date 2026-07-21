package Loops;
import java.util.Scanner;
public class Multiplesof5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int i=sc.nextInt();
	while(i<=50) {
		if(i%5==0){
			i++;
			continue;
		}
			System.out.println(i);
			i++;
		}
	sc.close();
	}
}
