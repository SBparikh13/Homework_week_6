package week6homework;

import java.util.Scanner;

/* Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r)./**
*/
public class Programme6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// object of the scanner
        System.out.println("The radius is: ");
        int r = scanner.nextInt();
        double a = Math.PI * (r * r);
        Programme6 obj = new Programme6();// calling instance method to main
        obj.area(a);
        scanner.close();
    }
    // instance method
     public void area(double a){
        System.out.println("The area of circle is:  " + a);
     }

   }





