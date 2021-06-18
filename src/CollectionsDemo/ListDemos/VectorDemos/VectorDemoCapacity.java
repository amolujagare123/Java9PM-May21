package CollectionsDemo.ListDemos.VectorDemos;

import java.util.Vector;

public class VectorDemoCapacity {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        System.out.println("Capacity="+v.capacity()); // 10
        System.out.println("size="+v.size()); // 0

        v.add("amol");
        v.add("abhijit");
        v.add("akshay");
        v.add("avinash");
        v.add("chetan");
        v.add("amol");
        v.add("mithilesh");
        v.add("chetan");
        v.add("amol");
        v.add("mithilesh");
        v.add("mithilesh");
        v.add("amol");
        v.add("abhijit");
        v.add("akshay");
        v.add("avinash");
        v.add("chetan");
        v.add("amol");
        v.add("mithilesh");
        v.add("chetan");
        v.add("amol");
        v.add("mithilesh");
        v.add("mithilesh");


        System.out.println("Capacity="+v.capacity()); // 20
        System.out.println("size="+v.size()); // 22



    }


}
