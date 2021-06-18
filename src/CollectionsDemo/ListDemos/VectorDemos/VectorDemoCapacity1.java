package CollectionsDemo.ListDemos.VectorDemos;

import java.util.Vector;

public class VectorDemoCapacity1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>(5,2);

        System.out.println("Capacity="+v.capacity()); // 5
        System.out.println("size="+v.size()); // 0

        v.add("amol");
        v.add("abhijit");
        v.add("akshay");
        v.add("avinash");
        v.add("chetan");
        v.add("amol");
        v.add("chetan");
        v.add("amol");


        System.out.println("Capacity="+v.capacity()); // 9
        System.out.println("size="+v.size()); // 8



    }


}
