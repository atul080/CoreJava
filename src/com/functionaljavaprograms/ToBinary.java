/**
 * @author Atul Srivastav
 * @date 30/12/2021
 * Program to convert decimal to binary
 */
package com.functionaljavaprograms;
import java.util.Scanner;
public class ToBinary {
    //making object of String Builder
    static StringBuilder sb=new StringBuilder();
    /*
    * making toBinary method to convert decimal to binary.
    * @param INTEGER
    * taking decimal value as input.
    * this method is called from main method.
    * */
    public static StringBuilder toBinary(int n)
    {
        while(n!=0) {
            int r = n % 2;
            n = n / 2;
            sb.append(r);
        }
        return sb;
    }
    public static void main(String[] ar) {
        //making object of scanner class
        Scanner sc = new Scanner(System.in);
        //taking decimal value as input
        System.out.println("Enter a decimal number to convert into binary: ");
        int decVal = sc.nextInt();
        //caliing toBinary method by passing input value
        toBinary(decVal);
        //printing final output
        System.out.println("Binary representation is: "+sb.reverse());
    }
}
