package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

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
       /* al.add(12);
        al.add('h');
        al.add(true);
        al.add(1.1);
*/
        System.out.println(al);

        //ArrayList<String> al2 = new ArrayList<String>();
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(23);
        al2.add(13);
        al2.add(24);
        al2.add(43);
        al2.add(26);
        al2.add(13);

        System.out.println(al2);


    }
}
