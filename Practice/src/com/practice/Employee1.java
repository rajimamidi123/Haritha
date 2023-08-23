package com.practice;

public class Employee1 {
	public int employee1Id;
	public String employee1Name;
	public int employee1Salary;
	public double fullSalary;

	public String displayDetails(int employee1Id, String employee1Name, int employee1Salary) {
		fullSalary=employee1Salary*1.5;
		 String displayDetails =  String.valueOf(employee1Id).concat(" ") +employee1Name.concat(" ")+String.valueOf(fullSalary);
		 
		return displayDetails;
	}
}
