package pack1;

public class Java1 {

    public int a1;
     protected double d1;
    private char c1;
    String str1; // data members

    protected void display1() // member function
    {
        System.out.println("a="+a1);
        System.out.println("d="+d1);
        System.out.println("c="+c1);
        System.out.println("str="+str1);
    }

    public static void main(String[] args)   {

        Java1 ob = new Java1();
        ob.a1 = 10;
        ob.c1 = 'l';
        ob.display1();
    }

}
