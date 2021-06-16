package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIf {

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

        // remove all the elements which starts with a
        // str--> "amol";
        // REMOVE IF REMOVES ELEMENTS BASED ON SOME CONDITION

        // -> predicate symbol

       // al.removeIf(str -> (str.charAt(0) == 'a')  );

        al.removeIf(str -> (str.startsWith("a") )) ;

        System.out.println("al="+al);



    }
}
