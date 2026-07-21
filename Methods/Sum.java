package Methods;
import java.util.Random;
public class Sum {
public int add(int a, int b) {
	Random rm=new Random();
	a=rm.nextInt(10);
	 b=rm.nextInt(10);
	return a+b;
	
}
public static void main(String[] args) {
	Sum s=new Sum();
	int sum=s.add(0, 0);
	System.out.println(sum);
}
}
