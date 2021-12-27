package com.corejava;

import java.util.*;
public class FlipCoin {
    public static void main(String[] ar)
    {
             //making object of scanner class
            Scanner sc=new Scanner(System.in);

            //taking input
            System.out.println("Enter number of flips you want.");
            int numberOfFlips=sc.nextInt();

            //initializing the head and tail counts with 0
            int headCount=0;
            int tailCount=0;

            //making object of random function
            Random rm= new Random();

            //fliping the coin to get the head and tail
            if(numberOfFlips>0) {
                for (int i = 0; i < numberOfFlips; i++) {
                    int coinVal = rm.nextInt(2);

                    if (coinVal == 0) {
                        headCount++;
                    } else
                        tailCount++;
                }

                //calculating the percentage of heads and tails
                float headPer = (float) headCount / numberOfFlips * 100;
                float tailPer = (float) tailCount / numberOfFlips * 100;

                System.out.println("Head percentage is: " + headPer + " and Tail percentage is: " + tailPer);
            }
            else
                System.out.println("Enter positive number");
    }

}
