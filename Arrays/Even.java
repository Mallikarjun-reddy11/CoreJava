package Arrays;

public class Even {
public static void main(String[] args) {
	int arr[]= {1,2,4,6,7,};
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]%2==0) {
			System.out.println(arr[i]);
		}
	}
}
}
