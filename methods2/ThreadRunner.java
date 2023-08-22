package com.sush.method.runner;

public class ThreadRunner {

	public static void main(String[] args) {
		Thread thread = new Thread();
		Class<? extends Thread> ref = thread.getClass();
		System.out.println(ref);
		StackTraceElement[] ref1 = thread.getStackTrace();
		System.out.println(ref1);
		int get = thread.getPriority();
		System.out.println(get);
		boolean is = thread.isDaemon();
		System.out.println(is);
		String ref2 = thread.getName();
		System.out.println(ref2);
	}

}
