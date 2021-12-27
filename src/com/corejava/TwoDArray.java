package com.corejava;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking size of array as input
		System.out.println("Enter the size of array. (First rows then columns)");
		int M=sc.nextInt();
		int N=sc.nextInt();
		
		//Array declaration of M*N size
		int[][] arr = new int[M][N];
		
		//looping to get elements of array
		System.out.println("Enter the array elements.");
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
				arr[i][j]=sc.nextInt();
		}
		
	    PrintWriter writer = new PrintWriter(System.out);    
	    
	    for(int i=0;i<M;i++)
	    {
	    	for(int j=0;j<N;j++)
	    		writer.write(arr[i][j]+" ");
	    	writer.write("\n");

	    }
	    
		writer.flush();  
		
		
	}

}
