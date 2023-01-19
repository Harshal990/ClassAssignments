
//28-1-2022
package arrayexamples;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args)
	{
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		//initialization
		/*compile time
		arr[0]=2;
		arr[1]=3;
		*/
		
		//run time
		System.out.println("Enter 5 elements");
		for(int i=0;i<5;i++)		//i will indicate index
		{
			arr[i]=sc.nextInt();
		}
		//to print the values:
		System.out.println("5 elements are");
		
		for(int i=0;i<5;i++)		//i will indicate index
		{
			
			System.out.println("Element"+i+"="+arr[i]);
		}
		
		//print value using for-each loop
		//java foor-each loop prints the array elements one by one.
		//It holds an array elements in a variable,it executes the body of loop.
		
		System.out.println("printing elements using for each loop");
		for(int var: arr)	//34/56
		{
			System.out.println(var);
		}
		
		
		
		
		
		
	}
}






































/*
 
 //25-1-2022
package arrayexamples;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args)
	{
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		//initialization
		//compile time
		//arr[0]=2;
		//arr[1]=3;
		
		
		//run time
		System.out.println("Enter 5 elements");
		for(int i=0;i<5;i++)		//i will indicate index
		{
			arr[i]=sc.nextInt();
		}
		//to print the values:
		System.out.println("5 elements are");
		
		for(int i=0;i<5;i++)		//i will indicate index
		{
			
			System.out.println("Element"+i+"="+arr[i]);
		}
		
		//print value using for-each loop
		//java foor-each loop prints the array elements one by one.
		//It holds an array elements in a variable,it executes the body of loop.
		
	}
}

 
 
 
 
 
 */