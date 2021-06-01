package MethodDemo;

public class ReturnMethods {

    int getIntValue()
    {
        System.out.println("I am inside:getIntValue");
        int a = 15;
        //return 10;
        return  a;
    }

    int[] getMyArray()
    {
        int[]  arr = {12,3,4,1,2,44};
        System.out.println("I set values");
        return arr;
    }

    String getMyString()
    {
        String s = "xyz";
        return  s;
    }

    public static void main(String[] args) {

        int a = 10;
        int x = a;
        System.out.println(x); // 10
        System.out.println(a); // 10

        ReturnMethods ob = new  ReturnMethods();
     int num = ob.getIntValue(); //--> 15
// When a method returns a value, it actually
// holds the value that it returns.
        System.out.println("num="+num);
        System.out.println("Using method call="+ob.getIntValue());


        System.out.println(ob.getMyString()); // xyz


       int[] xx = ob.getMyArray(); // array

        System.out.println("Array Below");
        for(int i=0;i<xx.length;i++)
            System.out.print(xx[i]+" ");
    }
}
