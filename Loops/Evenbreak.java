package Loops;
import java.util.Scanner;

public class Evenbreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean found = false;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("First even number: " + num);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No even number entered.");
        }

        sc.close();
    }
}