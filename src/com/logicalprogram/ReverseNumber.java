/**
 * @author Atul Srivastav
 * @date 29/12/2021
 * Program to reverse a number.
 * @param number
 */
package com.logicalprogram;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		//making object of string builder class
		StringBuilder sb=new StringBuilder();
		//making an object of scanner class
		Scanner sc=new Scanner(System.in);
		//taking an number value as input
		System.out.println("Enter a number to get reverse of it: ");
		sb.append(sc.next());
		//printing the reversed number
		System.out.println("Reverse of the number is: "+ sb.reverse());
	}

}
 