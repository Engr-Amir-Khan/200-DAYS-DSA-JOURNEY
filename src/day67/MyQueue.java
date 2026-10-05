package day67;


class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

public class MyQueue{

    Node head;
    Node tail;
    int size;

    int peek(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }

        int v = head.val;
        return v;
    }



    int remove(){
        if(size==0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int v = head.val;
        head = head.next;
        size--;
        return v;

    }

    void add(int val){
        Node temp = new Node(val);

        if(size==0){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }

        size++;


    }


    void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
