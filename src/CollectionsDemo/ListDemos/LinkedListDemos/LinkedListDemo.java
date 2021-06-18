package CollectionsDemo.ListDemos.LinkedListDemos;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("amol");
        ll.add("abhijit");
        ll.add("akshay");
        ll.add("avinash");
        ll.add("chetan");
        ll.add("mithilesh");
        ll.add("Omkar");
        ll.add("Hemangi");

        System.out.println(ll);

        ll.addFirst("first");
        ll.addLast("Last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
