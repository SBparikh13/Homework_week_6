package week6homework;
/*  Write a Java program that takes three numbers as input to calculate and print the average of the numbers./**
 */

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        System.out.println("Enter z : ");
        int z = scanner.nextInt();
        System.out.println("The average of three number is: " + "= " + (x+y+z)/3);
        scanner.close();
    }
}
