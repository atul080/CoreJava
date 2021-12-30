/**
 * @author Atul Srivastav
 * @date 30/12/2021
 * Program to generate fibonacci series for given input range by user.
 * @param int 
 */
package com.logicalprogram;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		//making object of scanner class
		Scanner sc=new Scanner(System.in);
		//taking range of fibonacci series as input
		System.out.println("Enter the range of fibonacci series (greater than 0).");
		int n=sc.nextInt();
		//initializing variables		
		int a=0;
		int b=1;
		int sum=0;
		//printing fibonacci series on basis of given input
		System.out.println("Fibonacci series for given range is: ");
		if(n==1)
			System.out.println(a);
		else if(n==2)
		{
			System.out.println(a + "\n" +b);
		}
		else
		{	//if range is more than 2 then coming to this else.	
			System.out.println(a + "\n" +b);
			//looping to print series for given input
			for(int i=2;i<=n;i++)
			{
				sum=a+b;
				System.out.println(sum);
				a=b;
				b=sum;
			}
		}
	}

}
