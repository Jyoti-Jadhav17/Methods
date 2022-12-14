// program if we want to return the object 
//Sysout(emp) then without toString method output is com.methods.Employee2@7852e922
// when we use toString method we get proper representation of object
package com.methods;

public class Employee2 {
	int id = 101;
	String str = "Velocity";
	String city = "Pune";
	
	
	public Employee2 addEmployeeDetails() {
		Employee2 emp =  new Employee2();
		System.out.println(emp);
		return emp;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", str=" + str + ", city=" + city + "]";
	}
	public static void main(String[] args) {
		Employee2 emp =  new Employee2();
		emp.addEmployeeDetails();
	}
}
