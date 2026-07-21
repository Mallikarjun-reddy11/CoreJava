package Arrays;

public class Leftangle {
public static void main(String[] args) {
	int n=4;
	int star=n;
	int space=n-1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print("");
		}
		for (int k=1;k<=star;k++) {
			System.out.print("*");
		}
		System.out.println(" ");
		star--;
		space++;

	}
}
}
