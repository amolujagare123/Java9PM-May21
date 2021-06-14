package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        System.out.println(al.isEmpty()); // true

        al.add("amol");
        al.add("abhijit");
        al.add("akshay"); // 2
        al.add("avinash");
        al.add("chetan");
        al.add("mithilesh");
        al.add("Omkar");
        al.add("Hemangi");
        al.add("Sayli");
        al.add("Taarun");

        System.out.println(al.isEmpty()); // false
        System.out.println(al);
        al.set(2,"abc");
        System.out.println(al);

    }
}
