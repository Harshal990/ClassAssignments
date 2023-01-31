/*
 * package basicprogram;

import java.util.Scanner;

public class Salary_Calculation {
public static void main(String[] args) {
	
	Double Basic_salary,HRA,DA,Gross_salary;
	
	Scanner sc=new Scanner(System.in);				//Input from user
	System.out.println("Enter basic salary");
	Basic_salary=sc.nextDouble();
	
	if(Basic_salary<=10000) {						//case1 salary <=10000
		HRA=0.2*Basic_salary;
		DA=0.8*Basic_salary;
		Gross_salary=Basic_salary+HRA+DA;
		System.out.println(Gross_salary);
	}else if(Basic_salary<=20000) {					//case2 salary<=20000
		HRA=0.25*Basic_salary;
		DA=0.9*Basic_salary;
		Gross_salary=Basic_salary+HRA+DA;
		System.out.println(Gross_salary);
	}else if(Basic_salary>20000) {					//case3 salary>20000
		HRA=0.3*Basic_salary;
		DA=0.95*Basic_salary;
		Gross_salary=Basic_salary+HRA+DA;
		System.out.println(Gross_salary);
	}
	
	
}
}

*/

package basicprogram;

import java.util.Scanner;

public class Salary_Calculation {
public static void main(String[] args) {
	
	Double Basic_salary,HRA = null,DA = null,Gross_salary;
	
	Scanner sc=new Scanner(System.in);				//Input from user
	System.out.println("Enter basic salary");
	Basic_salary=sc.nextDouble();
	
	if(Basic_salary<=10000) {						//case1 salary <=10000
		HRA=0.2*Basic_salary;
		DA=0.8*Basic_salary;
		
	}else if(Basic_salary<=20000) {					//case2 salary<=20000
		HRA=0.25*Basic_salary;
		DA=0.9*Basic_salary;
		
	}else if(Basic_salary>20000) {					//case3 salary>20000
		HRA=0.3*Basic_salary;
		DA=0.95*Basic_salary;
		
	}
	
	Gross_salary=Basic_salary+ HRA + DA;
	System.out.println("The total salary is: "+Gross_salary);
}
}
