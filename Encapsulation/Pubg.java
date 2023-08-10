package com.encapsulation.in;

public class Pubg {
	private String OS;
	private String CPU;
	private int memory;
	private float direct;
	private int storage;
	private String network;
	private int players = 5;
	private String matchType;
	private double netSpeed;
	private String color;
	private int time;
	private String weapen;
	private String protection;
	private int noOfLife;

	public String getOS() {
		return this.OS;
	}

	public String getCPU() {
		return this.CPU;
	}

	public int getMemory() {
		return this.memory;
	}

	public float getDirect() {
		return this.direct;
	}

	public int getStorage() {
		return this.storage;
	}

	public String getNetwork() {
		return this.network;
	}

	public int getPlayers() {
		return this.players;
	}

	public String getMatchType() {
		return this.matchType;
	}

	public double getNetSpeed() {
		return this.netSpeed;
	}

	public String getColor() {
		return this.color;
	}

	public int getTime() {
		return this.players;
	}

	public String getWeapen() {
		return this.weapen;
	}

	public String getProtection() {
		return this.protection;
	}

	public int getNoOfLife() {
		return this.noOfLife;
	}

	// System.out.println("================================================================");
	public void setOS(String OS) {
		this.OS = OS;
	}

	public void setCPU(String CPU) {
		this.CPU = CPU;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public void setDirect(float direct) {
		this.direct = direct;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public void setPlayers(int players) {
		this.players = players;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public void setNetSpeed(double netSpeed) {
		this.netSpeed = netSpeed;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public void setWeapen(String weapen) {
		this.weapen = weapen;
	}

	public void setProtection(String protection) {
		this.protection = protection;
	}

	public void setNoOfLife(int noOfLife) {
		this.noOfLife = noOfLife;
	}
}
