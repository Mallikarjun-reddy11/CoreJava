package Arrays;

public class Pattern3 {
	public static void main(String[] args) {

		int n = 4;
        int spaces = n - 1;
        int stars = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= stars; k++) {
                System.out.print("* ");
            }

            System.out.println();

            spaces--;
            stars++;
        
	}


        spaces = 1;
        stars =n- 1;

        for (int i = 1; i <= n-1; i++) {

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= stars; k++) {
                System.out.print("* ");
            }

            System.out.println();

            spaces++;
            stars--;
	}}}
