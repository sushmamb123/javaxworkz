package com.sush.method.run;

import com.sush.method.RunTime;

public class RunTimeRunner {

	public static void main(String[] args) {
		RunTime runTime = new RunTime();
		boolean ref = runTime.equals("run");
		System.out.println(ref);
		Class ref1 = runTime.getClass();
		System.out.println(ref1);
		int ref2 = runTime.hashCode();
		runTime.notify();
		runTime.notifyAll();
		String ref3 = runTime.toString();
		System.out.println(ref3);
	}
}
