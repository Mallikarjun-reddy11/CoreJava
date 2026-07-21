package Array1;

public class Average {
	public static void main(String[] args) {
int arr[]= {2,3,4,5};
int sum=0;
double average;

for (int i=0;i<arr.length;i++) {
	sum=sum+arr[i];
}
average=(double)sum/arr.length;
System.out.println("Average: "+average);
}
}