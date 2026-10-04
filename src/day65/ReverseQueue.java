package day65;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        System.out.println(q);


        Stack<Integer>st = new Stack<>();

        while (q.size()>0){
            st.push(q.remove());
        }
        System.out.println(q);


        while (st.size()>0){
            int top = st.pop();
            q.add(top);

        }
        System.out.println(q);




    }
}
