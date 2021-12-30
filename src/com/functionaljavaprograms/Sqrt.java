/**
 * @author Atul Srivastav
 * @date 29/12/2021
 * Program to cnvert temperature.
 */
package com.functionaljavaprograms;
import java.util.Scanner;
public class Sqrt {
    /*
     *  Making Sqrt method to calculate square root of given number.
     *  @param Passing an non-negative INTEGER.
     *  It is being called from main method.
     */
    public static void sqrt(int n)
    {
        //initializing value of epsilon in eps variable
        double eps = 1e-15;
        int t=n;
        //looping to calculate the square root of the given input.
        while(Math.abs(t-(n/t))>eps)
        {
            t=((n/t)+t)/2;
        }
        //prinitng the final output.
        System.out.println(t);
    }

    public static void main(String[] ar) {
        //making object of scanner class
        Scanner sc = new Scanner(System.in);
        //taking an poitive integer as input
        System.out.println("Enter a non negative value: ");
        int n = sc.nextInt();
        //calling sqrt method and passing the INTEGER value
        sqrt(n);
    }
}
