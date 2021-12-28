package com.logicalprogram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//making object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking range of fibonacci series as input
		System.out.println("Enter the range of fibonacci series (greater than 0).");
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		int sum=0;
		
		//printing fibonacci series
		System.out.println("Fibonacci series for given range is: ");
		if(n==1)
			System.out.println(a);
		else if(n==2)
		{
			System.out.println(a + "\n" +b);
		}
		else
		{
			System.out.println(a + "\n" +b);
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
