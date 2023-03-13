package week6homework;
/* Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data: Input first number: 125
Input second number: 24
Expected Output : 125 + 24 = 149
 125 - 24 = 101
 125 x 24 = 3000
 125 / 24 = 5
 125 mod 24 = 5/**
 */
import java.util.Scanner;

public class Programme18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        int a= scanner.nextInt();//a= 125
        System.out.println("Input second number:");
        int b = scanner.nextInt();//b = 24
        System.out.println("Expected output:" + a +"+"+ b +"="+ (a+b));
        System.out.println(a+"-"+ b +"="+ (a-b));
        System.out.println(a +"*"+ b +"="+(a*b));
        System.out.println(a + "/"+ b + "=" +(a/b));
        System.out.println(a + "mod" + b + "="+ (a%b));
        scanner.close();


    }
}
