package Loops;

public class Prime100 {
public static void main(String[] args) {
	System.out.println("print 1 to 100 prime numbers");

  
	 for(int n=2;n<=100;n++) {
        int Count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                 Count ++;
            }
        }
        if (Count == 0) {
            System.out.print(n+"\n");
        }}
    }

}