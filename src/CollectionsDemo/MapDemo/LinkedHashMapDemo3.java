package CollectionsDemo.MapDemo;

import javafx.print.Collation;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo3 {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(101,"amol");
        lhm.put(501,"abhijit");
        lhm.put(111,"avinash");
        lhm.put(131,"john");
        lhm.put(441,"mithilesh");
        lhm.put(155,"omkar");
        lhm.put(156,"omkar");

        System.out.println("lhm="+lhm);

        Set keySet =   lhm.keySet();
        System.out.println("Key set = "+keySet);

        Collection values = lhm.values();
        System.out.println("values = "+values);

        Set entrySet = lhm.entrySet();
        System.out.println("entrySet = "+entrySet);

    }

}
