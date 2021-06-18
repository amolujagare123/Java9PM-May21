package CollectionsDemo.SetDemo;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("amol");
        ts.add("abhijit");
        ts.add("akshay");
        ts.add("avinash");
        ts.add("chetan");
        System.out.println(ts.add("amol"));
        ts.add("mithilesh");

        System.out.println( ts);

    }


}
