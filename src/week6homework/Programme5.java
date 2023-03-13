package week6homework;

/* Write a program for a calculator with addition, subtraction, multiplication and
division methods all with parameters
 and use string concatenation methods.(Note: Two static and Two instance methods.)/**

 */
public class Programme5 {
    int a = 5;// Instance variable
    int b = 10;// instance variable

    // instance method
    public void addition(int a, int b){
        int ans = a+b;// called instance variable in instance method
        System.out.println("Addition is: = " + ans);
    }
    //instance method
    public void substarction(int b ,int a ){
        int ans = b-a;// called instance variable in instance method
        System.out.println("Substraction is: = " + ans);
    }
    // static method
    public static void multiplication(){
        Programme5 obj = new Programme5();// calling instance variable in static method
        int ans = obj.a * obj.b;
        System.out.println("Multiplication is : = " + ans);
    }
    //static method
    public static void division(){
        Programme5 obj = new Programme5();// calling instance variable in static method
        int ans = obj.b/ obj.a;
        System.out.println("Division is : = " + ans);
    }
    // main method
    public static void main(String[] args) {
        Programme5 obj = new Programme5();// calling instance method to main method
        obj.addition(5,10);
        obj.substarction(10,5);
        division();// calling static method to main method
        multiplication();

    }

}
