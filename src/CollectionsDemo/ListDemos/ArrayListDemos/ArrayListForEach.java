package CollectionsDemo.ListDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListForEach {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("amol");
        al.add("abhijit");
        al.add("akshay");
        al.add("avinash");
        al.add("chetan");
        al.add("amol");
        al.add("mithilesh");
        al.add("Omkar");
        al.add("Hemangi");
        al.add("Sayli");
        al.add("Taarun");

        System.out.println(al);

        // for each --> data in sequencial format

        System.out.println("using for each loop");

        for (String str : al)
        {
            System.out.println(str);
        }





        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(23);
        al2.add(13);
        al2.add(24);
        al2.add(43);
        al2.add(26);
        al2.add(13);

        System.out.println(al2);
        System.out.println("using for each loop");

        /*for(int x:al2)
        {
            System.out.println(x);
        }*/

        for(Integer x:al2)
        {
            System.out.println(x);
        }


    }
}
