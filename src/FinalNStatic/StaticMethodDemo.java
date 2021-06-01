package FinalNStatic;

public class StaticMethodDemo {

    String name;
    int rno;
    public static String college ="ITS";

    public static void display() // static method
    {
        //System.out.println("Name="+name);  // non static members are not allowed
       // System.out.println("Rno="+rno); // non static members are not allowed
        System.out.println("College="+college); // static members  allowed
       // method1(); // non static members are not allowed
    }

    void method1() // non static method
    {
        display();
        method2();
    }

    void method2() // non static method
    {
        display();
        System.out.println("Name="+name);
        System.out.println("Rno="+rno);
        System.out.println("College="+college);
    }

    public static void main(String[] args) {


        StaticMethodDemo ob = new StaticMethodDemo();
        ob.display();
        StaticMethodDemo.display();
    }
}
