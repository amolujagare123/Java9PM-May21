package InheritanceDemo;

public class PolymorphismDemo {

    int a;
    int b;

    void addition()
    {
        int c = a +b;
        System.out.println("Addition="+c);
    }

    void addition(int x)
    {
        int c = x + x ;
        System.out.println("Addition="+c);
    }


    void addition(int x,int y) // parameters / method arguments
    {
        int c = x +y;
        System.out.println("Addition="+c);
    }

    void addition(int x,int y,int z)
    {
        int c = x +y +z;
        System.out.println("Addition="+c);
    }

    void addition(double x,double y)
    {
        double c = x +y;
        System.out.println("Addition="+c);
    }


    void addition(double x,double y,double z)
    {
        double c = x +y +z;
        System.out.println("Addition="+c);
    }

    void addition(String str1, String str2)
    {
        String c = str1 + str2 ;
        System.out.println("Addition="+c);
    }

    public static void main(String[] args) {

        PolymorphismDemo ob = new PolymorphismDemo();
        ob.a=1;
        ob.b=2;
        ob.addition();
        ob.addition(10,10);
        ob.addition(10,10,10);
        ob.addition(10.2,10.3);
        ob.addition(10.2,10.3,10.2);
        ob.addition("java","selenium");
    }
}
