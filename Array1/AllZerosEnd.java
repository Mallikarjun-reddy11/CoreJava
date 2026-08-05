package Array1;

public class AllZerosEnd {
	public static void main(String[] args) {
		int arr[] = { 2, 0, 6, 0, 7 };
		int resu[] = new int[arr.length];
		int index = 0;
		for (int num : arr) {
			if (num != 0) {
				resu[index++] = num;
			}
		}
		for (int num : resu) {
			System.out.print(num + " ");
		}
	}
}
