package com.CoreJava.Threads;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		System.out.println("thread is running");
		
	}
	public static void main(String[] args) {
		 MyThread1 t1=new  MyThread1();
		 Runnable r=new Thread(t1);
		 ((Thread)r).start();
		 System.out.println("It is runnable state");
		 try {
		((Thread)r).sleep(4000);
		 }catch(InterruptedException e) {
			 e.getStackTrace();
		 }
		 System.out.println("Program completed");
	}
	

}
