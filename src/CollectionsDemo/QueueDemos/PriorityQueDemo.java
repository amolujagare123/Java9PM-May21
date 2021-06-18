package CollectionsDemo.QueueDemos;

import java.util.PriorityQueue;

public class PriorityQueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(23);
        pq.offer(13);
        pq.offer(26);
        pq.offer(33);
        pq.offer(63);
        pq.offer(11);
            // 11,13,23,26,33,63
        System.out.println(pq);

        // some operating systems doesnt support priority queue
        // so we may not see the correct output displayed
        // but internally actually it is stored in acending order only
        System.out.println(pq.poll()); // 11
        System.out.println(pq.poll()); //13
        System.out.println(pq.poll()); // 23
        System.out.println(pq.poll()); //26
        System.out.println(pq.poll()); // 33
        System.out.println(pq.poll()); //63

    }
}
