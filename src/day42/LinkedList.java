package day42;


//class Node{
//    int val;
//    Node next;
//
//    Node(int val){
//        this.val = val;
//    }
//}
public class LinkedList {
    static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

//        now here we are connecting the linkedList

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println(n1.next);
        System.out.println(n2);
//        how to print last

        System.out.println(n1.next.next.next.val);
    }
}
