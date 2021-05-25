package ClassesConStriuctor;

public class CopyConstructor {

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

    CopyConstructor()
    {

    }

    CopyConstructor(CopyConstructor obj)
    {
               a = obj.a;
        d = obj.d;
        c = obj.c;
        str = obj.str;
    }


    public static void main(String[] args) {

        CopyConstructor ob = new CopyConstructor();
        ob.a = 20;
        ob.d = 4.5;
        ob.c = 'c';
        ob.str ="amol";
        ob.display();

        CopyConstructor ob1 = new CopyConstructor(ob);
        ob1.display();

    }

}
