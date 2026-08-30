package day42;

//class Node{
//    int val;
//    Node next;
//
//    Node(int val){
//        this.val = val;
//    }
//}
public class DisplayList {

    public static void recursivly(Node head){

        Node t = head;
        if(t==null){
            return;
        }
        System.out.print(t.val + " ");
        t = t.next;
        recursivly(t);
    }

    public static void simpleDisplay(Node head){

        Node t = head;

        while (t!=null){
            System.out.print(t.val + " ");
            t = t.next;
        }
        System.out.println();
    }




    static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        recursivly(n1);
//        simpleDisplay(n1);
        System.out.println(get(n1,3));
    }

    public static int get(Node head, int idx) {
        Node t = head;
        int i =0;
        int uValue =0;


        while (i<=idx){

            if(i==idx){
                uValue =  t.val;
                break;
            }else{
                i++;
                t = t.next;
            }

        }
        return  uValue;
    }

}
