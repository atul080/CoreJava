package com.logicalprogram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to get reverse of it: ");
		sb.append(sc.next());
		
		System.out.println("Reverse of the number is: "+ sb.reverse());
		
	}

}
 