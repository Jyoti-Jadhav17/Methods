package com.methods;

public class Employee4 {
	int id;
	String str;
	String city;

	public Employee4(int id, String str, String city) {

		this.id = id;
		this.str = str;
		this.city = city;
	}

	public static Employee4 getEmployee() {
		int id = 101;
		String str = "Ram";
		String city = "Pune";
		return new Employee4(id, str, city);
	}

	public static void main(String[] args) {
		Employee4 emp = getEmployee();
     System.out.println(emp.id);
     System.out.println(emp.str);
     System.out.println(emp.city);
	}

	
}
