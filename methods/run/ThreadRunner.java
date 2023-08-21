package com.sush.method.run;

import java.lang.Thread.State;

public class ThreadRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ThreadRunner");
		Thread thread = new Thread();
		thread.checkAccess();
		String ref = thread.getName();
		System.out.println(ref);
		long ref1 = thread.getId();
		System.out.println(ref1);
		int ref2 = thread.getPriority();
		StackTraceElement[] ref3 = thread.getStackTrace();
		System.out.println(ref3);
		State ref4 = thread.getState();
		boolean ref5=thread.interrupted();
		System.out.println(ref5);
		int ref6=thread.MIN_PRIORITY;
		System.out.println(ref6);
		int ref7=thread.activeCount();
		System.out.println(ref7);
		int ref8=thread.enumerate(null);
		System.out.println(ref8);
		int ref9=thread.activeCount();
		System.out.println(ref9);
	}

}
		

