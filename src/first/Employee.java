// 6. Write a Java program to create a class called "Employee" with a name, 
// job title, and salary attributes, and methods to calculate and update salary.  

package first;

public class Employee {
	
	String empName;
	String jobTitle;
	double salary;
	
	// Constructor
	
	public Employee(String empName, String jobTitle, Double salary) {
	
		this.empName = empName;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	// Get and set methods for employee name,job title and salary

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public double updateSalary(String jobTitle) {
		
		if(jobTitle.equals("Manager")) {
			salary = salary + (salary * 0.20) ;
		}
		return salary;
	}

	// Main method
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Adam", "Developer", 40000.00);
		Employee employee2 = new Employee("Bob", "Manager", 70000.00);
		
		// Printing employee details 
		
		System.out.println("Employee Name: "+ employee1.empName + "\nJob Title: "+ employee1.jobTitle +
				"\nSalary:" + employee1.salary);
		System.out.println("\nEmployee Name: "+ employee2.empName + "\nJob Title: "+ employee2.jobTitle +
				"\nSalary:" + employee2.salary);
		
		// Printing employee details after updating salary
		
		System.out.println("\nEmployee details after salary updation:\n");
		
		employee1.updateSalary(employee1.jobTitle);
		System.out.println("Employee Name: "+ employee1.empName + "\nJob Title: "+ employee1.jobTitle +
				"\nSalary:" + employee1.salary);
		
		employee2.updateSalary(employee2.jobTitle);
		System.out.println("\nEmployee Name: "+ employee2.empName + "\nJob Title: "+ employee2.jobTitle +
				"\nSalary:" + employee2.salary);
	}
}
