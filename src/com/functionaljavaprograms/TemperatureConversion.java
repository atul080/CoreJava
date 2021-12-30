/**
 * @author Atul Srivastav
 * @date 28/12/2021
 * Program to convert temperature.
 */
package com.functionaljavaprograms;
import java.util.Scanner;
public class TemperatureConversion {
    /**
     * Asking user to enter choice and then Press ENTER.
     * By hitting ENTER  the user need to give temperature as input according to choice
     //* @param char
     */
    public static void main(String[] ar)
    {
        Scanner sc= new Scanner(System.in);
        double f,c;
        //giving option to user to select conversion type.
        System.out.println("Choose the type of conversion \n 1.Fahrenheit to Celcius \n 2.Celcius to Fahrenheit");
        int ch=sc.nextInt();
        // switch case to do appropriate action on basis of input
        switch (ch)
        {
            //case 1 when user enters 1 to convert Fahrenheit to Celcuis
            case 1:
                    System.out.println("Enter the fahrenheit temperature.");
                    f=sc.nextDouble();
                    c=(f-32) + 5/9;
                    System.out.println("Celcius temperature is: "+c);
                    break;
            //case 2 when user enters 2 to convert Celcuis to Fahrenheit
            case 2:
                    System.out.println("Enter the celcius temperature.");
                    c=sc.nextDouble();
                    f=((9*c)/5) + 32;
                    System.out.println("Fahrenheit temperature is: "+f);
                    break;
            default:
                    System.out.println("Invalid choice.");
        }
    }

    }
