/**
 * @author Atul Srivastav
 * @date 29/12/2021
 * Program to calculate monthly compund interest.
 */
package com.functionaljavaprograms;
import java.util.Scanner;
public class MonthlyPayment {
    public static void main(String[] ar) {
        //making object of Scanner class.
        Scanner sc = new Scanner(System.in);
        //takig inputs to calculate compunt interest
        System.out.println("Enter Principal,Year and Rate to calculate payment in the givn order: ");
        int principal = sc.nextInt();
        int year= sc.nextInt();
        int rate= sc.nextInt();
        //calling monthlyPayment method of Utility class to calculate monthly CI.
        double payment=Utility.monthlyPayment(principal,year,rate);
        //printing final output
        System.out.println("Payment is: "+payment);
    }
}
