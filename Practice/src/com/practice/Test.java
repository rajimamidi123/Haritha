package com.practice;

public class Test {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.eExperience = 1.5;
		employee.basicSalary = 30000;
		employee.fullSalary(employee.eExperience, employee.basicSalary);
		System.out.println(employee.fullSalary(employee.eExperience, employee.basicSalary));

		Employee1 employee1 = new Employee1();
		employee1.employee1Id = 11;
		employee1.employee1Name =  "Raji";
		employee1.employee1Salary = 30000;
		employee1.displayDetails(employee1.employee1Id, employee1.employee1Name, employee1.employee1Salary);

		System.out.println(employee1.displayDetails(employee1.employee1Id, employee1.employee1Name, employee1.employee1Salary));

	}
}