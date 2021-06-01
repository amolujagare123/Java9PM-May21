package InheritanceDemo;

public class ClassA {

    void method1()
    {
        System.out.println("ClassA method");
    }
}

class ClassB extends ClassA
{
    void method1() // overriding
    {
        System.out.println("ClassB method");
        // different implementation
    }

    public static void main(String[] args) {

        /*ClassB ob = new ClassB();
        ob.method1();*/

        ClassA ob1 = new ClassB(); // upcasting
        ob1.method1();

        // overriden method must be called
        // through the reference variable of parent class
    }

}