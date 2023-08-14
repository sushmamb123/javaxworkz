package com.xwork.abstractions;

public class NewMovie extends Movie {
	@Override
	public void name() {
		System.out.println("invoking name in NewMovie");
		super.name();
	}

	@Override
	public void producer() {
		System.out.println("invoking producer in NewMovie");
		super.producer();
	}

	@Override
	public boolean photographer() {
		System.out.println("invoking photographer in NewMovie");
		return super.photographer();
	}

	@Override
	public void director() {
		System.out.println("invoking director in NewMovie");
		super.director();
	}

	@Override
	public void music() {
		System.out.println("invoking music in NewMovie");
		super.music();
	}

	@Override
	public void trailer() {
		System.out.println("invoking trailer in NewMovie");

	}

	@Override
	public boolean story() {
		System.out.println("invoking story in NewMovie");
		return true;
	}

	@Override
	public boolean watch() {
		System.out.println("invoking watch in NewMovie");
		return false;
	}

	@Override
	public void theme() {
		System.out.println("invoking theme in NewMovie");

	}

	@Override
	public void inspiration() {
		System.out.println("invoking inspiration in NewMovie");

	}

}
