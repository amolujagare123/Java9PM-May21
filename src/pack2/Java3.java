package pack2;

import pack1.Java1;

public class Java3 extends  Java1 {

    int a3;
    double d3;
    char c3;
    String str3; // data members

    void display3() // member function
    {
        System.out.println("a="+a3);
        System.out.println("d="+d3);
        System.out.println("c="+c3);
        System.out.println("str="+str3);
    }

    public static void main(String[] args)   {
        Java1 ob = new Java1();
        ob.a1 = 10;
      /*  ob.d1 = 9.9;
        ob.display1();*/

        Java3 ob3 = new Java3();
        ob3.a1 = 12;
        ob3.d1 = 3.4;
        ob3.display1();

       /* ob.a1 = 10;
        ob.d1 = 9.9;
        ob.c1 = 'l';
        ob.str1 = "amol";
        ob.display1();*/
    }

}
