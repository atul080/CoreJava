package com.corejava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] ar) {

        //making object of scanner class
        Scanner sc=new Scanner(System.in);

        //getting the input
        System.out.println("Enter the year: ");
        String year=sc.nextLine();

        //checking if year is a 4 digit number or not
        if(year.length()==4)
        {
            int yr=Integer.parseInt(year);

            //checking if it is leap year or not
            if(((yr%4==0)&&(yr%100!=0))||(yr%400==0))
            {
                System.out.println(yr+" is a leap year.");
            }
            else
                System.out.println("It's not a leap year. ");

        }
        else
            System.out.println("Enter a valid year.");
    }
}
