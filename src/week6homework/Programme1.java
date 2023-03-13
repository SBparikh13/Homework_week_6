package week6homework;

/*1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.*/
public class Programme1 {
    // two instance variables//
    int a = 9;
    int b = 13;
    // instance method
    public void addition(){
        int ans = a+b;
        System.out.println(ans);
    }
    //  main method
    public static void main(String[] args) {
       Programme1 obj = new Programme1();// calling instance method in main method
       obj.addition();

    }


}
