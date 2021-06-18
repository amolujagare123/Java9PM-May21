package CollectionsDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> hs = new LinkedHashSet<>();

        hs.add("amol");
        hs.add("abhijit");
        hs.add("akshay");
        hs.add("avinash");
        hs.add("chetan");
        System.out.println(hs.add("amol"));
        hs.add("mithilesh");

        System.out.println( hs);

    }


}
