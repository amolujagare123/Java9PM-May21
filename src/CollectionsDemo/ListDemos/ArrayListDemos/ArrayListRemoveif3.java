package CollectionsDemo.ListDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveif3 {

    public static void main(String[] args) {

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(23);
        al2.add(13);
        al2.add(24);
        al2.add(43);
        al2.add(26);
        al2.add(13);

        System.out.println(al2);

        // 1.remove all the even numbers
        // 2. remove numbers greater than 20

      //  al2.removeIf(x -> x%2==0 );

        al2.removeIf( y -> y>20);

        System.out.println(al2);


    }
}
