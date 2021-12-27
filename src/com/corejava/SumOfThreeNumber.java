package com.corejava;

import java.util.Scanner;

public class SumOfThreeNumber {
    public static void main(String[] ar) {

        //making object of scanner class
        Scanner sc = new Scanner(System.in);

        //taking array size as input
        System.out.println("Enter the size of the array: ");
        int arrSize = sc.nextInt();

        //declaring array of given input size
        int arrNum[]=new int[arrSize];
        String[] triplets=new String[arrSize];

        System.out.println("Enter "+arrSize+" elements for array: ");

        //taking all array elements
        for(int i=0;i<arrSize;i++)
        {
            arrNum[i]= sc.nextInt();;
        }

        //initializing count with 0
        int count=0;

        //calculating triplets
        for(int i=0;i<arrSize-2;i++)
        {
            for(int j=i+1;j<arrSize-1;j++)
            {
                for(int k=j+1;k<arrSize;k++)
                {
                    if((arrNum[i]+arrNum[j]+arrNum[k])==0)
                    {
                       triplets[count++]=arrNum[i]+", "+arrNum[j]+", "+arrNum[k];

                    }

                }

            }
        }

        //printing number of triplets
        System.out.println("Total Number of triplets are: "+count+"\nAnd triplets are: ");

        //printing all th triplets
        for(String trpl:triplets)
        {
            if(trpl!=null)
                System.out.println(trpl);
        }

    }
}
