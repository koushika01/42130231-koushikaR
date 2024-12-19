package com.inheritance;

class Person{
	String name;
	int age;
	Person(){
		
	}
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void displayInfo(){
		System.out.println("NAME: "+this.name);
		System.out.println("AGE: "+this.age);
	}
}
class Teacher extends Person{
	String subject;
	int salary;
	Teacher  (){
		super();
	}
	
	Teacher (String name,int age,String subject,int salary){
		super( name, age);
		this.subject=subject;
		this.salary=salary;
	}
	void displayTeacherInfo(){
		System.out.println("NAME: "+super.name);
		System.out.println("AGE: "+super.age);
		System.out.println("SUBJECT: "+this.subject);
		System.out.println("SALARY: "+this.salary+"\n");
	}
	void calaculateAnnualSalary(){
		int annualSalary=this.salary*12;
		System.out.println("ANNUAL SALARY: "+annualSalary+"\n");
	}
}
class Student extends Person{
	char grade;
	int studentId;
	
	Student  (){
		super();
	}
	
	Student (String name,int age,char grade,int studentId){
		super( name, age);
		this.grade=grade;
		this.studentId=studentId;
	}
		void displayStudentInfo(){
			System.out.println("NAME: "+super.name);
			System.out.println("AGE: "+super.age);
			System.out.println("grade: "+this.grade);
			System.out.println("studentId: "+this.studentId+"\n");
		}	
		void calaculateGrade(){
			if (grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='E'){
				System.out.println("RESULT: pass");
			}
			else{
				System.out.println("RESULT: fail");
			}
			
		}
	
}
public class School_management_system {

	public static void main(String[] args) {
		Teacher t1=new Teacher("koush",24,"maths",10000);
		t1.displayTeacherInfo();
        t1. calaculateAnnualSalary();
        Student s1=new Student("kavya",19,'B',43635);
        s1.displayStudentInfo();
        s1.calaculateGrade();
	}

}
