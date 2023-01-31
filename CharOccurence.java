//5.wap to find out number of occurance of one alphabets.
package Thursday_lab;

import java.util.Scanner;

public class CharOccurence {

	public static void main(String[] args) 
	{
		String str;					//variables
		char a;
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter  a string");			//User input for string
		str=sc.nextLine();
		
		System.out.println("Enter Character to count Occurence");	//User input for character
		a=sc.next().charAt(0);
		
		//Searching character
		
		for(int i=0;i<str.length();i++)
		
		if(str.charAt(i)==a)
		{
			count++;			
		}
		
		System.out.println("The occurence of "+a+" in "+str+" is "+count+" times");		
	}
}
