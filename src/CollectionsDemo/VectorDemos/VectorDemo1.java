package CollectionsDemo.VectorDemos;

import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("amol");
        v.add("abhijit");
        v.add("akshay");
        v.add("avinash");
        v.add("chetan");
        v.add("amol");
        v.add("mithilesh");

        System.out.println(v);

        Object[] vv = v.toArray();

        for(int i=0;i<vv.length;i++)
            System.out.println(vv[i]);



    }


}
