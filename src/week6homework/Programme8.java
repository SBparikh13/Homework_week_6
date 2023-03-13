package week6homework;

import java.util.Scanner;

/* Write a program to calculate the area of a triangle./**
*/
// Area of triangle =b*h/2
public class Programme8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The height of the triangle : ");
        double h = scanner.nextDouble();
        System.out.println("The base of the triangle :  ");
        double b = scanner.nextDouble();
        System.out.println("The area of triangle is: " + b*h/2 );
        scanner.close();


    }
}
