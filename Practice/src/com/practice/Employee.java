package com.practice;

public class Employee {
	private int eId;
	private String eName;
	private double eExperience;
	private int basicSalary;
	private double fullSalary;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteExperience() {
		return eExperience;
	}

	public void seteExperience(double eExperience) {
		this.eExperience = eExperience;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getFullSalary() {
		return fullSalary;
	}

	public void setFullSalary(double fullSalary) {
		this.fullSalary = fullSalary;
	}

}
