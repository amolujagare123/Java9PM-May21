package ClassesConStriuctor;

public class ClassDemo3 {

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

    ClassDemo3()
    {
        a =10;
        d =1.1;
        c ='a';
        str ="abcd";
    }


    public static void main(String[] args) {

        ClassDemo3 ob = new ClassDemo3();
        ob.display();

    }

}
