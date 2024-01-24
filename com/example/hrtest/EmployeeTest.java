package com.example.hrtest;  		 //create a another package

import java.util.Scanner;

import com.example.hr.Employee;      //import statement for Employee class from package

public class EmployeeTest {  		 //create a employee class
     
    

	public static void main(String[] args) {
		Employee employee =new Employee();  //create a instance for employee class
		
		Scanner sc =new Scanner(System.in);   //get input from user using Scanner class
		
		System.out.println("Enter the Employee name:");
		employee.name=sc.next();
		System.out.println("Enter the Employee Salary:");
		employee.salary=sc.nextDouble();
		                      								 
		employee.printName();                                  //call the methods and print the values
		employee.printSalary();  
	
		

	}

}
