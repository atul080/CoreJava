package com.corejava;

import java.util.*;

public class Distance {
    public static void main(String[] ar) {

        //making object of scanner class
        Scanner sc = new Scanner(System.in);

        //taking inputs from command line argument
        System.out.println("Values of  X and Y are: "+ar[0]+", "+ar[1]);
        int x = Integer.parseInt(ar[0]);
        int y = Integer.parseInt(ar[1]);

        //calculating distance
        double distance=Math.sqrt((x*x)+(y*y));
        System.out.println("Ditance from origin is: "+distance);
    }

}
