package com.CoreJava.Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.print(sb);
		sb.append("java");
		System.out.println(sb);
		sb.append("Developer");
		System.out.println(sb);
		//reverse
		System.out.println(sb.reverse());
		//length
		System.out.println(sb.length());
		//String s="java";s.concat("developer");
		//System.out.println(s);
		//capacity
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("java Developer");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		//delete
		System.out.println(sb1);
		//System.out.println(sb1.delete(1, 6));
		//setCharAt
		sb1.setCharAt(1,'k');
		System.out.println(sb1);
	}
}
