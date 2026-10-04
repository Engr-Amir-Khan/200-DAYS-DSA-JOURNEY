package day65;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
//        System.out.println(q);
//        q.remove();
//        System.out.println(q.peek());
//        System.out.println(q.size());

        while (q.size()!=0){
            int front = q.peek();
            System.out.println(front);
            q.remove();

        }
    }

}
