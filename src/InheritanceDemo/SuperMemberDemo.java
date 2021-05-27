package InheritanceDemo;

public class SuperMemberDemo {

    String color = "Black" ;

    void display()
    {
        System.out.println("SuperMemberDemo display");
    }

    SuperMemberDemo()
    {
        System.out.println("SuperMemberDemo constructor");
    }

   SuperMemberDemo(int a)
    {
        System.out.println("a="+a);
        System.out.println("SuperMemberDemo constructor");
    }

}

class ChildMember extends  SuperMemberDemo
{
    void display()
    {
        System.out.println("ChildMember display");
    }

    ChildMember()
    {
        super(10);
        System.out.println("ChildMember constructor");
    }


    String color = "Blue";

    void printColor()
    {
        System.out.println("ChildColor="+color);
        System.out.println("SuperMemberDemo="+super.color);
        display();
        super.display();
    }

    public static void main(String[] args) {

        ChildMember ob = new ChildMember();
      //  ob.printColor();

    }

}
