package ArrayDemos;

public class ArrayMethod2 {

    public static void main(String[] args) {

        int[] a = { 34, 5, 6 ,32, 56, 32, 1, 12, 0, 111} ;

        int l = a.length;
      //  System.out.println("a size = "+l);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");





        System.out.println();

        char[] ch = {'h','j','k','=','@','y','4','g'};

        for(int i=0; i < ch.length ; i++ )
            System.out.print(ch[i]+" ");

        System.out.println();
        String[] st = {"amol","Mitesh","Sayali","Akshay","Abhijeet","Tapasya"};

        for(int i=0;i<st.length ; i++)
            System.out.println(st[i]);


    }

}
