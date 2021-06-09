package ExceptionHandlinDemo;

public class ArithmeticOP {

    public static void main(String[] args) {

        int a =10;
        int b = 0;

        int c = 0;

        try {
            c = a / b;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("inside finally");
        }



        System.out.println("c="+c);

        System.out.println("End of the program");


    }

}
