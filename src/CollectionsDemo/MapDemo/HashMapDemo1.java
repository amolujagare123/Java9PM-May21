package CollectionsDemo.MapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDemo1 {

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

        LinkedHashMap<Integer,String> lhm1 = new LinkedHashMap<>();

        System.out.println("lhm1="+lhm1);

        lhm1.putAll(lhm);

        System.out.println("lhm1="+lhm1);



    }

}
