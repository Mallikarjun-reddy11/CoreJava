package Arrays;

public class Pattern2 {
    public static void main(String[] args) {

        int n = 5;
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
    }
}
