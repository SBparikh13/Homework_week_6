package week6homework;

import java.util.Scanner;

/* Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C)./**

 */
public class Programme7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The temperature in Fahrenheit is: ");
        int f = scanner.nextInt();
        double c= 5 *(f - 32.0) / 9;
        Programme7 obj = new Programme7();// called instance method to main method
        obj.celsius(c);

        scanner.close();
    }
    // instance method
    public void celsius(double c){
        System.out.println("The temperature in Celsius is:  " + c);


    }
}
