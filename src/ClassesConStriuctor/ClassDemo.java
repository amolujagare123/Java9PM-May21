package ClassesConStriuctor;

public class ClassDemo {

    int a;
    double d;
    char c;
    String str; // data members

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

      /*  int x;
        x = 10 ;
        System.out.println(x);*/

        ClassDemo ob = new ClassDemo();
        ob.a = 20;
        ob.d = 4.5;
        ob.c = 'c';
        ob.str ="amol";
        ob.display();

        ClassDemo ob1 = new ClassDemo();
        ob1.a = 11;
        ob1.d = 11.11;
        ob1.c = 'r';
        ob1.str="selenium";

        ob1.display();


    }

}
