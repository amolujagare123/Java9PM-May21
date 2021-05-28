package MethodDemo;

import java.util.Date;

public class MethodDemo1 {

    void getChar(char c)
    {
        System.out.println("char="+c);
    }

    void getString(String s)
    {
        System.out.println("String="+s);
    }

    void getDate(Date d)
    {
        System.out.println("Date="+d);
    }

    public static void main(String[] args) {
        MethodDemo1 ob = new MethodDemo1();
        ob.getChar('d');
        ob.getString("AMol");

        ob.getDate(new Date());

        Date date = new Date();
        ob.getDate(date);

    }

}
