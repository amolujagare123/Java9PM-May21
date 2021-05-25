package ClassesConStriuctor;

public class ParameterizedConstructorThis {

    int a;
    double d;
    char c;
    String str; // data members - class variables

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    ParameterizedConstructorThis(int a, double d, char c , String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }


    public static void main(String[] args) {

        ParameterizedConstructorThis ob = new ParameterizedConstructorThis(20,2.2,'g',"amol");
        ob.display();

    }

}
