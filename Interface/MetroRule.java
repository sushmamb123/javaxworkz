package com.xwork.inter;

public interface MetroRule {
	public abstract void run(String metroName);

	public abstract boolean stop();

	public abstract int speed(int distance);

}