package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("amol");
        al.add("abhijit");
        al.add("akshay");
        al.add("avinash");
        al.add("chetan");
        al.add("mithilesh");
        al.add("Omkar");
        al.add("Hemangi");
        al.add("Sayli");
        al.add("Taarun");
      //  System.out.println("al="+al);

       al.remove("amol");
        al.remove(5);
     //   System.out.println("al="+al);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(23);
        al2.add(13);
        al2.add(24);
        al2.add(43);
        al2.add(26);
        al2.add(13);

        System.out.println("al2="+al2);
       // al2.remove(3);

        //Integer ii = new Integer(43);

        al2.remove(new Integer(43));

         //  al2.remove(ii);

        System.out.println("al2="+al2);

        al2.clear();
        System.out.println("al2="+al2);

    }
}
