package AbstractionDemo;

import pack1.Java1;

public interface InterfaceDemo2 {

    void run();
    void start(); //public

    default void display()
    {
        System.out.println("parent 1 display");
    }
}

interface  AnotherInterface
{
    default void display()
    {
        System.out.println("parent 2 display");
    }
}

class Child1 extends Java1 implements  InterfaceDemo2,AnotherInterface
{
    public void run()
    {
        System.out.println("run");
    }
    public void start()
    {
        System.out.println("start");
    }

   public void display()
    {
        System.out.println("display");
    }

    public static void main(String[] args) {

        Child1 ob = new Child1();
        ob.display();
    }
}
