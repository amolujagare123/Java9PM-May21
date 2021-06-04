package AbstractionDemo;

public abstract class Vehicle {

    public abstract void run();
    abstract void start();

    void display()
    {
        System.out.println("i am display");
    }

    /*public static void main(String[] args) {
        Vehicle ob =new Vehicle();
    }*/
}

class Bike extends Vehicle
{
    public void run()
    {
        System.out.println("run");
    }
   void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        Bike ob = new Bike();
        ob.run();
        ob.start();

       // Vehicle ob2 =new Vehicle();

        Vehicle ob1 = new Bike(); // upcasting
        ob1.run();
        ob1.start();
        ob1.display();
    }

}
