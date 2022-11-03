/*
 * 
 * package basicprogram;
 

public class LoopDemo {
	public static void main(String [] args) {
		int i;
		for(i=15;i>=1;i--)
		{
			System.out.println(i);      //5  4  3  2  1
			}
	}

}
*/



//wap to print all odd numbers between 1 to 50



/*
package basicprogram;
 

public class LoopDemo {
	public static void main(String [] args) {
		
		int i;
		for(i=1;i<=50;i++)
		{
			if(i%2==1)
			System.out.println(i);
		}
	}
}



package basicprogram;
 

public class LoopDemo {
	public static void main(String [] args) {
		
		int i;
		for(i=1;i<=50;i=i+2)
		{
			
			System.out.println(i);
		}
	}
}
*/


package basicprogram;

import java.util.Scanner;

public class LoopDemo {
	public static void main(String [] args) {
		
		int i,n,sum=0;
		Scanner uin=new Scanner(System.in);
		System.out.println("Enter Natural number");
		n=uin.nextInt();
		
		for(i=1;i<=n;i++) {
			sum=sum+i;		//sum+=i
		}
		System.out.println("Sum of natural numbers from 1 to"+n+"is:"+sum  );
		uin.close();
	}
}










