package ExceptionHandlinDemo;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];


        try {
            a[0] = 4;
            a[1] = 4;
            a[2] = 4;
            a[3] = 4;
            a[4] = 4;
            a[5] = 4;
        }
        catch (Exception e)
        {
            System.out.println("Error msg="+e.getMessage());
            e.printStackTrace();
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("End of the program");




    }
}
