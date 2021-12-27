package com.corejava;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//getting input from command line arguments
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		
		//calculating wind chill by assuming that given inputs are within range
		double windChill = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16);
		
		//printing output
		System.out.println("The wind chill for given temperature and wind speed is: " + windChill +"*F");
		
	}

}
