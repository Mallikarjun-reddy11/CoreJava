package com.CoreJava.Exceptionandlin;

public class AttendenceValidation {
public static void Attendence(int percentage) throws AttendenceLow {

		if(percentage<75) {
			throw new AttendenceLow("You cannot write the exam");
			
//		}}catch(AttendenceLow e) {
//			System.out.println("");
		}else {
			System.out.println("You can write the final exam");
		}
		}
	
public static void main(String[] args) throws AttendenceLow{
	try {
	Attendence(74);
} catch(AttendenceLow e) {
	System.out.println(e.getMessage());
}
}}

