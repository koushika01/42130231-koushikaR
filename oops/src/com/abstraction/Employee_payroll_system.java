package com.abstraction;

abstract class Employee{

	 abstract void calculateSalary();
}

class FullTimeEmployee extends Employee{
	
	public int salary=10000;
	 void calculateSalary(){
	 salary*= 0.1;
		
		System.out.println("salary of full time employee: "+salary);
	}

}
class PartTimeEmployee extends Employee{
	public int salary=10000;
	 void calculateSalary(){
	 salary*= 0.05;
		
		System.out.println("salary of part time employee: "+salary);
	}
}
public class Employee_payroll_system {

	public static void main(String[] args) {
		
		 FullTimeEmployee e1=new  FullTimeEmployee();
		 e1.calculateSalary();
		 PartTimeEmployee e2=new  PartTimeEmployee();
		 e2.calculateSalary();
		 
	}

}
