package CollectionsDemo.ListDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIf2 {

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

        // remove all the elements whose length less than or equal to 5
        // str--> "amol";
        // REMOVE IF REMOVES ELEMENTS BASED ON SOME CONDITION
        // -> predicate symbol

        al.removeIf(str -> str.length() <= 5);
        System.out.println("al="+al);




    }
}
