package com.logicalprogram;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//making object of scanner class
				Scanner sc=new Scanner(System.in);
				
				//taking a number as input to check it is perfect number or not
				System.out.println("Enter a number.");
				int n=sc.nextInt();
				
				int sum=0;
						
				for(int i=1;i<n;i++)
				{
					if(n%i==0)
						sum=sum+i;
				}
				if(sum==n)
					System.out.println("It is a perfect number.");
				else
					System.out.println("It is NOT a perfect number.");

	}

}
