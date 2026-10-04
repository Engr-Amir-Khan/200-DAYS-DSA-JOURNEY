package day65;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTraversal {
    public static void  display(Queue<Integer> q){
        for (int i = 0; i < q.size(); i++) {
            System.out.print(q.peek()+ " ");
            int r = q.remove();
            q.add(r);
        }
        System.out.println();
    }

    public  static  void addAtIndex(Queue<Integer>q , int idx, int value ){

        if(idx<0 || idx>q.size()){
            System.out.println("Invalid index");
            return;
        }

        int n = q.size();
        if(idx<n){
            for (int i = 1; i <= idx; i++) {
                q.add(q.remove());

            }
        }

        q.add(value);
        for (int i = 1; i <= n-idx; i++) {
            q.add(q.remove());
        }

    }

    public  static  int peek(Queue<Integer>q,  int idx){
        int n = q.size();
        for (int i = 1; i <=idx ; i++) {
            q.add(q.remove());
        }
        int ans =  q.peek();

        for (int i = 1; i <=n-idx ; i++) {
            q.add(q.remove());
        }
        return  ans;

    }

    public  static  int removeAtIndex(Queue<Integer>q, int idx){
        for (int i = 1; i <=idx ; i++) {
            q.add(q.remove());
        }
        int ans = q.remove();

        int n = q.size();
        for (int i = 1; i <=n-idx ; i++) {
            q.add(q.remove());
        }

        return  ans;
    }




    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);

        addAtIndex(q,6, 45);

        display(q);

        int r = peek(q, 5);
        System.out.println(r);
        display(q);
        int a = removeAtIndex(q,3);
        System.out.println(a);
        System.out.println();
        display(q);
    }
}
