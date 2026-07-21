package Arrays;

public class UpperTriangle {
public static void main(String[] args) {
	int n=5;
	int stars=1;
	int spaces=n-stars;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=spaces;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=stars;k++) {
			System.out.print("*");
		}
		System.out.println();
		stars+=2;
		spaces--;
	}
	stars=2*n-3;
	spaces=1;
	for(int i=1;i<=n-1;i++) {
		for(int j=1;j<=spaces;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=stars;k++) {
			System.out.print("*");
		}
		System.out.println();
		stars-=2;
		spaces++;
}}
}
