/**
 * @author Atul Srivastav
 * @date 28/12/2021
 * Utility class for several utility related methods
 */
package com.functionaljavaprograms;
import java.util.Scanner;
public class Utility {
    /**
     *  Scanner which can parse primitive types and strings
     */
    private static final Scanner scan = new Scanner(System.in);
    /**
     * Scanning of user input which is string type.
     * @return the first character.
     */
    public static char getUserChar()
    {
        return scan.next().charAt(0);
    }
    /**
     * Scanning of user input which is integer type.
     * @return the scanned integer value.
     */
    public static int getUserInteger()
    {
        return scan.nextInt();
    }
    /**
     * dayOfWeek method which takes @param month(m),day(d) and year(y) as input.
     * Finding weekday using GREGORIAN calendar formula
     * @return the weekday on that particular given date.
     */
    public static String dayOfWeek(int m,int d,int y)
    {
        int y1=y-(14-m)/12;
        int x=y1+(y1/4)-(y1/100)+(y1/400);
        int m1=m+12*((14-m)/12)-2;
        int d1=(d+x+(31*m1)/12)%7;
        switch(d1)
        {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
        }
        return "";
    }
    /**
     * monthlyPayment method to calculate MONTHLY COMPOUND INTEREST.
     * /@param takes INT principal, INT year and INT rate for calculating CI.
     * @return the Compound interest as DOUBLE.
     */
    public static double monthlyPayment(int principal,int year,int rate)
    {
        int n= 12*year;
        double r=(double)rate/(12*100);
        double payment=(double)(principal*Math.pow((1+r),n));
        return payment-principal;
    }
}
