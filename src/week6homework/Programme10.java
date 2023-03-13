package week6homework;
/* Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data: Input a number: 13
Expected Output : 13 x 1 = 13
                  13 x 2 = 26
                  13 x 3 = 39...
                  13 x 10 = 130
 */

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num = scanner.nextInt();//num= 13
        System.out.println(num + "*" + 1 + "=" + (num));
        System.out.println(num + "*" + 2 + "=" + (num*2));
        System.out.println(num + "*" + 3 + "=" + (num*3));
        System.out.println(num + "*" + 4 + "=" + (num*4));
        System.out.println(num + "*" + 5 + "=" + (num*5));
        System.out.println(num + "*" + 6 + "=" + (num*6));
        System.out.println(num + "*" + 7 + "=" + (num*7));
        System.out.println(num + "*" + 8 + "=" + (num*8));
        System.out.println(num + "*" + 9 + "=" + (num*9));
        System.out.println(num + "*" + 10 + "=" + (num*10));

        scanner.close();

    }

}
