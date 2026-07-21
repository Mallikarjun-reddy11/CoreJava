package Arrays;

public class Ascending {
public static void main(String[] args) {
	int arr[]= {23,78,34,12};
	for (int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if (arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("Ascending order");
	for (int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
}
}
