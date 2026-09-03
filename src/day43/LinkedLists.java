package day43;




class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class Linkedlist{
    Node head;
    Node tail;
    int size;

    void insertAtTail(int val){
        Node temp = new Node(val);
        if(tail==null){
            head = temp;
            tail = temp;

        }else{
            tail.next = temp;
            tail = temp;

        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            head = temp;
            tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insert(int val, int idx){
        if(idx<0 || idx>size){
            System.out.println("invalid inedex");
            return;
        }
        if(idx==0){
            insertAtHead(val);
        }else if(idx==size-1){
            insertAtTail(val);
        }else {

            Node temp = head;

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }

            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }


    }
    void delete( int idx){

        if(idx<0 || idx>=size){
            System.out.println("invalid index");
            return;
        }

        Node temp = head;

        for(int i=1; i<=idx-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

//        this mean we have deleted tail value
        if(idx == size-1){
            tail = temp;
        }
        size--;

    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("empty there is no element in linkedlist");
            return;
        }

        head = head.next;
        size--;

    }

    void display(){
        if(head==null){
            return;
        }

        Node temp = head;

        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

    }
}


public class LinkedLists {
    static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
//        ll.insertAtTail(10);
//        ll.display();
//        ll.insert(100,1);
        ll.insertAtHead(10);
        ll.insertAtHead(20);
        ll.insertAtTail(100);
        ll.insert(800,3);
//        ll.insert(900,6);
//        System.out.println(ll.size);
        ll.display();
        System.out.println();
        ll.delete(2);
        ll.display();
        ll.deleteAtHead();
        System.out.println();
        ll.display();
    }
}
