/**
 * @author Atul Srivastav
 * @date 30/12/2021
 * Program to covert decimal to binary and  swapping binary reprentation.
 */
package com.functionaljavaprograms;
import com.functionaljavaprograms.ToBinary;
import java.util.Scanner;

public class Binary {
    public static void main(String[] ar) {
        //making object of scanner class
        Scanner sc = new Scanner(System.in);
        //taking decimal value input
        System.out.println("Enter a decimal number : ");
        int decVal = sc.nextInt();
        //calling ToBinary method by passing decimal value as argument to convert decimal to binary
        StringBuilder sb=ToBinary.toBinary(decVal);
        //appending '0' in begining if the binary representation is less than 8 in length
        while(sb.length()<8)
        {
            sb.insert(0,0);
        }
        System.out.println("Original representation: "+sb);
        //getting last 4 bytes of binary representation
        String subString=sb.substring(sb.length()-4);
        //getting first 4 bytes of binary representation
        String subString2=sb.substring(0,sb.length()-4);
        //printing final output as swapped binary bytes
        System.out.println("Swapped binary format is: "+subString+subString2);

    }
}
