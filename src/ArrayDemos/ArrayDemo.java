package ArrayDemos;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 11;
        a[1] = 15;
        a[2] = 16;
        a[3] = 98;
        a[4] = 12;

       // System.out.println(a[3]);

        int l = a.length;

        System.out.println("length of an array = "+ l);

        for(int i=0; i<5 ; i++)
        {
            System.out.println(a[i]);
        }

    }
}
