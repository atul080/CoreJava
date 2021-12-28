package com.logicalprogram;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//making object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking a number as input to check it is prime number or not
		System.out.println("Enter a number greater than 1. ");
		int n=sc.nextInt();
		
		boolean flag=true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				{
					flag=false;
					break;
				}
		}
		
		if(flag==true)
			System.out.println("It's a prime number.");
		else
			System.out.println("It's NOT a prime number.");
		
	}

}
