package CollectionsDemo.VectorDemos;

import java.util.Vector;

public class VectorDemoCapacity2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>(5);

        System.out.println("Capacity="+v.capacity()); // 5
        System.out.println("size="+v.size()); // 0

        v.add("amol");
        v.add("abhijit");
        v.add("akshay");
        v.add("avinash");
        v.add("chetan");
        v.add("amol");


        System.out.println("Capacity="+v.capacity()); // 10
        System.out.println("size="+v.size()); // 6



    }


}
