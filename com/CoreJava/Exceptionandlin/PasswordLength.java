package com.CoreJava.Exceptionandlin;

public class PasswordLength {
public static void Checkpass(String pass) //throws PasswordIsTooShort {
{
	try {
	if(pass.length()<8) {
		throw new PasswordIsTooShort("Password is too short");
	}}catch(Exception e) {
	System.out.println("Please try again ");
}}
public static void main(String[] args)// throws PasswordIsTooShort
{
	Checkpass("Arjun");
//	try {
//		Checkpass("Arjun");
//			
//		}catch(Exception e) {
//			System.out.println("Password incorrect please try again");
//		}
	}
}

