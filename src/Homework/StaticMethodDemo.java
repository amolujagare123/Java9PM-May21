package Homework;

public class StaticMethodDemo {
    String name;
    int rno;
    static String College="ITS";

    static void display()
    {
      //System.out.println("Name="+name);              //error
      //  System.out.println("rno="+rno);                //error
        System.out.println("College =" +College);
     //   method1();                                    //error
    }



    void method1()
    {
        display ();
        method2();

    }
    void method2()
    {
        display();
        System.out.println("name=" +name);
        System.out.println("Rno=" +rno);
        System.out.println("College="+College);

    }

    public static void main(String[] args) {
        StaticMethodDemo ob=new StaticMethodDemo();
        ob.display();
        StaticMethodDemo.display();
    }
}
