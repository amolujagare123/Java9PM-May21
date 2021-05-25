package pack1;

public class Java2 {

    int a2;
    double d2;
    char c2;
    String str2; // data members

    void display2() // member function
    {
        System.out.println("a="+a2);
        System.out.println("d="+d2);
        System.out.println("c="+c2);
        System.out.println("str="+str2);
    }

    public static void main(String[] args)   {

        Java1 ob = new Java1();
        ob.a1 = 10;
        ob.d1 = 9.9;
      ///  ob.c1 = 'l';
        ob.str1 = "amol";
        ob.display1();

    }

}
