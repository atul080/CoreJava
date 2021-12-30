package com.functionaljavaprograms;

import java.util.Scanner;

/**
 * @author Atul Srivastav
 * @date 30/12/2021
 * Program to check weekday according to the input date.
 */
public class DayOfWeek {
    public static void main(String[] ar) {
        //making object of scanner class
        Scanner sc = new Scanner(System.in);
        //taking inputs month,day, year and expecting user will enter valid date
        System.out.println("Enter the date in following order in numeric format: \n1.Month \n2.Day \n3.Year(YYYY) ");
        int month = sc.nextInt();
        int day= sc.nextInt();
        String year= sc.next();
        //checking year is in correct format or not.
        if(year.length()==4) {
            int yr=Integer.parseInt(year);
            //calling dayOfWeek method of Utility class to get weekDay by passing the date variables.
            String wkDay = Utility.dayOfWeek(month, day, yr);
            //printing final output
            System.out.println(month + "/" + day + "/" + year + " falls on " + wkDay);
        }
        else
        {   //if year is not valid then exiting the program
            System.out.println("Please Enter year in YYYY format.");
            System.exit(0);
        }
    }
}
