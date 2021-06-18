package CollectionsDemo.MapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo2 {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        System.out.println(lhm.isEmpty()); // true

        lhm.put(101,"amol");
        lhm.put(501,"abhijit");
        lhm.put(111,"avinash");
        lhm.put(131,"john");
        lhm.put(441,"mithilesh");
        lhm.put(155,"omkar");
        lhm.put(156,"omkar");
        System.out.println(lhm.isEmpty()); //false

        System.out.println("size="+lhm.size());


        System.out.println("lhm="+lhm);


        System.out.println(lhm.get(441));

        lhm.remove(441);
        System.out.println("lhm="+lhm);


        System.out.println(lhm.containsKey(101));

        System.out.println(lhm.containsValue("omkar1"));

        lhm.clear();
        System.out.println(lhm);

    }

}
