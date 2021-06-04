package AbstractionDemo;

public interface InterfaceDemo {

    void run();
    void start(); //public

    default void display() // default method
    {
        System.out.println("display");
    }

    static void display1() // public method
    {
        System.out.println("display");
    }
    // all the public method in the interface are abstract only
    // default methods can have body in interface
}

class Child implements InterfaceDemo
{
    public void run()
    {
        System.out.println("run");
    }
    public void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        InterfaceDemo ob = new Child(); // upcasting

        ob.run();
        ob.run();
        ob.display();
        InterfaceDemo.display1();

    }
}
