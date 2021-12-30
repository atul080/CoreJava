/**
 * @author Atul Srivastav
 * @date 28/12/2021
 * Program to check if given input number is perfct number or not.
 * @param INT
 */
package com.logicalprogram;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
				//making object of scanner class
				Scanner sc=new Scanner(System.in);	
				//taking a number as input to check it is perfect number or not
				System.out.println("Enter a number.");
				int n=sc.nextInt();
				//initializing a variable
				int sum=0;
				/*
				* looping to check if the number is perfect number or not i.e., getting factors and adding it. 
				* If sum is equal to the input number then its a perfect number.		
				*/
				for(int i=1;i<n;i++)
				{
					if(n%i==0)
						sum=sum+i;
				}
				//checking the sum with given input number. If it is equal then printing it as perfect number.
				if(sum==n)
					System.out.println("It is a perfect number.");
				else
					System.out.println("It is NOT a perfect number.");
	}

}
