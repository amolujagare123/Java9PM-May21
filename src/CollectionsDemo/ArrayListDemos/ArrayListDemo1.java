package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

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
        al.add(12);
        al.add('h');
        al.add(true);
        al.add(1.1);

        System.out.println(al);

        /*System.out.println("Size="+al.size());

        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }*/

        Iterator itr = al.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
