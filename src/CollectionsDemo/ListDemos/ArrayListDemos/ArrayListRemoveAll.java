package CollectionsDemo.ListDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveAll {

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

        al2.add("amol");
        al2.add("avinash");
        al2.add("Hemangi");
        al2.add("Taarun");
        al2.add("amol1");
        al2.add("amol2");
        al2.add("amol3");
        al2.add("amol4");

        System.out.println("al2="+al2);

        al2.removeAll(al); // delete all the elements from al2 which are there in al
        System.out.println("al2="+al2);
    }
}
