package com.CoreJava.Threads;

public class MyThread extends Thread{
	public void run() {
		System.out.println("Program is running");
	}
public static void main(String[] args) {
	 MyThread t=new  MyThread();
	 Thread t1=new Thread(t);
	 System.out.println(t1.getState());
	 System.out.println("Thread created");
	 t1.start();
	 System.out.println("It is a runnable state ready to run the program");
	 try {
		 t1.sleep(4000);
	 }catch(InterruptedException e) {
		 t1.getStackTrace();
	 }
	 System.out.println("program completed");
}
}
