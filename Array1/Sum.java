package Array1;

public class Sum {
public static void main(String[] args) {
	int arr[]= {1,3,4,5};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		
	}
	double avg=sum/arr.length;;
	System.out.println("Sum: "+sum+"\n"+"Average: "+avg);
}
}
