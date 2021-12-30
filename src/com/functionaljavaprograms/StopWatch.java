/**
 * @author Atul Srivastav
 * @date 28/12/2021
 * Program to get elapsed time between start and stop time.
 * Asking user to enter character and then Press ENTER.
 * By hitting ENTER  the Stopwatch starts and stop..
 */
package com.functionaljavaprograms;
import java.util.Scanner;
import com.functionaljavaprograms.Utility;
public class StopWatch {
    public static void main(String[] ar)
    {
        //making object of scanner class
        Scanner sc=new Scanner(System.in);
        //Asking user to start or stop the Stopwatch
        System.out.println("Press any character and press ENTER to START the stopwatch");
        char startCh=Utility.getUserChar();
        long start=System.currentTimeMillis();
        System.out.println("Press any character and press ENTER to END the stopwatch");
        char stopCh=Utility.getUserChar();
        long stop=System.currentTimeMillis();
        //calculating elapsed time
        float timeElapsed=(float) (stop-start)/1000;
        System.out.println("Time = " + timeElapsed +" Seconds");
    }
}

