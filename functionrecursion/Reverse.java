package functionrecursion;

public class Reverse {
static int rev=0;
static int reverse(int n) {
	if(n==0) {
		return rev;
	}
	rev=rev*10+(n%10);
	return reverse(n/10);
	}
public static void main(String[] args) {
	int res=reverse(123);
	System.out.println(res);
}
}
