package com.corejava;

import java.util.Scanner;

public class Power {
    public static void main(String[] ar) {

        //making object of scanner class
        Scanner sc = new Scanner(System.in);

        //getting the range input from command line argument
        int n = Integer.parseInt(ar[0]);

        //calculating the power of 2 upto given input range
        if((n>=0)&&(n<31))
        {
            int i=1;
            while (i<=n)
            {
                System.out.println((int)Math.pow(2,i));
                i++;
            }

        }
        else
            System.out.println("Enter value less than 31 and greater than 0.");


    }
}
