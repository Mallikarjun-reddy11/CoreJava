package functionrecursion;

public class Prime {
static boolean p(int n, int divn ) {
	if(n==divn) {
		return true;
	}if(n%divn==0) {
		return false;
	}
	return p(n,++divn);
}
public static void main(String[] args) {
	boolean res=p(3,2);
	if(res) {
		System.out.println("Prime number");
	}
	else {
		System.out.println("Not prime ");
	}
}
}
