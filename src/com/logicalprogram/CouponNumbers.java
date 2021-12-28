package com.logicalprogram;

import java.math.BigInteger;
import java.util.Scanner;

public class CouponNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int totalCounts=1;
		int totalSymbols= 62;
		System.out.println("Enter the length of coupon code: ");
		int couponLen=sc.nextInt();
		
		
		for(int i=totalSymbols;i>totalSymbols-couponLen;i--)
		{			
			totalCounts=totalCounts*i;
		}
		
	System.out.println("Total possible combinations are :"+totalCounts);
		

	}

}
