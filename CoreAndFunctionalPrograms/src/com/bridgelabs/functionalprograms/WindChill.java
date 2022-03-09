package com.bridgelabs.functionalprograms;

import java.util.Scanner;

public class WindChill {
	public static String windChill() {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter Temperature : ");
        double temperature = src.nextDouble();
        System.out.println("Enter Wind Speed : ");
        double v_WindSpeed = src.nextDouble();
        double pow = Math.pow(v_WindSpeed, 0.16);
        if (temperature < 50 && v_WindSpeed > 3 && v_WindSpeed < 120) {
            double wind = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * pow;
            System.out.println("WindChill is = " + wind);
        } else {
            System.out.println("Temperature should be less than 50 and wind speed should be greater than 3 and less than 120");
        }
        src.close();
        return temperature + " " + v_WindSpeed;
    }

    public static void main(String args[]) {
        windChill();
    }
}