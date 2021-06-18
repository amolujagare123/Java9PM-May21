package CollectionsDemo.SetDemo;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

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
