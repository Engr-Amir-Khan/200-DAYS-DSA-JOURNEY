package day55;


class ListNode {
    int val;
    ListNode next;
    ListNode prev;

     ListNode(int val){
        this.val = val;
    }

}

class DLL{
    ListNode head;
    ListNode tail;
    int size;

    void insertAtHead(int val){
        ListNode temp = new ListNode(val);

        if(head==null){
            head = temp;
            tail = temp;

        }else{
            temp.next = head;
            head.prev = temp;
            head= temp;
        }
        size++;
    }

    void insertAtTail(int val ){
        ListNode temp = new ListNode(val);
        if(tail==null){
            head=temp;
            tail = temp;
        }else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(size==1){
            head=null;
            tail=null;
        }

        if(head== null) {
            System.out.println("Empty");
        }else{
            head = head.next;
            head.prev = null;

        }
        size--;
    }

    void deleteAtTail(){
        if(size==1){
            head=null;
            tail=null;
        }
        if(tail ==null){
            System.out.println("empty");
        }else{

            tail = tail.prev;
            tail.next = null;

        }
    }

    void display(){
        ListNode temp = head;

        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    void displayReverse(){
        ListNode temp = tail;

        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
    }

    void insert(int idx, int val){
        ListNode a = new ListNode(val);
        ListNode temp = head;

        if(idx<0 || idx>size){
            System.out.println("Can not be added");
            return;
        }

        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }

        for (int i = 1; i <=idx-1; i++) {
            temp = temp.next;
        }

        a.prev = temp;
        a.next = temp.next;
        temp.next = a;
        a.next.prev = a;
        size++;
    }

    void delete(int idx){
        ListNode temp = head;

        if(idx<0 || idx>size){
            System.out.println("Invalid index number");
            return;
        }

        if(idx==0){
            deleteAtHead();
            return;
        }

        if(idx==size){
            deleteAtTail();
            return;
        }

        for (int i = 1; i <=idx-1 ; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        temp.next.next.prev = temp.prev;
        size--;
    }

}

public class DoublyLinkedList {

    static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.display();
        System.out.println();
        list.displayReverse();
        list.deleteAtHead();
        System.out.println();
        list.display();
        list.deleteAtTail();
        System.out.println();
        list.display();
        list.insert(1,1000);
        System.out.println();
        list.display();
        System.out.println();
//        list.delete(2);
//        System.out.println();
//        list.display();

        list.insertAtTail(500);
        list.display();
        list.delete(2);
        System.out.println();
        list.display();
    }
}
