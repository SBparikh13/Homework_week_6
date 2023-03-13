package week6homework;
/* Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme./**

 */
public class Programme3 {
    int a = 9;// instance variable
    static int b= 2;// static variable

   // instance method
    public void subtraction(){
        int ans = a-b;// called both variables in instance method
        System.out.println("subtraction is :  " + ans);

    }
    //  static method
    public static void multiplication(){
        Programme3 obj= new Programme3();// calling instance variable in static method.
        int ans = obj.a*obj.b;
        System.out.println("Multiplication is:  " + ans);
    }
    //  main method
    public static void main(String[] args) {
        Programme3 obj = new Programme3();// calling instance method in main method
        obj.subtraction();
        multiplication();// static method in main method

    }


    }


