package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(101,"amol");
        hm.put(501,"abhijit");
        hm.put(111,"avinash");
        hm.put(131,"john");
        hm.put(441,"mithilesh");
        hm.put(155,"omkar");
        hm.put(156,"omkar");
        hm.put(157,null);
        hm.put(158,null);

        hm.put(null,"vaihali");

        hm.put('g',123);
        hm.put(23.3,true);
        hm.put("abcd",'j');


        System.out.println(hm);

        System.out.println(hm.put(131,"Taarun"));

        System.out.println(hm);

        hm.put(null,"hemangi");

        System.out.println(hm);

    }

}
