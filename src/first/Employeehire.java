// 9. Write a Java program to create a class called "Employeehire" with a name, salary, 
// and hire date attributes, and a method to calculate years of service.  

package first;

import java.time.LocalDate;
import java.time.Period;

public class Employeehire {
	private String empName;
	double empSalary;
	private LocalDate hireDate;
	
	// Constructor

	public Employeehire(String empName, double empSalary, LocalDate hireDate) {

		this.empName = empName;
		this.empSalary = empSalary;
		this.hireDate = hireDate;
	}

	// Get and Set methods for employee name,employee salary and hire date
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	// Method to calculate years of service
	
	public int calculateYearsofService() {
		
		int numberofYears = 0;
		
		// If loop to check if hire date is before current date, then calculate number of years
		
		if (hireDate.isBefore(LocalDate.now())) {
			
		numberofYears = Period.between(hireDate,LocalDate.now()).getYears();
		}
		
		return numberofYears;
	}
	
	// Main method
	
	public static void main(String[] args) {
	
		// Adding employees
		
		Employeehire employee1 = new Employeehire("Adam Scheffler",50000.00,LocalDate.parse("2013-01-07"));
		Employeehire employee2 = new Employeehire("Tommy Hilfiger",78000.00,LocalDate.parse("2024-01-04"));
		Employeehire employee3 = new Employeehire("Kate Spade",78000.00,LocalDate.parse("2010-12-01"));
		
		// Printing employee details along with number of years of service
		
		System.out.println("Employee Name: " +employee1.empName + "\tEmployee Salary: "+ employee1.empSalary + "\tHire Date: "+ employee1.hireDate+
				"\tYears of service:" + employee1.calculateYearsofService());
		
		System.out.println("\nEmployee Name: " +employee2.empName + "\tEmployee Salary: "+ employee2.empSalary + "\tHire Date: "+ employee2.hireDate+
				"\tYears of service:" +employee2.calculateYearsofService());
		System.out.println("\nEmployee Name: " +employee3.empName + "\tEmployee Salary: "+ employee3.empSalary + "\tHire Date: "+ employee3.hireDate+
				"\tYears of service:" +employee3.calculateYearsofService());
	}

}
