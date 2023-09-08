package com.xwork.dto.app;

import java.io.Serializable;

public class NewspaperDTO implements Serializable {
	private String name;
	private String lang;
	private int pages;
	private double cost;

	public NewspaperDTO() {
		System.out.println("invoking NewspaperDTO in no_arg constructor");

	}

	public NewspaperDTO(String name, String lang, int pages, double cost) {
		super();
		this.name = name;
		this.lang = lang;
		this.pages = pages;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "NewspaperDTO [name=" + name + ", lang=" + lang + ", pages=" + pages + ", cost=" + cost + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
