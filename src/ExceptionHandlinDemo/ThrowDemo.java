package ExceptionHandlinDemo;

public class ThrowDemo {

    void checkNumber(int i) throws Exception // between 1-10
    {
       if(i<=10 && i>=1)
           System.out.println("we are safe");
       else
           throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) throws Exception {

        int a =11;

        ThrowDemo ob =new ThrowDemo();

        System.out.println("value of a="+a);

        ob.checkNumber(a);

        System.out.println("End of the program");

    }
}
