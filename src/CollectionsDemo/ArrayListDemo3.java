package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {

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
        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList();
        System.out.println("al2="+al2);
        al2.addAll(al);
        System.out.println("al2="+al2);

    }
}
