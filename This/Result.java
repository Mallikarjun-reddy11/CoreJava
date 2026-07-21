package This;

import java.util.Scanner;

public class Result {
	int m1, m2, m3, m4, m5;
	double average;
	double total;
	String grade;

	public void acceptmarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Subject 1 marks: " + m1);
		m1 = sc.nextInt();
		System.out.println("Subject 2 marks: " + m2);
		m2 = sc.nextInt();
		System.out.println("Subject 3 marks: " + m3);
		m3 = sc.nextInt();
		System.out.println("Subject 4 marks: " + m4);
		m4 = sc.nextInt();
		System.out.println("Subject 5 marks: " + m5);
		m5 = sc.nextInt();
	}

	public void total() {
		total = m1 + m2 + m3 + m4 + m5;

	}

	public void average() {
		average = total/ 5.0;
	}

	public void grade() {
		if (average >= 90)
			grade = "A+";
		else if (average >= 80)
			grade = "A";
		else if (average >= 70)
			grade = "B";
		else if (average >= 60)
			grade = "c";
		else
			grade = "fail";

	}

	public void displayResult() {
        System.out.println("\n----- RESULT -----");
        System.out.println("Subject 1 = " + m1);
        System.out.println("Subject 2 = " + m2);
        System.out.println("Subject 3 = " + m3);
        System.out.println("Subject 4 = " + m4);
        System.out.println("Subject 5 = " + m5);

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Grade = " + grade);

	}

public static void main (String []args) {
	Scanner sc=new Scanner (System.in);
	Result r=new Result();
	r.acceptmarks();
	r.total();
	r.average();
	r.grade();
	r.displayResult();
}
}
	