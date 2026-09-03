package day42;


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

    void addAtTail( int val){
        Node tempNode = new Node(val);

        if(tail==null){
            head = tempNode;
            tail = tempNode;
        }else{
            tail.next = tempNode;
            tail = tempNode;
        }

    }

    void addAtHead(int val){
        Node tempNode = new Node(val);

        if(head == null){
            head = tempNode;
            tail = tempNode;
        }else{
            tempNode.next = head;
            head = tempNode;
        }
    }

    void deleteAtHead(){
        if(head == null){
            System.out.print("can not deleted ");
            return;
        }
        head = head.next;
    }

    void display(){
        if(head==null) return;
        Node temp = head;

        while (temp!= null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}




public class OwnLinkedList {
    static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtHead(100);
        ll.addAtHead(10000);

//        ll.deleteAtHead();
//        ll.deleteAtHead();
        ll.display();
    }
}
