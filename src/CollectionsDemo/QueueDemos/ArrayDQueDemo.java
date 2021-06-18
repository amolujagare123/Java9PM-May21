package CollectionsDemo.QueueDemos;

import java.util.ArrayDeque;

public class ArrayDQueDemo {

    public static void main(String[] args) {


        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.offer("amol");
        adq.offer("rani");
        adq.offer("sujata");
        adq.offer("arun");
        adq.offer("vaishali");

        System.out.println(adq);

        adq.offerFirst("first");
        adq.offerLast("last");

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);
    }


}
