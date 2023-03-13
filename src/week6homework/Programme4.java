package week6homework;
/* Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme./**

 */
public class Programme4 {
    int a = 10;// instance variables
    int b = 20;// instance variables
    static int s = 30;// static variables
    static int p = 40;// static variables

   // instance method
    public void addition(){
        System.out.println(a);
        System.out.println(b);
        Programme4 obj = new Programme4();// called static variables in instance method
        int obj1 = s;// static variables in instance method
        int obj2 = p;//static variables in instance method
        System.out.println(obj1);
        System.out.println(obj2);
    }
    // static method
    public static void multiplication(){
        System.out.println(s);// static variable
        System.out.println(p);// static variable
        Programme4 obj = new Programme4();// calling instance variable in static method
        int obj3 = obj.a;
        int obj4 = obj.b;
        System.out.println(obj3);
        System.out.println(obj4);

    }
    // main method
    public static void main(String[] args) {
        multiplication();// called static method
        Programme4 obj = new Programme4();// called instance method
        obj.addition();
    }

}
