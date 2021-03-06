package CollectionsDemo.ListDemos.VectorDemos;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("amol");
        v.add("abhijit");
        v.add("akshay");
        v.add("avinash");
        v.add("chetan");
        v.add("amol");
        v.add("mithilesh");

        System.out.println(v);

        Iterator itr = v.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


        System.out.println("Using enumeration");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

    }


}
