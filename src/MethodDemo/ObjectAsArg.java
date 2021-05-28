package MethodDemo;

import pack1.Java2;

public class ObjectAsArg {

    void setObject(Java2 obj)
    {
        obj.a2 = 5;
        obj.c2 = 'c';
        obj.d2 = 1.1;
        obj.str2 ="aaa";
    }

    public static void main(String[] args) {

        ObjectAsArg ob = new ObjectAsArg();

        Java2 j2 = new Java2();

        ob.setObject(j2);

        j2.display2();
    }
}
