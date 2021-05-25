package ClassesConStriuctor;

public class ParameterizedConstructor {

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

    ParameterizedConstructor(int x,double d1,  char cc ,String s)
    {
        a = x;
        d = d1;
        c = cc;
        str = s;
    }


    public static void main(String[] args) {

        ParameterizedConstructor ob = new ParameterizedConstructor(20,2.2,'g',"amol");
        ob.display();

    }

}
