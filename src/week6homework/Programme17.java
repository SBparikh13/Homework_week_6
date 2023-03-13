package week6homework;

import java.util.Scanner;

/* Write a Java program to convert a decimal number to binary number.
Input Data: Input a Decimal Number : 5
 Expected Output Binary number is: 101
 */
public class Programme17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Decimal Number :");
        int d = scanner.nextInt();
        String b = Integer.toBinaryString(d);
        System.out.println("Expected output Binary number is :" + b);
        scanner.close();

    }
}
