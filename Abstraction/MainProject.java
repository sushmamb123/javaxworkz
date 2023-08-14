package com.xwork.abstractions;

public class MainProject extends Project{
	@Override
	public boolean model() {
		System.out.println("invoking model in MainProject");
		return false;
	}
	@Override
	public boolean name() {
		System.out.println("invoking name in MainProject");
return false;
	}
	@Override
	public void phase1() {
		System.out.println("invoking phase1 in MainProject");
		
	}
	@Override
	public boolean synopsis() {
		System.out.println("invoking synopsis in MainProject");
		return false;
	}
	@Override
	public void report() {
		System.out.println("invoking report in MainProject");
		
	}
	@Override
	public void instruments() {
		System.out.println("invoking instruments in MainProject");
super.instruments();
	}
	@Override
	public void theme() {
		System.out.println("invoking theme in MainProject");
		super.theme();
	}
	@Override
	public void list() {
		System.out.println("invoking list in MainProject");
		super.list();
	}
	@Override
	public boolean working() {
		System.out.println("invoking working in MainProject");
		return super.working();
	}
	@Override
	public void tittle() {
		System.out.println("invoking title in MainProject");
		super.tittle();
	}
	

}
