/**
 * @author Atul Srivastav
 * @date 28/12/2021
 * Program to get counts of total coupons that can be generated using all the alphabets and 0-9 numbers
 */
package com.logicalprogram;
import java.math.BigInteger;
import java.util.Scanner;

public class CouponNumbers {
	public static void main(String[] args) {
		// making objedct of scanner class
		Scanner sc=new Scanner(System.in);
		//initializing vairables
		int totalCounts=1;
		//total symbols are 26 (a-z), 26 (A-Z) and 10 (0-9) which sums to 62. 
		int totalSymbols= 62;
		//taking coupon length as input
		System.out.println("Enter the length of coupon code: ");
		int couponLen=sc.nextInt();
		//applying permutation and combination logic to get all possible coupon counts
		for(int i=totalSymbols;i>totalSymbols-couponLen;i--)
		{			
			totalCounts=totalCounts*i;
		}
		//printing final output
		System.out.println("Total possible combinations are :"+totalCounts);
	}

}
