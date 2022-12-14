// if I want to return only id from employee class.

package com.methods;

public class Employee3 {
	int id;
	
	Employee3(int id){
		this.id= id;
	}
	
	public static Employee3 getEmployee() {
           	int id = 10;
		return new Employee3(id);
	}
	public static void main(String[] args) {
		Employee3 emp = getEmployee() ;
		System.out.println(emp.id);
	}
}