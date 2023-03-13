package week6homework;
/* Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme/**

 */
public class Programme2 {
    // static variables
    static int a = 2;
    static int b = 5;

    // static method
    public static void multiplication(){
        int ans = a*b;// called both static variables in static method
        System.out.println("Multiplication is : =" + ans);
    }
    // main method
    public static void main(String[] args) {
        multiplication();// calling static method in main method

    }

}
